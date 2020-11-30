import javax.swing.*;

public class Ejercicio1 {
    public static void main (String[]args){
        String nombreProfesor="";
        String tituloCurso="";
        int numAlumnos=0;
        float precioCurso=0F;
        int horasDuracion=0;
        int contadorProf=0;
        int contadorProfMaxCurso=0;
        String nombreProfAnterior="";
        String nombreProfesorMasCurso="";

        nombreProfesor= JOptionPane.showInputDialog("Introduce el nombre del profesor");
        nombreProfAnterior=nombreProfesor;

        while (!nombreProfesor.equals("fin")){
            tituloCurso=JOptionPane.showInputDialog("Introduce el titulo del curso");
            numAlumnos=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de almnos"));
            precioCurso=Float.parseFloat(JOptionPane.showInputDialog("Introduce el precio del curso"));
            horasDuracion=Integer.parseInt(JOptionPane.showInputDialog("Introduce la duracion del curso"));
            if (nombreProfesor.equals(nombreProfAnterior)){
                contadorProf++;
                if (contadorProf>contadorProfMaxCurso){
                    contadorProfMaxCurso=contadorProf;
                    nombreProfesorMasCurso=nombreProfesor;
                    contadorProf=0;
                }
            }else {
                nombreProfAnterior = nombreProfesor;
                contadorProf=1;
            }
            nombreProfesor= JOptionPane.showInputDialog("Introduce el nombre del profesor");

        }
        JOptionPane.showMessageDialog(null,"El profesor que ha impartido mas cursos es: "+nombreProfesorMasCurso);

    }
}
