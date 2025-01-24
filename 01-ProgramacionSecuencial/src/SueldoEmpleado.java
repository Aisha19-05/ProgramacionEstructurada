/*
*Calcular y que imprima el sueldo de un empleado, bajo las
*siguientes características
*a. Se debe almacenar el nombre del empleado
*b. Las horas trabajadas que deben ser horas sin parte fraccionaria
*c. Cuota por hora
*d. Se debe imprimir el nombre del Trabajador y el Sueldo que va a percibir
 */


import javax.swing.*;

public class SueldoEmpleado {
    public static void main(String[] args) {

        //Declaracion de variables
        String nombre="";
        int horasTrabajadas= 0;
        double cuotaHora= 0.0;
        double sueldo=0.0;

        nombre = JOptionPane.showInputDialog("Ingresa el nombre del empleado");
        horasTrabajadas  = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las horas trabajadas"));
        cuotaHora = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cuota por hora"));

        //Calcular el sueldo

        sueldo = cuotaHora*horasTrabajadas;

        JOptionPane.showMessageDialog(null,"El empleado" + nombre +
                "\n con " + horasTrabajadas + "horas trabajadas con una cuota de: " + cuotaHora +
                "\n tiene un sueldo de: " + String.format("%.2f", sueldo));



    }
}
