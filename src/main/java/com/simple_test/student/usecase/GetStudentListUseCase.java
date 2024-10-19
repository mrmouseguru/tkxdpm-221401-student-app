package com.simple_test.student.usecase;

import java.util.List;

import com.simple_test.student.entity.Student;

public class GetStudentListUseCase implements GetStudentListInpuBoundary {

    private GetStudentListOuputBoundary getSLOutputBoundary = null;
    private GetStudentListDatabaseBoundary getSLDatabaseBoundary = null;


    

    public GetStudentListUseCase(GetStudentListOuputBoundary getSLOutputBoundary,
            GetStudentListDatabaseBoundary getSLDatabaseBoundary) {
        this.getSLOutputBoundary = getSLOutputBoundary;
        this.getSLDatabaseBoundary = getSLDatabaseBoundary;
    }




    @Override
    public void execute() {
        //lay dan sanh sinh vien
        List<Student> list = getSLDatabaseBoundary.getStudentList();
        OutputData rsResult = new OutputData(list);

        getSLOutputBoundary.exportResult(rsResult);
    }

}
