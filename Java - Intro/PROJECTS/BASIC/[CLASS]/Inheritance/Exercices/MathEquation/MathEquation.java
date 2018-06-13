package com.pluralsight;

public class MathEquation {

    private double leftVal;
    public double get_leftVal(){ return this.leftVal; }
    public void set_leftVal(double leftVal){ this.leftVal = leftVal; }

    private double rightVal;
    public double get_rightVal(){ return this.rightVal; }
    public void set_rightVal(double rightVal){ this.rightVal = rightVal; }

    private double result;
    public double get_result(){ return this.result; }
    public void set_result(double result){ this.result = result; }

    private char opCode;
    public char get_opCode(){ return opCode; }
    public void set_opCode(char opCode){ this.opCode = opCode; }


    public void Execute(){
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            default:
                System.out.print("Invalid input");
                result = 0.0d;
                break;
        }
    }

}
