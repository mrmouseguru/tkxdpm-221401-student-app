package com.simple_test.student.ui;

import com.simple_test.student.usecase.GetStudentListInpuBoundary;

public class GetStudentListController {

    private GetStudentListInpuBoundary getStudentListInpuBoundary = null;

    public GetStudentListController(GetStudentListInpuBoundary getStudentListInpuBoundary) {
        this.getStudentListInpuBoundary = getStudentListInpuBoundary;
    }

    public void execute(){
        getStudentListInpuBoundary.execute();
    }
    

}
