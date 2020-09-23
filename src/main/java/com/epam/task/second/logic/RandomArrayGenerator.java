package com.epam.task.second.logic;

import com.epam.task.second.data.CustomData;
import com.epam.task.second.data.ResultData;

import java.util.ArrayList;
import java.util.List;

public class RandomArrayGenerator {
    public ResultData generateRandomArray(CustomData data) {

        List<Integer> list = new ArrayList<>();
        final int MIN = 0;
        final int MAX = 10;

        for (int i = 0; i < data.getSize(); i++) {
            int randomNumber = MIN + (int) (Math.random() * MAX);
            list.add(randomNumber);
        }

        return new ResultData(data.getType(), list);
    }
}
