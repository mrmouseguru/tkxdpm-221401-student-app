package com.simple_test.student.ui;

import com.simple_test.student.usecase.GetStudentListOuputBoundary;
import com.simple_test.student.usecase.OutputData;
import com.simple_test.student.usecase.ResponseData;

public class GetStudentListPresenter implements GetStudentListOuputBoundary {
    private OutputData outputData = null;
    @Override
    public void exportResult(ResponseData rsResult) {
        outputData = (OutputData)rsResult;
    }

    public OutputData getOutputData() {
        return outputData;
    }

}
