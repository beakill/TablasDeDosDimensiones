import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        char letraGrupo;
        int numAlumno=0,contadorSuspensos=0;
        String nombreAlumno="", alumnoMayorMedia="";
        float nota1=0.0F, nota2=0.0F, nota3=0.0F,media=0.0F,mayorMedia=-1.0F;
        boolean mediaMayorNueve=false;

        System.out.println("Introduce la letra del grupo: ");
        letraGrupo=entrada.nextLine().charAt(0);

        switch (letraGrupo){
            case 'A':
            case 'a':    {
                numAlumno=25;
                break;
            }
            case 'B':
            case 'b':{
                numAlumno=28;
                break;
            }
            case 'C':
            case 'c':{
                numAlumno=31;
                break;
            }
            case 'D':
            case 'd':{
                numAlumno=29;
                break;
            }
            default:{
                System.out.println("Grupo incorrecto!");
                numAlumno=0;

            }
        }
        for (int i=0; i<numAlumno;i++){
            System.out.print("Introduce el nombre del alumno: ");
            nombreAlumno=entrada.next();
            System.out.println("Introduce la nota del primer parcial: ");
            nota1= entrada.nextFloat();
            System.out.println("Introduce la nota del segundo parcial: ");
            nota2= entrada.nextFloat();
            System.out.println("Introduce la nota del tercer parcial: ");
            nota3= entrada.nextFloat();

            media=(nota1+nota2+nota3)/3;
            if (media<5){
                contadorSuspensos++;
            }
            if (media>mayorMedia){
                mayorMedia=media;
                alumnoMayorMedia=nombreAlumno;
            }
            if (media >=9){
                mediaMayorNueve=true;
            }
        }

        System.out.println("Hay "+contadorSuspensos+" alumno/s con la media suspensa");
        System.out.println("La mayor media es: "+mayorMedia+ " del alumno "+alumnoMayorMedia);
        if (mediaMayorNueve==true){
            System.out.println("Existen sobresaliente!");
        }

    }
}
