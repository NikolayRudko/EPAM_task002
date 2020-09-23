package com.epam.task.second.entity;

public class CustomData {
    private String type;
    private int size;
    private int[] randomGeneratedArray;

    public CustomData(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getRandomGeneratedArray() {
        return randomGeneratedArray;
    }

    public void setRandomGeneratedArray(int[] randomGeneratedArray) {
        this.randomGeneratedArray = randomGeneratedArray;
    }

}
