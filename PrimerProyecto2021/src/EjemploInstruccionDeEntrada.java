import javax.swing.*;
public class EjemploInstruccionDeEntrada {
    public static void main(String[]args){
        String nombre;
        nombre=JOptionPane.showInputDialog("Introduce tu nombre");
        JOptionPane.showMessageDialog(null,"Buenos dias, "+nombre);

    }
}
