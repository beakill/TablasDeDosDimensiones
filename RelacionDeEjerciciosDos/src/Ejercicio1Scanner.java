import java.util.Scanner;
public class Ejercicio1Scanner {
    public static void main(String[]args){
        int numUno, numDos, suma;
        Scanner entrada = new Scanner (System.in);

        System.out.println("Introduce el primer número");
        numUno = entrada.nextInt();

        System.out.println("Introduce el segundo número");
        numDos = entrada.nextInt();

        suma = numUno + numDos;

        System.out.println("El resultado de la suma es: "+suma);
    }
}
