package com.pluralsight;

public class JavaMain {
    public static void main(String []args) {

        // Creation d'une liste
        MathEquation[] equations = new MathEquation[4];
        equations[0] = CreateEquation(5,2, 'a');
        equations[1] = CreateEquation(3,2,'d');
        equations[2] = CreateEquation(3,2,'m');
        equations[3] = CreateEquation(3,2,'s');



        for (MathEquation equation : equations) {
            equation.Execute();
            System.out.print("Result : ");
            System.out.print(equation.get_result());
            System.out.print("\n");
        }
    }

    // On facilite la creation d'une instance
    public static MathEquation CreateEquation(double leftVal,
                                              double rightVal,
                                              char opCode)
    {
        MathEquation mathEquation = new MathEquation();
        mathEquation.set_rightVal(rightVal);
        mathEquation.set_leftVal(leftVal);
        mathEquation.set_opCode(opCode);
        return mathEquation;
    }
}
