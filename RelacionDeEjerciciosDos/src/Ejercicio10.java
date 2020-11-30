import java.util.Scanner;

public class Ejercicio10 {
    public static void main (String [] args){
        int horas, minutos, segundos;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la hora: ");
        horas=entrada.nextInt();

        System.out.println("Introduce los minutos: ");
        minutos=entrada.nextInt();

        System.out.println("Introduce los segundos: ");
        segundos=entrada.nextInt();

        segundos++;
        if(segundos==60){
            minutos++;
            segundos=0;
            if (minutos==60){
                horas++;
                minutos=0;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }

        System.out.println("Son las "+horas+ ":"+minutos+":"+segundos);
    }
}
