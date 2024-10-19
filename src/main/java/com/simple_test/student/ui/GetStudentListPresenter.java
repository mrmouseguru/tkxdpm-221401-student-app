package com.simple_test.student.ui;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.simple_test.student.usecase.GetStudentListOuputBoundary;
import com.simple_test.student.usecase.GetStudentListOutputDTO;
import com.simple_test.student.usecase.ResponseData;

public class GetStudentListPresenter implements GetStudentListOuputBoundary {

    private List<GetStudentListOutputDTO> listStudentDTO = null;
    private List<GetStudentListViewModel> listViewModels = null;
    private static final SimpleDateFormat dateFormat = 
    new SimpleDateFormat("dd/MM/yyyy");

    
    

    @Override
    public void present(List<GetStudentListOutputDTO> listDTO) {
        listViewModels = new ArrayList<>();
        this.listStudentDTO = listDTO;
        int index = 1;
        for (GetStudentListOutputDTO studentDTO : listDTO) {
            String hocLuc = studentDTO.getHocLuc();
            Color color = Color.BLACK;
            boolean bold = false;
            boolean italic = false;

             // Set style based on "Học lực"
             switch (hocLuc) {
                case "Yếu":
                    color = Color.RED;
                    break;
                case "Xuất sắc":
                    bold = true;
                    italic = true;
                    break;
                case "Giỏi":
                    bold = true;
                    break;
                default:
                    break;
            }

            String stt = String.valueOf(index++);
            String ngaySinh = dateFormat.format(studentDTO.getNgaySinh());
            String diemTB = String.format("%.1f", studentDTO.getDiemTB());

            GetStudentListViewModel viewModel = new GetStudentListViewModel
            
            (stt, studentDTO.getHoTen(),
                    studentDTO.getDiaChi(), ngaySinh, diemTB, studentDTO.getHocLuc(), studentDTO.getNganh(), color,
                    bold, italic);

            listViewModels.add(viewModel);
        }

        GetStudentListForm form = new GetStudentListForm();
        form.createAndShowGUI3(listViewModels);
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
