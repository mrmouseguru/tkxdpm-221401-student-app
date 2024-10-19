package com.simple_test.student.usecase;

import java.util.ArrayList;
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
        List<GetStudentListOutputDTO> listDTO = new ArrayList<>();

        //chuyen list Student sang DTO
        for (Student student : list) {
            GetStudentListOutputDTO studentDTO = new GetStudentListOutputDTO
            (student.getHoTen(), student.getNgaySinh(), student.getDiaChi(),
            student.getNganh(), student.tinhDiemTB(), student.getHocLuc());

            listDTO.add(studentDTO);
        }

        getSLOutputBoundary.present(listDTO);
    }

}
