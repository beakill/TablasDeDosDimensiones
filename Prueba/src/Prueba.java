import java.util.Scanner;
public class Prueba {
    public static void main (String[] args){
        Scanner entrada= new Scanner(System.in);

        System.out.println("Introduce el primer número");
        int num_uno=entrada.nextInt();
        System.out.println("Introduce el segundo número");
        int num_dos = entrada.nextInt();

        if(num_uno > num_dos){
            System.out.println("El primer numero es mayor que el segundo");

        }if (num_uno < num_dos){
            System.out.println("El segundo numero es mayor que el primero");
        }if (num_uno == num_dos){
            System.out.println("Los números son iguales");
        }
    }
}
