import java.util.Scanner;

public class Ejercicio10 {
    public static void main (String [] args){
        int horas, minutos, segundos;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la hora");
        horas=entrada.nextInt();

        System.out.println("Introduce los minutos");
        minutos=entrada.nextInt();

        System.out.println("Introduce los segundos");
        segundos=entrada.nextInt();

        if(segundos>=59){
            minutos++;
            segundos=00;
        }else{
            segundos++;
        }
            if (minutos>=59){
                horas++;
                minutos=00;
            }
                if (horas >24){
                    horas = 01;
                }



        System.out.println("Son las "+horas+ ":"+minutos+":"+segundos);
    }
}
