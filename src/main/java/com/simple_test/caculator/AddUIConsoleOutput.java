package com.simple_test.caculator;



import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class AddUIConsoleOutput {

    // fields

    private PrintWriter stdOut = null;

    AddUIConsoleOutput() {
        stdOut = new PrintWriter(new OutputStreamWriter(System.out));
    }

    //interface - visible
    public void showError(ResponseData responseData) {
        error(responseData);
    }


    //implementataion
    private void error(ResponseData responseData) {
        stdOut.print(responseData.content);
        stdOut.println(responseData.strNumber1);
        stdOut.println(responseData.strNumber2);

        stdOut.flush();
    }

}
