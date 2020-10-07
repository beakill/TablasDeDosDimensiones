import java.util.Scanner;
public class Ejercicio4 {
    public static void main (String [] args){
       int numUno, numDos;
       Scanner entrada = new Scanner(System.in);

       System.out.println("Introduce el primer número");
       numUno = entrada.nextInt();

       System.out.println("Introduce el segundo número");
       numDos = entrada.nextInt();

       if( numUno==numDos){
           System.out.println("Los números son iguales");
       }else{
           System.out.println("Los números son diferentes");
       }

    }
}
