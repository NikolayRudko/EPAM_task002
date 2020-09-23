package com.epam.task.second.parse;

import com.epam.task.second.data.CustomData;
import com.epam.task.second.exception.MyException;

public class ConsoleArgumentParser implements ArgumentParser {
    @Override
    public CustomData parse(String[] args) throws MyException {
        if (args.length != 2) {
            throw new MyException("Broke data!");
        }

        int countNumbers = 0;

        try {
            countNumbers = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        if (countNumbers<0){
            throw new MyException("Broke data!");
        }

        return new CustomData(args[0], countNumbers);
    }
}
