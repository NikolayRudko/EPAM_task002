package com.epam.task.second.view;

import com.epam.task.second.data.ResultData;

public class ConsoleResultPrinter implements ResultPrinter {
    public void print(ResultData data) {
        switch (data.getType()) {
            case "New":
                printInNewLine(data.getRandomGeneratedArray());
                break;
            case "Line":
                printInLine(data.getRandomGeneratedArray());
                break;
            default:
                throw new IllegalArgumentException("Unknown data");
        }
    }

    private void printInNewLine(int[] array) {
        for (int item : array) {
            System.out.println(item);
        }
    }

    private void printInLine(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(i != array.length - 1 ? array[i] + " " : array[i]);
        }
    }
}
