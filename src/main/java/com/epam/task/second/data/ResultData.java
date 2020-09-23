package com.epam.task.second.data;

public class ResultData {
    private String type;
    private int[] randomGeneratedArray;

    public ResultData(String type, int[] randomGeneratedArray) {
        this.type = type;
        this.randomGeneratedArray = randomGeneratedArray;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int[] getRandomGeneratedArray() {
        return randomGeneratedArray;
    }

    public void setRandomGeneratedArray(int[] randomGeneratedArray) {
        this.randomGeneratedArray = randomGeneratedArray;
    }
}
