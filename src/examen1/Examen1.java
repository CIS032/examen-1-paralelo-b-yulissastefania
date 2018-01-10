/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ListaProfesores lp = new ListaProfesores();
        boolean continuar = true;
        do {
            int opcion = 0;
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija una opcion: \n 1. Agregar Profesor \n 2. Grabar \n 3. Salir", "Menu", JOptionPane.INFORMATION_MESSAGE));
            switch (opcion) {
                case 1:
                    int opcion1 = 0;
                    opcion1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija una opcion: \n 1. Agregar Profesor Tiempo Parcial \n 2. Agregar Profesor  Medio Tiempo  \n 3. Agregar Profesor Tiempo Completo", "Menu", JOptionPane.INFORMATION_MESSAGE));
                    switch (opcion1) {
                        case 1:
                            String cedula = JOptionPane.showInputDialog(null, " Ingrese la cedula del Profesor de Tiempo Parcial: ", "Ingresar", JOptionPane.INFORMATION_MESSAGE);
                            String nombres = JOptionPane.showInputDialog(null, " Ingrese los nombres del Profesor de Tiempo Parcial: ", "Ingresar", JOptionPane.INFORMATION_MESSAGE);
                            String apellidos = JOptionPane.showInputDialog(null, " Ingrese los apellidos del Profesor de Tiempo Parcial: ", "Ingresar", JOptionPane.INFORMATION_MESSAGE);
                            int horasClase = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese el numeo de horas clase del Profesor de Tiempo Parcial: ", "Ingresar", JOptionPane.INFORMATION_MESSAGE));
                            while (!(horasClase >= 2 && horasClase <= 9)) {
                                JOptionPane.showMessageDialog(null, " Ingrese valores entres 2 y 9.");
                                horasClase = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese el numeo de horas clase del Profesor de Medio Tiempo : ", "Ingresar", JOptionPane.INFORMATION_MESSAGE));
                            }
                                int horasSemanales = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese el numeo de horas clase del Profesor de Tiempo Parcial: ", "Ingresar", JOptionPane.INFORMATION_MESSAGE));
                            while (!(horasSemanales >= 1 && horasSemanales < 20)) {
                                JOptionPane.showMessageDialog(null, " Ingrese valores entre 1 y 19.");
                                horasClase = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese el numeo de horas clase del Profesor de Medio Tiempo : ", "Ingresar", JOptionPane.INFORMATION_MESSAGE));
                            }
                                String carrera = JOptionPane.showInputDialog(null, " Ingrese la carrera del Profesor de Tiempo Parcial: ", "Ingresar", JOptionPane.INFORMATION_MESSAGE);
                            ProfesorTiempoParcial ptp = new ProfesorTiempoParcial(horasSemanales, cedula, nombres, apellidos, horasClase, carrera);
                            lp.agregar(ptp);
                            break;
                        case 2:
                            String cedula1 = JOptionPane.showInputDialog(null, " Ingrese la cedula del Profesor de Medio Tiempo : ", "Ingresar", JOptionPane.INFORMATION_MESSAGE);
                            String nombres1 = JOptionPane.showInputDialog(null, " Ingrese los nombres del Profesor de Medio Tiempo : ", "Ingresar", JOptionPane.INFORMATION_MESSAGE);
                            String apellidos1 = JOptionPane.showInputDialog(null, " Ingrese los apellidos del Profesor de Medio Tiempo : ", "Ingresar", JOptionPane.INFORMATION_MESSAGE);
                            int horasClase1 = 10;
                            String carrera1 = JOptionPane.showInputDialog(null, " Ingrese la carrera del Profesor de Medio Tiempo : ", "Ingresar", JOptionPane.INFORMATION_MESSAGE);
                            ProfesorMedioTiempo pmt = new ProfesorMedioTiempo(cedula1, nombres1, apellidos1, horasClase1, carrera1);
                            lp.agregar(pmt);
                            break;
                        case 3:
                            String cedula2 = JOptionPane.showInputDialog(null, " Ingrese la cedula del Profesor de Tiempo Completo : ", "Ingresar", JOptionPane.INFORMATION_MESSAGE);
                            String nombres2 = JOptionPane.showInputDialog(null, " Ingrese los nombres del Profesor de Tiempo Completo : ", "Ingresar", JOptionPane.INFORMATION_MESSAGE);
                            String apellidos2 = JOptionPane.showInputDialog(null, " Ingrese los apellidos del Profesor de Tiempo Completo : ", "Ingresar", JOptionPane.INFORMATION_MESSAGE);
                            int horasClase2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese el numeo de horas clase del Profesor de Tiempo Completo : ", "Ingresar", JOptionPane.INFORMATION_MESSAGE));
                            while (!(horasClase2 >= 3 && horasClase2 <= 16)) {
                                JOptionPane.showMessageDialog(null, " Ingrese valores entres 3 y 16.");
                                horasClase2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese el numeo de horas clase del Profesor de Medio Tiempo : ", "Ingresar", JOptionPane.INFORMATION_MESSAGE));
                            }
                            String carrera2 = JOptionPane.showInputDialog(null, " Ingrese la carrera del Profesor de Medio Tiempo : ", "Ingresar", JOptionPane.INFORMATION_MESSAGE);
                            ProfesorTiempoCompleto ptc = new ProfesorTiempoCompleto(cedula2, nombres2, apellidos2, horasClase2, carrera2);
                            lp.agregar(ptc);
                            break;
                        case 4:
                            break;
                        default:

                    }
                    break;
                case 2:
                    lp.grabar();
                    break;
                case 3:
                    continuar = false;
                    break;
                default:

            }

        } while (continuar);

    }

}
