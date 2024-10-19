package com.simple_test.student;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.simple_test.student.database.GetStudentListDAOMemory;
import com.simple_test.student.ui.GetStudentListPresenter;
import com.simple_test.student.usecase.GetStudentListInpuBoundary;
import com.simple_test.student.usecase.GetStudentListUseCase;

public class GetListStudent {

    @Test
    public void getStudentListOK() {

        GetStudentListPresenter presenter = new GetStudentListPresenter();
        GetStudentListDAOMemory datatest = new GetStudentListDAOMemory();
        GetStudentListInpuBoundary  input = new GetStudentListUseCase(presenter, 
        datatest);

        input.execute();

        assertEquals(4, presenter.getListStudentDTO().size());
        
    }

}
