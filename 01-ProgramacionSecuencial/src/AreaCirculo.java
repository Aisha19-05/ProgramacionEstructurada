import javax.swing.JOptionPane;

public class AreaCirculo {
    public static void main(String[] args) {
        // Declaración de variables
        double radio = 0.0;
        double area = 0.0;
        String salida = "";


        radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del círculo:"));
        area = Math.PI * Math.pow(radio, 2);
        salida = "El área del círculo con radio " + radio + " es: " + area;


        JOptionPane.showMessageDialog(null, salida);
    }
}


