package com.epam.task.second;

import com.epam.task.second.entity.CustomData;
import com.epam.task.second.logic.RandomArrayGenerator;
import com.epam.task.second.view.ConsolePrinter;

public class Main {
    public static void main(String[] args) {
        //input
        CustomData customData = new CustomData(args[0],Integer.parseInt(args[1]));


        //logic
        RandomArrayGenerator randomArrayGenerator = new RandomArrayGenerator();
         randomArrayGenerator.generator(customData);

        //output
        ConsolePrinter printer = new ConsolePrinter();
        printer.print(customData);

    }
}
