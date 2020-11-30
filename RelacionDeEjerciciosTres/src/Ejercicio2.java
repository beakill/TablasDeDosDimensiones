import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[]args){
        Scanner entrada =new Scanner(System.in);
        int num;

        System.out.println("Introduce un número: ");
        num= entrada.nextInt();

        while (num!=0){
            if (num<0){
                System.out.println("El número introducido es negativo");
            }else{
                System.out.println("El número introducido es positivo");
            }
            System.out.println("Introduce un número: ");
            num= entrada.nextInt();
        }
    }
}
