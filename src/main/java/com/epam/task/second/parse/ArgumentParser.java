package com.epam.task.second.parse;

import com.epam.task.second.data.CustomData;
import com.epam.task.second.exception.MyException;

public interface ArgumentParser {
    public CustomData parse(String[] args) throws MyException;
}
