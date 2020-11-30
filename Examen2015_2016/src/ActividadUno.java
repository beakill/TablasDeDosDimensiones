import javax.swing.*;

public class ActividadUno {
    public static void main (String[]args){
        String codigo="";
        String nombreDpto="";
        int numProf=0;
        String nombreProf="";
        int añosProf=0;
        char codigoClase=' ';
        String nombreAlum="";
        float notaMedia=0F;
        String especialidad="";
        int numAsig=0;
        String nombreFP="";
        int horasTotales=0;
        String nombreDptoMaxProf="";
        int  numProfMax=0;
        float notaMediaMax=0F;
        int contadorAlumnos=0;
        String nombreAlumNotaMax="";
        String especialidadAnt="";
        int contadorEspecialidad=0;
        int totalAsig=0;
        int contadorBach=0;
        int contadorCiclosMas1500=0;
        int cicloMenorDuracion=100000;
        String nombreCicloMenorDur="";
        float mediaAños=0F;
        float menorMediaAños=100000F;
        String nombreDptoMenorMedia="";
        codigo=JOptionPane.showInputDialog("Introduce el código: ");

        while (!codigo.equalsIgnoreCase("fin")) {
            if (codigo.toUpperCase().charAt(0) == 'D') {
                nombreDpto=JOptionPane.showInputDialog("Introduce el nombre: ");
                numProf=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de profesores: "));
                for (int i =0; i<numProf;i++){
                    nombreProf=JOptionPane.showInputDialog("Introduce el nombre del profesor: ");
                    añosProf=Integer.parseInt(JOptionPane.showInputDialog("Años que lleva en el centro: "));
                    mediaAños=añosProf+mediaAños;
                }
                mediaAños=(float)mediaAños/numProf;
                if (mediaAños<menorMediaAños){
                    menorMediaAños=mediaAños;
                    nombreDptoMenorMedia=nombreDpto;
                }
                mediaAños=0;
                if (numProf>numProfMax){
                    nombreDptoMaxProf=nombreDpto;
                    numProfMax=numProf;
                }

            } else {
                codigoClase=JOptionPane.showInputDialog("Introduce la letra: ").toUpperCase().charAt(0);
                switch (codigoClase){
                    case 'E':
                        nombreAlum=JOptionPane.showInputDialog("Introduce el nombre del alumno: ");
                        while (!nombreAlum.equalsIgnoreCase("fin")){
                            contadorAlumnos++;
                            notaMedia=Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota media del examen"));
                            if (contadorAlumnos<20) {
                                if (notaMedia > notaMediaMax) {
                                    notaMediaMax = notaMedia;
                                    nombreAlumNotaMax = nombreAlum;
                                }
                            }else{
                                notaMediaMax=0;
                            }
                            nombreAlum=JOptionPane.showInputDialog("Introduce el nombre del alumno: ");
                        }

                        contadorAlumnos=0;
                        break;
                    case 'P':
                        contadorEspecialidad++;
                        especialidadAnt=especialidad;
                        especialidad=JOptionPane.showInputDialog("Introduce la especialidad: ");
                        break;
                    case 'B':
                        contadorBach++;
                        numAsig=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de asignaturas: "));
                        totalAsig=+numAsig+totalAsig;
                        break;
                    case 'F':
                        nombreFP=JOptionPane.showInputDialog("Introduce el título: ");
                        horasTotales=Integer.parseInt(JOptionPane.showInputDialog("Introduce le numero de hora totales: "));
                        if (horasTotales > 1500){
                            contadorCiclosMas1500++;
                        }
                        if (horasTotales<cicloMenorDuracion){
                            cicloMenorDuracion=horasTotales;
                            nombreCicloMenorDur=nombreFP;
                        }
                        break;
                }
            }

            codigo=JOptionPane.showInputDialog("Introduce el código: ");
        }
        JOptionPane.showMessageDialog(null,"El departamento que mas profesores tiene es: "+nombreDptoMaxProf);
        JOptionPane.showMessageDialog(null, "El alumno con mayor nota media en grupo menores de 20 alumnos es: "+nombreAlumNotaMax);
        if (contadorEspecialidad<2){
            JOptionPane.showMessageDialog(null,"Ultimas 2 esp. PCPI: Ninguna - "+especialidadAnt);

        }else {
            JOptionPane.showMessageDialog(null,"Ultimas 2 esp. PCPI: " +especialidadAnt+ " - "+especialidad);
        }
        JOptionPane.showMessageDialog(null,"La media de asginaturas es : "+(float)totalAsig/contadorBach);
        JOptionPane.showMessageDialog(null,"El numero de cicos de F.P con mas de 1500 son: "+contadorCiclosMas1500);
        JOptionPane.showMessageDialog(null, "El ciclo de menor duracion es: "+nombreCicloMenorDur);
        JOptionPane.showMessageDialog(null, "El departamento con menor media es: "+nombreDptoMenorMedia);

    }
}
