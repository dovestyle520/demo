package com.marquess.demo.vo;

public class BaseReturnVO {
    int resCode;
    String resCodeDes;
    Object result;

    public int getResCode() {
        return resCode;
    }

    public void setResCode(int resCode) {
        this.resCode = resCode;
    }

    public String getResCodeDes() {
        return resCodeDes;
    }

    public void setResCodeDes(String resCodeDes) {
        this.resCodeDes = resCodeDes;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
