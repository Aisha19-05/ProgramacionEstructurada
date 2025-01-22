import javax.swing.*;

public class Expresiones {
    public static void main(String[] args) {
        //declaracion de varibales
        double r =  0, r2=0.0, r3=0.0, r4=0.0, r5=0.0;
        double a=0;
        double y=0;
        double z=0;
        double x=0;
        double b=0.0;
        String salida = "";

        a = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de a: "));
        y= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de y: "));
        z= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de z: "));
        x= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x: "));

        r = Math.pow( a + Math.pow(y, z+1) / (x-1), 2);
        r2 = Math.pow(Math.sqrt(Math.pow(a-b,2)) / (4*x),z-1);
        r3 = 1.0 / Math.sqrt(Math.pow(x,2) - 4 * x);
        r4 = Math.pow(a + Math.pow(y, z+1),2);
        r5 = (y-3) / Math.pow(x,5);

        salida = "El resultado de la expresion 1 es : " + r +
                "\nEl resutado de la exprecion 2 es: " + r2 +
                "\nEl resutado de la exprecion 3 es: " + r3 +
                "\nEl resutado de la exprecion 4 es: " + r4 +
                "\nEl resutado de la exprecion 5 es: " + r5;



        JOptionPane.showMessageDialog(null, salida);
    }
}
