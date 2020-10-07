import java.util.Scanner;

public class Ejercicio7 {
    public static void main (String[]args){
        float nota;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la nota con decimales");
        nota = entrada.nextFloat();

        if (nota < 5) {
            System.out.println("Insuficiente");
        }
        else {
            if (nota < 6) {
                System.out.println("Suficiente");
            }
            else {
                if ( nota < 7) {
                    System.out.println("Bien");
                }
                else {
                    if (  nota < 9) {
                        System.out.println("Notable");
                    }
                    else{
                        if ( nota <= 10) {
                            System.out.println("Sobresaliente");
                        }
                    }
                }
            }

        }

    }
}
