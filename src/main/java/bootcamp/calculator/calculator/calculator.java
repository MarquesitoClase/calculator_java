package bootcamp.calculator.calculator;

public abstract class calculator {
    public  static int integerSum(int op1, int op2){
        return op1+op2;
    }

    public static int integerSubtraction(int op1, int op2){
        return op1-op2;
    }

    public static int integerProduct(int op1, int op2){
        return op1*op2;
    }

    public static int integerDivision(int op1, int op2){
        int resto = op1%op2;
        if(resto!=0) System.out.println("Nos queda de resto: " + resto);
        return op1/op2;
    }


    public  static double doubleSum(double op1, int op2){
        return op1+op2;
    }

    public static double doubleSubtraction(int op1, int op2){
        return op1-op2;
    }

    public static double doubleProduct(int op1, int op2){
        return op1*op2;
    }

    public static double doubleDivision(double op1, double op2){
        return op1/op2;
    }
}