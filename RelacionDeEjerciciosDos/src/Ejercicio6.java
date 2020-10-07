import java.util.Scanner;

public class Ejercicio6 {
    public static void main (String[] args){
        int numUno, numDos;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        numUno = entrada.nextInt();

        System.out.println("Introduce el segundo número");
        numDos = entrada.nextInt();

        if(numUno > numDos){
            System.out.println("El primer número es mayor que el segundo");
        }else {
            if(numDos > numUno) {
                System.out.println("El segundo número es mayor que el primero");
            }
            else{
                System.out.println("Los números son iguales");
            }
        }
    }
}
