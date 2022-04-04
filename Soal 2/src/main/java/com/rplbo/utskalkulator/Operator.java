package com.rplbo.utskalkulator;
public class Operator {

    private String operatorString;
    private String operatorSimbol;

    public Operator(String operatorString) {

        this.operatorString = operatorString;
        String str = operatorString.toLowerCase();
        if(str.equals("tambah")) {
            operatorSimbol = "+";
        }
        else if(str.equals("kurang")) {
            operatorSimbol = "-";
        }
        else if(str.equals("bagi")) {
            operatorSimbol = "/";
        }
        else if(str.equals("kali")) {
            operatorSimbol = "*";
        }
        else if(str.equals("pangkat")) {
            operatorSimbol = "^";
        }
    }

    public String getOperatorSimbol() {

        return operatorSimbol;
    }

}
