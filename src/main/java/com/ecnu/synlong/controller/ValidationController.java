package com.ecnu.synlong.controller;

import com.ecnu.synlong.api.Kind2Api4Synlong;
import com.ecnu.synlong.common.CheckedEntity;
import com.ecnu.synlong.common.Output;
import com.ecnu.synlong.common.R;
import com.ecnu.synlong.common.SolverOption;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/kind2")
public class ValidationController {
	@PostMapping(value = "/check")
	public R check(@RequestBody CheckedEntity checkedEntity) throws IOException {

		// lustre模型（包含约束条件的
		String program = checkedEntity.getCode();
		String smtSolver = checkedEntity.getSmtSolver();
		Kind2Api4Synlong api = new Kind2Api4Synlong();
		// 执行kind2对synlong进行验证
		// 设置求解器
		// TODO 该操作会传入错误的api.smtSolver
		api.setSmtSolver(SolverOption.getBySmtSolver(smtSolver));
		// 执行验证
		List<String> output = api.execute(program);
		for (String s:output) {
			System.out.println(s);
		}
		return R.ok().put("data", output);
//		return R.ok().put("data", checkedEntity);
	}

	// TODO: 下载文件功能
	public R load() {
		return null;
	}
}
