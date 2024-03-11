package com.ecnu.synlong.controller;

import com.ecnu.synlong.api.Kind2Api4Synlong;
import com.ecnu.synlong.common.CheckedEntity;
import com.ecnu.synlong.common.Output;
import com.ecnu.synlong.common.R;
import com.ecnu.synlong.common.SolverOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/kind2")
public class ValidationController {

	private Kind2Api4Synlong api;

	@Autowired
	public void setKind2Api(Kind2Api4Synlong api) {
		this.api = api;
	}

	@PostMapping(value = "/check")
	public R check(@RequestBody CheckedEntity checkedEntity) throws IOException {

		// lustre模型（包含约束条件
		String program = checkedEntity.getCode();
		String smtSolver = checkedEntity.getSmtSolver();
		// 执行kind2对synlong进行验证
		// 设置求解器
		api.setSmtSolver(SolverOption.getBySmtSolver(smtSolver));
		// 执行验证
		Output<String, Map<String, String>> output = api.execute(program);
		return R.ok().put("data", output);
	}

}
