import java.util.Scanner;
public class Ejercicio3Scanner {
    public static void main (String[] args){
        float notaUno, notaDos, notaTres, notaCuatro, promedio;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la primera nota");
        notaUno=entrada.nextFloat();

        System.out.println("Introduce la segunda nota");
        notaDos=entrada.nextFloat();

        System.out.println("Introduce la tercera nota");
        notaTres=entrada.nextFloat();

        System.out.println("Introduce la cuarta nota");
        notaCuatro=entrada.nextFloat();

        promedio = (notaUno+notaDos+notaTres+notaCuatro)/4;

        System.out.println("El promedio de la nota es: "+promedio);
    }
}
