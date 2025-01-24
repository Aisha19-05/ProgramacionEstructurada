import javax.swing.*;

/*
*Escribir un programa que convierta tres numeros de kilogramos a Libras
* Kilogramos a Libras (1 libra=0.454)
*
*
 */

public class ConversionLibras {
    public static void main(String[] args) {

        // Declaracion de constante
        final double FACTOR_CONVERSION = 0.454;
        //Declaracion de variables de tres numeros dobles a convertir
        double numero1=0.0;
        double numero2=0.0;
        double numero3=0.0;

        //Solicitar los tres numeros a calcular
        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 1"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 2"));
        numero3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 3"));


        double c1=0.0;
        double c2=0.0;
        double c3=0.0;
        String salida = "";

        // Proceso de conversion
        c1 = numero1 / FACTOR_CONVERSION;
        c2 = numero2 / FACTOR_CONVERSION;
        c3 = numero3 / FACTOR_CONVERSION;

        //Salida o resultados de las operaciones

        salida = numero1 + "kg" + " en Libras es: " + String.format("%.3f",c1) +
                "\n" + numero2 + "kg" + " en Libras es: " + String.format("%.3f",c2)  +
                "\n" + numero3 + "kg" + " en Libras es: " + String.format("%.3f",c3);

        JOptionPane.showMessageDialog(null, salida);




    }
}
