package com.ecnu.synlong.common;

import lombok.Data;

@Data
public class Output {
    private String result;

    public Output() {
    }

    public Output(String result) {
        this.result = result;
    }

    public String toString() {
        return result;
    }
}
