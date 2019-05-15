package com.shoon.android_unittest_calculator;

public class Calculator {
    public Calculator(float fX, float fY, float fZ) {
        this.fX = fX;
        this.fY = fY;
        this.fZ = fZ;
    }

    private float fX,fY,fZ;
    private String strLog,strResult;

    public Calculator(){
        strLog="";
    }


    public void addSymbol(char chrX){
        switch (chrX){
            case 'C':
                strLog="";
                break;
            case '=':
                this.strResult=calculate( this.strLog );
                break;
            default:
                strLog+=chrX;
        }


    }

    private String calculate(String strLog){

        this.strLog=strLog;
        if(strLog.contains( "+" )){
            this.strResult=add("2","3" );
        }
        this.strResult=strLog;

        return this.strResult;

    }


    public String add(String strX,String strY){
        fX=Float.parseFloat( strX);
        fY=Float.parseFloat( strY);
        fZ=fX+fY;
        strResult=Float.toString( fZ );
        return strResult;
    }

    public String showLog(){
        return this.strLog;
    }
    public String showResult(){
        return this.strResult;
    }

}
