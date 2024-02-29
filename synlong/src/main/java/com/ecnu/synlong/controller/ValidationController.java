package com.ecnu.synlong.controller;

import com.ecnu.synlong.api.Kind2Api4Synlong;
import com.ecnu.synlong.common.CheckedEntity;
import com.ecnu.synlong.common.R;
import com.ecnu.synlong.common.SolverOption;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/kind2")
public class ValidationController {
	@PostMapping("/check")
	public R check(@RequestBody CheckedEntity checkedEntity) throws IOException {

//		String program = checkedEntity.getCode();
//		String smtSolver = checkedEntity.getSmtSolver();
//
//		Kind2Api4Synlong api = new Kind2Api4Synlong();
//		// 验证kind2是否可用
//		if (!api.checkKind2Available()) {
//			return R.error("Kind2 is not available!");
//		}
//		// 执行kind2对synlong进行验证
//		// 设置求解器
//		api.setSmtSolver(SolverOption.getBySmtSolver(smtSolver));
//		// 执行验证
//		String output = api.execute(program);
//		return R.ok().put("data", output);
		return R.ok().put("data", checkedEntity);
	}

	// TODO: 下载文件功能
	public R load() {
		return null;
	}
}
