import java.util.Scanner;

public class Ejercicio17 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int numSueldos, sueldo,maxSueldo=0,contador=0;

        System.out.println("¿Cuantos sueldos desea introducir?");
        numSueldos=entrada.nextInt();
        do {
            System.out.println("Introduce el sueldo");
            sueldo=entrada.nextInt();
            contador++;
            if (sueldo>maxSueldo){
                maxSueldo=sueldo;
            }
        }while(contador<numSueldos);
        System.out.println("El sueldo mayor introducido es: "+maxSueldo);

    }
}
