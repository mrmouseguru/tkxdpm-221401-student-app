package com.simple_test.student.usecase;

import java.util.List;

public interface GetStudentListOuputBoundary {

    void exportResult(ResponseData rsResult);

    void present(List<GetStudentListOutputDTO> listDTO);



}
