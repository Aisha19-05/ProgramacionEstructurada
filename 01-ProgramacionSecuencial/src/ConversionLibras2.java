import javax.swing.*;

public class ConversionLibras2 {
    public static void main(String[] args) {

        // Declaracion de constante
        final double FACTOR_CONVERSION = 0.454;
        //Declaracion de variables de tres numeros dobles a convertir
        double numero1=0.0;
        double numero2=0.0;
        double numero3=0.0;

        String salida = "";

        //Solicitar los tres numeros a calcular
        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 1"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 2"));
        numero3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 3"));




        //Salida o resultados de las operaciones

        salida = numero1 + "kg" + " en Libras es: " + String.format("%.3f",numero1 / FACTOR_CONVERSION) +
                "\n" + numero2 + "kg" + " en Libras es: " + String.format("%.3f",numero2 / FACTOR_CONVERSION)  +
                "\n" + numero3 + "kg" + " en Libras es: " + String.format("%.3f",numero3 / FACTOR_CONVERSION);

        JOptionPane.showMessageDialog(null, salida);




    }
}
