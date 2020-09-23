package com.epam.task.second.view;

public class ResultPrinterFactory {
    public ResultPrinter createResultPrinter(){
        return new ConsoleResultPrinter();
    }
}
