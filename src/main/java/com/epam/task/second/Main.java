package com.epam.task.second;

import com.epam.task.second.data.CustomData;
import com.epam.task.second.data.ResultData;
import com.epam.task.second.exception.MyException;
import com.epam.task.second.logic.RandomArrayGenerator;
import com.epam.task.second.parse.ArgumentParser;
import com.epam.task.second.parse.ArgumentParserFactory;
import com.epam.task.second.view.ResultPrinter;
import com.epam.task.second.view.ResultPrinterFactory;

public class Main {
    public static void main(String[] args) throws MyException {

        //input
        ArgumentParserFactory argumentParserFactory = new ArgumentParserFactory();
        ArgumentParser argumentParser = argumentParserFactory.createArgumentParser();
        CustomData customData = argumentParser.parse(args);

        //logic
        RandomArrayGenerator randomArrayGenerator = new RandomArrayGenerator();
        ResultData resultData = randomArrayGenerator.generateRandomArray(customData);

        //output
        ResultPrinterFactory factory = new ResultPrinterFactory();
        ResultPrinter printer = factory.createResultPrinter();
        printer.print(resultData);
    }
}
