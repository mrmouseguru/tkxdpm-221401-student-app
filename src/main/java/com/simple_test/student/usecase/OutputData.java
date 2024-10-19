package com.simple_test.student.usecase;

import java.util.List;

import com.simple_test.student.entity.Student;

public class OutputData implements ResponseData {
    private List<Student> listStudents = null;

    

    public OutputData(List<Student> listStudents) {
        this.listStudents = listStudents;
    }



    public List<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(List<Student> listStudents) {
        this.listStudents = listStudents;
    }

}
