package com.company;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;
    public double getFirstNumber(){
        return this.firstNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }
    public void setFirstNumber(double n){
        this.firstNumber=n;
    }
    public void setSecondNumber(double n){
        this.secondNumber=n;
    }
    public double getAdditionResult(){
        return getFirstNumber() + getSecondNumber();
    }
    public double getSubtractionResult(){
        return getFirstNumber() - getSecondNumber();
    }
    public double getMultiplicationResult(){
        return getFirstNumber() * getSecondNumber();
    }
    public double getDivisionResult(){
        if(getSecondNumber()==0){
            return 0;
        }
        return getFirstNumber() / getSecondNumber();
    }
}
