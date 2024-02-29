package com.ecnu.synlong.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CheckedEntity {

	@JsonProperty("selectedSolver")
	String smtSolver;

	String code;
}
