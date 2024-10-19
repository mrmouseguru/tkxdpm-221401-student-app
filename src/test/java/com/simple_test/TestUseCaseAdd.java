package com.simple_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.simple_test.caculator.AddUseCaseControl;
import com.simple_test.caculator.RequestData;

public class TestUseCaseAdd {

    @Test
    public void addError() {

        RequestData requestData = new RequestData();
        requestData.strNumber1 = "2";
        requestData.strNumber2 = "a";

        AddUseCaseControl addUseCaseControl = new AddUseCaseControl();
        addUseCaseControl.execute(requestData);

        assertEquals("ERROR_INPUT", addUseCaseControl.getResponseError().content);



        
    }

}
