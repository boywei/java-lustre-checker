package com.ecnu.synlong.controller;

import com.ecnu.synlong.common.CheckParameter;
import com.ecnu.synlong.common.CheckResult;
import com.ecnu.synlong.common.CheckStatus;
import com.ecnu.synlong.common.ResultConvert;
import com.ecnu.synlong.service.LustreService;
import edu.uiowa.cs.clc.kind2.api.Kind2Api;
import edu.uiowa.cs.clc.kind2.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lustre")
public class LustreController {

    @Autowired
    private LustreService lustreService;

    @PostMapping(value = "/check")
    public ResponseEntity<String> check(@RequestBody CheckParameter checkParameter) {

        // lustre模型, 包含约束条件
        String program = checkParameter.getFile();

        Kind2Api api = new Kind2Api();
        Result result = api.execute(program);

        String resultString = ResultConvert.convertToString(result);
        // Check if the result object is initialized before printing it.
        if (result.isInitialized()) {
            System.out.println(resultString);
        }

        return new ResponseEntity<>(resultString, HttpStatus.OK);
    }

    @PostMapping(value = "/check-java")
    public ResponseEntity<String> checkByJKind(@RequestBody CheckParameter checkParameter) {

        // lustre模型, 包含约束条件
        String program = checkParameter.getFile();

        // 用program单独作为参数
        String[] args = new String[]{program};
        CheckResult<String> result = lustreService.check(args);

        if (result.getStatus() != CheckStatus.SUCCESS) {
            return new ResponseEntity<>(result.getMessage(), HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(result.getData(), HttpStatus.OK);
    }
}
