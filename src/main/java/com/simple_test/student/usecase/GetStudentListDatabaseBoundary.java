package com.simple_test.student.usecase;

import java.util.List;

import com.simple_test.student.entity.Student;

public interface GetStudentListDatabaseBoundary {

    List<Student> getStudentList();

}
