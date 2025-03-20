package com.ecnu.synlong.controller;

import com.ecnu.synlong.common.CheckParameter;
import com.ecnu.synlong.common.R;
import edu.uiowa.cs.clc.kind2.api.Kind2Api;
import edu.uiowa.cs.clc.kind2.results.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lustre")
public class LustreController {

    @PostMapping(value = "/check")
    public R check(@RequestBody CheckParameter checkParameter) {

        // lustre模型, 包含约束条件
        String program = checkParameter.getFile();

        Kind2Api api = new Kind2Api();
        Result result = api.execute(program);

        // Check if the result object is initialized before printing it.
        if (result.isInitialized()) {
            System.out.println(result);
        }

        return R.ok().put("data", result.toString());
    }
}
