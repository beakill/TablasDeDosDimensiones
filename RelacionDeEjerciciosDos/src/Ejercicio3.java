import javax.swing.*;

public class Ejercicio3 {
    public static void main (String[]args){
        String notaUnoCadena, notaDosCadena, notaTresCadena, notaCuatroCadena;
        float notaUno, notaDos, notaTres, notaCuatro, promedio;

        notaUnoCadena = JOptionPane.showInputDialog("Introduce la primera nota:");
        notaUno=Float.parseFloat(notaUnoCadena);

        notaDosCadena = JOptionPane.showInputDialog("Introduce la segunda nota:");
        notaDos=Float.parseFloat(notaDosCadena);

        notaTresCadena = JOptionPane.showInputDialog("Introduce la tercera nota:");
        notaTres=Float.parseFloat(notaTresCadena);

        notaCuatroCadena = JOptionPane.showInputDialog("Introduce la cuarta nota:");
        notaCuatro=Float.parseFloat(notaCuatroCadena);

        promedio = (notaUno+notaDos+notaTres+notaCuatro)/4;

        JOptionPane.showMessageDialog(null,"La media de las notas es: "+promedio);
    }
}
