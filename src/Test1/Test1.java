package Test1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Test1 {

    public Test1(){        
    }
    
    double divideByZero(int denominador) throws DiegoExcepcion {

        double result = 0;
        if (denominador == 0) {
            throw new DiegoExcepcion();
        }
        result = 25 / denominador;

        return result;
    }

    public static void main(String[] args) throws DiegoExcepcion {
        Test1 t1 = new Test1();
        Scanner read = new Scanner(System.in);
        System.out.println("Porfavor ingrse un numero");
        int denominador = 0;
        double resultado = 0;
        for (int i = 0; i < 5; i++) {
            denominador = read.nextInt();
            try {
                resultado = t1.divideByZero(denominador);
                System.out.println(resultado);
            } catch (ArithmeticException e) {
                e.printStackTrace();
            } catch(IllegalArgumentException e){
                System.out.println("Division por 0 imposible");
            } catch (DiegoExcepcion e){
                System.out.println("Error diego");
            }
        }
    }
}
