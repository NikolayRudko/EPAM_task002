package com.epam.task.second.parse;

import com.epam.task.second.data.CustomData;
import com.epam.task.second.data.ResultData;
import com.epam.task.second.exception.MyException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsoleArgumentParserTest {

    @Test
    public void testParseWhenDataCorrect() throws MyException {
        //given
        String[] input = new String[]{"New", "10"};
        CustomData actual = new CustomData("New", 10);

        //when
        ArgumentParser parser = new ConsoleArgumentParser();
        CustomData result = parser.parse(input);

        //then
        Assert.assertEquals(result, actual);
    }

    @Test(expected = MyException.class)
    public void testParseWhenIncorrectCountArgumentsLess() throws MyException {
        //given
        String[] input = new String[]{"New"};

        //when
        ArgumentParser parser = new ConsoleArgumentParser();
        CustomData result = parser.parse(input);

        //then

    }

    @Test(expected = MyException.class)
    public void testParseWhenIncorrectCountArgumentsMore() throws MyException {
        //given
        String[] input = new String[]{"New", "12", "3"};

        //when
        ArgumentParser parser = new ConsoleArgumentParser();
        CustomData result = parser.parse(input);

        //then
    }

    @Test(expected = NumberFormatException.class)
    public void testParseWhenTypeArguments() throws MyException {
        //given
        String[] input = new String[]{"New", "1g"};

        //when
        ArgumentParser parser = new ConsoleArgumentParser();
        CustomData result = parser.parse(input);

        //then
    }



}