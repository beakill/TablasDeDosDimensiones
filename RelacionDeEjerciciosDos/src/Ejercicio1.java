import javax.swing.*;

public class Ejercicio1 {
    public static void main (String[]args){
        //variables auxiliares para leer los numeros introducidos por el usuario
        String numUnoCadena, numDosCadena;
        //variables que contendran los numeros a sumar
        int numUno, numDos;
        //variable que contendrá la suma de los numeros
        int suma;

        //leemos las cadenas (Strings)que contendrán en forma
        //de "palabra" los números.
        numUnoCadena = JOptionPane.showInputDialog("Introduce el primer número");
        numDosCadena = JOptionPane.showInputDialog("Introduce el segundo número");

        //convertimos las dos Strings a números
        numUno=Integer.parseInt(numUnoCadena);
        numDos= Integer.parseInt(numDosCadena);

        //sumamos
        suma = numUno + numDos ;

        //mostramos el resultado
        JOptionPane.showMessageDialog(null,"El resultado de la suma es: " +suma);
    }
}

