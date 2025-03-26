package com.ecnu.synlong.common;

import lombok.Data;

@Data
public class CheckResult<T> {
	private CheckStatus status;
	private T data;
	private String message;

	public CheckResult(CheckStatus status, T data, String message) {
		this.status = status;
		this.data = data;
		this.message = message;
	}

	public CheckResult() {
	}

	public boolean isSuccessful() {
		return status == CheckStatus.SUCCESS;
	}

	public static <T> CheckResult<T> success(T data) {
		return new CheckResult<>(CheckStatus.SUCCESS, data, null);
	}

	public static <T> CheckResult<T> error(String message) {
		return new CheckResult<>(CheckStatus.ERROR, null, message);
	}
}
