/*
*Calcular el resultado de la expresion n = x+y/y-1
* para los valores de x y y cualesquiera
*
 */


import javax.swing.*;

public class Expresion {
    public static void main(String[] args) {
        //Declaracion de variables

        double x = 0.0;
        double y = 0.0;
        double n = 0.0;
        String salida = "";

        x = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de y"));

        //Calcular la expresion
        n = (x + y)/ (y - 1);

        //Salida del programa
        salida = "El resultado de la expresion es " + String.format("%.2f", n);

        JOptionPane.showMessageDialog(null,salida);


    }
}
