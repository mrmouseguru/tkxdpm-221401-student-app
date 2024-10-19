package com.simple_test.student.ui;

import java.util.List;

import com.simple_test.student.usecase.GetStudentListOuputBoundary;
import com.simple_test.student.usecase.GetStudentListOutputDTO;
import com.simple_test.student.usecase.ResponseData;

public class GetStudentListPresenter implements GetStudentListOuputBoundary {

    private List<GetStudentListOutputDTO> listStudentDTO = null;

    
    

    @Override
    public void present(List<GetStudentListOutputDTO> listDTO) {
        this.listStudentDTO = listDTO;
        GetStudentListForm form = new GetStudentListForm();
        form.createAndShowGUI(listDTO);
    }

    @Override
    public void exportResult(ResponseData rsResult) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exportResult'");
    }

    public List<GetStudentListOutputDTO> getListStudentDTO() {
        return listStudentDTO;
    }

}
