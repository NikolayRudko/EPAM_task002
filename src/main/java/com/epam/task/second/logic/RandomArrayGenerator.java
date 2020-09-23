package com.epam.task.second.logic;

import com.epam.task.second.data.CustomData;
import com.epam.task.second.data.ResultData;

public class RandomArrayGenerator {
    public ResultData generateRandomArray(CustomData data) {
        int[] randomArray = new int[data.getSize()];
        final int MIN = 0;
        final int MAX = 10;

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = MIN + (int) (Math.random() * MAX);
        }

        return new ResultData(data.getType(),randomArray);
    }
}
