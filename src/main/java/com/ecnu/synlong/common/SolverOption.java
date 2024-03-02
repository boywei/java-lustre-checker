package com.ecnu.synlong.common;

public enum SolverOption {
	BITWUZLA, CVC5, MATHSAT, SMTINTERPOL, YICES, YICES2, Z3;

	public static SolverOption getBySmtSolver(String smtSolver) {
		if(smtSolver == null) {
			System.out.println("null是从这返回的");
			return null;
		}
		for(SolverOption option : SolverOption.values()) {
			if(smtSolver.equalsIgnoreCase(option.toString())) {
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
