package com.epam.task.second.logic;

import com.epam.task.second.entity.CustomData;

public class RandomArrayGenerator {
    public void generator(CustomData data) {
        int[] randomArray = new int[data.getSize()];
        final int MIN = 0;
        final int MAX = 10;

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = MIN + (int) (Math.random() * MAX);
        }

        data.setRandomGeneratedArray(randomArray);
    }
}
