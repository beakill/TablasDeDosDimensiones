import java.util.Scanner;

public class Ejercicio15 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int sueldo,contadorSueldos=0,suma=0,contadorMayores1500=0;

        do {
            System.out.println("Introduce un sueldo: ");
            sueldo = entrada.nextInt();
            suma=suma+sueldo;
            if (sueldo>1500){
                contadorMayores1500++;
            }
            contadorSueldos++;
        }while(contadorSueldos<=50);
        System.out.println("La suma de los sueldos es: "+suma);
        System.out.println("Hay un total de "+contadorMayores1500+" sueldo/s mayor/es de 1500");
    }
}
