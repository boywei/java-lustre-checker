package com.ecnu.synlong.common;

public enum SolverOption {
	BITWUZLA, CVC5, MATHSAT, SMTINTERPOL, YICES, YICES2, Z3;

	@Override
	public String toString() {
		return name().toLowerCase();
	}
}
