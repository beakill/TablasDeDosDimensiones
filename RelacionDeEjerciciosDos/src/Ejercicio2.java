import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[]args){
        String baseCadena, alturaCadena;
        float area, base, altura;

        baseCadena=JOptionPane.showInputDialog("Introduce la base");
        base=Float.parseFloat(baseCadena);

        alturaCadena=JOptionPane.showInputDialog("Introduce la altura");
        altura=Float.parseFloat(alturaCadena);

        area = base*altura/2;
        JOptionPane.showMessageDialog(null,"El área es: "+area);
    }
}
