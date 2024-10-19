package com.simple_test.caculator;



public class AddUseCaseControl {
    
    private ResponseData responseError = null;
    //fields
    private AddEntity addEntity = null;
    private AddUIConsoleOutput addUIConsoleOutput = null;

    //methods

    //constructor
    public AddUseCaseControl(){
        addUIConsoleOutput = new AddUIConsoleOutput();

    }

    public void execute(RequestData requestData) {
        //nhan 2 so
        String strNumber1 = requestData.strNumber1;
        String strNumber2 = requestData.strNumber2;
        //tham dinh
        if(this.isInteger(strNumber2) && this.isInteger(strNumber1)){
            //hợp lệ
        }else{
            //hông hjop lệ
            responseError = new ResponseData();
            responseError.content = "ERROR_INPUT";
            responseError.strNumber1 = strNumber1;
            responseError.strNumber2 = strNumber2;

            //addUIConsoleOutput.showError(responseError);

        }

        //so => messsage to Entity
        
        
    }


    public ResponseData getResponseError() {
        return responseError;
    }

    //ham tham dinh
    public  boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(str); // cố gắng chuyển chuỗi sang số nguyên
            return true; // nếu thành công thì chuỗi là số nguyên
        } catch (NumberFormatException e) {
            return false; // nếu có lỗi NumberFormatException thì không phải số nguyên
        }
    }

}
