import java.util.Scanner;

public class Ejercicio18 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        String nombreAlumno,alumnoEdadMax="",alumnoEdadMin="";
        int edad,edadMaxima=0,edadMinima=0,contador=0;
        System.out.println("Introduce el nombre");
        nombreAlumno= entrada.nextLine();
        System.out.println("Introduce la edad");
        edad = entrada.nextInt();
        edadMinima=edad;
        while(contador<15){

            if (edad<edadMinima){
                edadMinima=edad;
                alumnoEdadMin=nombreAlumno;
            }else {
                if (edad>edadMaxima){
                    edadMaxima=edad;
                    alumnoEdadMax=nombreAlumno;
                }
            }
            System.out.println("Introduce el nombre");
            nombreAlumno= entrada.next();
            System.out.println("Introduce la edad");
            edad = entrada.nextInt();
            contador++;
        }
        System.out.println("El alumno de mayor edad es: "+alumnoEdadMax);
        System.out.println("El alumno de menor edad es: "+alumnoEdadMin);

    }
}
