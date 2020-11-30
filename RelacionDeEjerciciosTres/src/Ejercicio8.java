import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int num,suma=0,contador=0;
        do {
            System.out.println("Introduce un número, porfavor: ");
            num= entrada.nextInt();
            suma=num+suma;
            contador++;
        }while(contador<15);
        System.out.println("La suma de todos los números es: " +suma);
    }
}
