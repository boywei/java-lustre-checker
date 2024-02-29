package com.ecnu.synlong.common;

public enum SolverOption {
	BITWUZLA, CVC5, MATHSAT, SMTINTERPOL, YICES, YICES2, Z3;

	public static SolverOption getBySmtSolver(String smtSolver) {
		if(smtSolver == null) {
			return null;
		}
		for(SolverOption option : SolverOption.values()) {
			if(smtSolver.equals(option.toString())) {
				return option;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return name().toLowerCase();
	}
}
