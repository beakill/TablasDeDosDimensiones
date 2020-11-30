import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[]args){
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número positivo: ");
        num = entrada.nextInt();

       while(num>0){
           num=num*num;
           System.out.println("El cuadrado del número introducido es: "+num);
           System.out.print("Introduce un número positivo: ");
           num = entrada.nextInt();
       }
        System.out.print("El numero introducido es negativo");
    }
}
