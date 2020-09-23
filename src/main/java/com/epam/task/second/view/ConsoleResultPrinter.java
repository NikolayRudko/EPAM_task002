package com.epam.task.second.view;

import com.epam.task.second.data.ResultData;

import java.util.List;

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

    private void printInNewLine(List<Integer> list) {
        for (int item : list) {
            System.out.println(item);
        }
    }

    private void printInLine(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                System.out.print(list.get(i) + " ");
            }
            System.out.print(list.get(i));
        }
    }
}
