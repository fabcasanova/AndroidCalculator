package com.phatsmalone.calculator;

public class Calculations {
    double val1, val2, result;
    public Calculations(double value1, double value2){

        this.val1 = value1;
        this.val2 = value2;
    }

    public void divide(){

        result = val1/val2;
    }
    public void add(){

        result = val1 + val2;
    }
    public void subtract(){

        result = val1 - val2;
    }
    public void multiply(){

        result = val1 * val2;
    }

    public double getResult(){

        return result;
    }
}
