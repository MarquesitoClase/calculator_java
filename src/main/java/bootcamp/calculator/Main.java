package bootcamp.calculator;

import bootcamp.calculator.calculator.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int int1=1, int2=1, intRes=0, intRest=0;
        double d1=1.0, d2=1.0, dRes=0.0;
        System.out.println("Que desea hacer?"+
                                "\n1->Sumar dos enteros."+
                                "\n2->Restar 2 enteros."+
                                "\n3->Multiplicar 2 enteros."+
                                "\n4->Dividir dos enteros."+
                                "\n5->Sumar dos decimales."+
                                "\n6->Restar 2 decimales."+
                                "\n7->Multiplicar 2 decimales."+
                                "\n8->Dividir 2 decimales");

        int elec = scanner.nextInt();
        switch(elec){
            case 1:{
                System.out.println("Escriba el primer número entero:");
                int1 = scanner.nextInt();
                System.out.println("El entero a sumarle:");
                int2 = scanner.nextInt();
                System.out.println("El resultado es "+calculator.integerSum(int1, int2));
            }
            case 2:{
                System.out.println("Escriba el número entero que es el minuendo:");
                int1 = scanner.nextInt();
                System.out.println("El entero que es el sustraendo:");
                int2 = scanner.nextInt();
                intRes = calculator.integerSubtraction(int1, int2);
                System.out.println("El resultado es "+intRes);
            }
            case 3:{
                System.out.println("Escriba el primer factor:");
                int1 = scanner.nextInt();
                System.out.println("El segundo ahora:");
                int2 = scanner.nextInt();
                intRes = calculator.integerProduct(int1, int2);
                System.out.println("El resultado es "+intRes);
            }
            case 4:{
                System.out.println("Escriba el dividendo:");
                int1 = scanner.nextInt();
                System.out.println("ahora el divisor:");
                int2 = scanner.nextInt();
                intRes = calculator.integerDivision(int1, int2);
                System.out.println("El resultado de la division entera es "+intRes);
            }

            case 5:{
                System.out.println("La parte decimal con .(##.###)");
                System.out.println("Escriba el primer número a sumar:");
                d1 = scanner.nextDouble();
                System.out.println("El otro a sumarle:");
                d2 = scanner.nextDouble();
                dRes = calculator.doubleSum(d1, d2);
                System.out.println("El resultado es "+dRes);
            }
            case 6:{
                System.out.println("La parte decimal con .(##.###)");
                System.out.println("Escriba el número que es el minuendo:");
                d1 = scanner.nextDouble();;
                System.out.println("E que es el sustraendo:");
                d2 = scanner.nextDouble();;
                dRes = calculator.doubleSubtraction(d1, d2);
                System.out.println("El resultado es "+dRes);
            }
            case 7:{
                System.out.println("La parte decimal con .(##.###)");
                System.out.println("Escriba el primer factor:");
                d1 = scanner.nextDouble();
                System.out.println("El segundo ahora:");
                d2 = scanner.nextDouble();
                dRes = d1 * d2;
                System.out.println("El resultado es "+dRes);
            }
            case 8:{
                System.out.println("La parte decimal con .(##.###)");
                System.out.println("Escriba el dividendo:");
                d1 = scanner.nextDouble();
                System.out.println("ahora el divisor:");
                d2 = scanner.nextDouble();
                dRes = calculator.doubleDivision(d1, d2);
                System.out.println("El resultado de la division entera es "+dRes);
            }
        }
    }
}