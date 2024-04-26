package com.ecnu.synlong.controller;

import com.ecnu.synlong.api.Api;
import com.ecnu.synlong.api.Api2;
import com.ecnu.synlong.common.CheckedEntity;
import com.ecnu.synlong.common.Output;
import com.ecnu.synlong.common.R;
import com.ecnu.synlong.common.SolverOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/synlong")
public class ValidationController {

	private Api api;

	private Api2 api2;

	@Autowired
	public void setApi2(Api2 api2) {
		this.api2 = api2;
	}

	@Autowired
	public void setApi(Api api) {
		this.api = api;
	}

	@PostMapping(value = "/check")
	public R check(@RequestBody CheckedEntity checkedEntity) throws IOException {

		// lustre模型（包含约束条件
		String program = checkedEntity.getCode();
		String smtSolver = checkedEntity.getSmtSolver();
		// 设置求解器
		api.setSmtSolver(SolverOption.getBySmtSolver(smtSolver));
		// 执行验证
		Output<String, Map<String, String>> output = api.execute(program);
		return R.ok().put("data", output);
	}

	@PostMapping(value = "/check2")
	public String check2(@RequestBody CheckedEntity checkedEntity) throws IOException {

		// lustre模型（包含约束条件
		String program = checkedEntity.getCode();
		String smtSolver = checkedEntity.getSmtSolver();
		// 设置求解器
		api.setSmtSolver(SolverOption.getBySmtSolver(smtSolver));
		// 执行验证
        return api2.execute(program);
	}
}
