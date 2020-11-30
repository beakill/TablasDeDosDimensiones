import java.util.Scanner;

public class Ejercicio14 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int num, suceccionFibonacci=1,num1=0,num2=1;

        System.out.println("Introduce un número: ");
        num= entrada.nextInt();
        System.out.print(num1+" ");
        while (suceccionFibonacci<=num){
            System.out.print(" "+suceccionFibonacci+" ");
            suceccionFibonacci=num1+num2;
            num1=num2;
            num2=suceccionFibonacci;
        }
    }
}
