package com.ecnu.synlong.controller;

import com.ecnu.synlong.api.Kind2Api4Synlong;
import com.ecnu.synlong.common.R;
import com.ecnu.synlong.common.SolverOption;
import com.ecnu.synlong.common.ValidationResult;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping
public class ValidationController {
	@PostMapping("/check/{smtSolver}")
	public R check(@RequestBody String program, @PathVariable("smtSolver") SolverOption smtSolver) throws IOException {

		Kind2Api4Synlong api = new Kind2Api4Synlong();
		// 验证kind2是否可用
		if (!api.checkKind2Available()) {
			return R.error("Kind2 is not available!");
		}
		// 执行kind2对synlong进行验证
		// 设置求解器
		api.setSmtSolver(smtSolver);
		// 执行验证
		ValidationResult validationResult = api.execute(program);
		return R.ok().put("validationResult", validationResult);
	}

	// TODO: 下载文件功能
	public R load() {
		return null;
	}
}
