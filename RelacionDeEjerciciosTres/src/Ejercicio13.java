import java.util.Scanner;

public class Ejercicio13 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int contador =0, contadorCero=0,mediaPositivos=0,contadorPositivos=0,mediaNegativos=0,contadorNegativos=0,num;

        do {
            System.out.println("Introduce un número: ");
            num = entrada.nextInt();
            if (num ==0){
                contadorCero++;
            }else {
                if (num>=0){
                    mediaPositivos=num+mediaPositivos;
                    contadorPositivos++;

                }else{
                    mediaNegativos=num+mediaNegativos;
                    contadorNegativos++;
                }

            }
            contador++;
        }while (contador<=25);
        mediaPositivos=mediaPositivos/contadorPositivos;
        mediaNegativos=mediaNegativos/contadorNegativos;

        System.out.println("La media de los positivos es: "+mediaPositivos);
        System.out.println("La media de los negativos es: "+mediaNegativos);
        System.out.println("El número total de ceros introducidos es: "+contadorCero);
    }
}
