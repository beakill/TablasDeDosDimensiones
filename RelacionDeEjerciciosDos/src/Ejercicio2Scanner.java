import java.util.Scanner;
public class Ejercicio2Scanner {
    public static void main (String[]args){
        float base, altura, area;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la base");
        base = entrada.nextFloat();

        System.out.println("Introduce la altura");
        altura = entrada.nextFloat();

        area = base * altura/2;

        System.out.println("El área del triangulo es: "+area);
    }
}
