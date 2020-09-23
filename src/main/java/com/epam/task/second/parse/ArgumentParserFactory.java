package com.epam.task.second.parse;

public class ArgumentParserFactory {
    public ArgumentParser createArgumentParser(){
        return new ConsoleArgumentParser();
    }
}
