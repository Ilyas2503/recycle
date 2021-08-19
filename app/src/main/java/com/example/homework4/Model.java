package com.example.homework4;

public class Model {

    private String FirstNum;
    private String textBlank;
    private String textTaylor;
    private String SecondNum;


    public Model(String num, String blank, String taylor, String num2) {
        this.FirstNum = num;
        this.textBlank = blank;
        this.textTaylor = taylor;
        this.SecondNum = num2;
    }

    public String getNum() {
        return FirstNum;
    }

    public void setNum(String num) {
        this.FirstNum = num;
    }

    public String getBlank() {
        return textBlank;
    }

    public void setBlank(String blank) {
        this.textBlank = blank;
    }

    public String getTaylor() {
        return textTaylor;
    }

    public void setTaylor(String taylor) {
        this.textTaylor = taylor;
    }

    public String getNum2() {
        return SecondNum;
    }

    public void setNum2(String num2) {
        this.SecondNum = num2;
    }
}
