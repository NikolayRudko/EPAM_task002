package com.epam.task.second.data;

import java.util.List;

public class ResultData {
    private String type;
    private List<Integer> randomGeneratedArray;

    public ResultData(String type, List<Integer> randomGeneratedArray) {
        this.type = type;
        this.randomGeneratedArray = randomGeneratedArray;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Integer> getRandomGeneratedArray() {
        return randomGeneratedArray;
    }

    public void setRandomGeneratedArray(List<Integer> randomGeneratedArray) {
        this.randomGeneratedArray = randomGeneratedArray;
    }
}
