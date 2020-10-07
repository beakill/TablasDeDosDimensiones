import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String[]args){
        int numUno, numDos;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        numUno = entrada.nextInt();

        System.out.println("Introduce el segundo número");
        numDos = entrada.nextInt();

        if (numUno%numDos==0){
            System.out.println("El primer número es multiplo del segundo");
        }if(numDos%numUno==0){
            System.out.println("El segundo numero es multiplo del primero");
        }else{
            System.out.println("Los números no son multiplos");
        }
    }
}
