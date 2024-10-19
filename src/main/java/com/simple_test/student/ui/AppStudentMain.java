package com.simple_test.student.ui;

import com.simple_test.student.database.GetStudentListDAOMemory;
import com.simple_test.student.usecase.GetStudentListUseCase;

public class AppStudentMain {

    public static void main(String[] args) {

        GetStudentListDAOMemory databaseMemory = new GetStudentListDAOMemory();
        GetStudentListPresenter presenter = new GetStudentListPresenter();

        GetStudentListUseCase useCase = new GetStudentListUseCase
        (presenter, databaseMemory);

        GetStudentListController getStudentListController = 
        new GetStudentListController(useCase);
        
        getStudentListController.execute();
        
    }

}
