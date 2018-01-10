/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ListaProfesores {

    private ArrayList<Profesor> profesores = new ArrayList<Profesor>();

    public ListaProfesores() {
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public void agregar(Profesor p) {
        this.profesores.add(p);
    }

    public void grabar() throws IOException {
        try {
            FileWriter fw = new FileWriter(new File("Profesores.csv"));
            PrintWriter pw = new PrintWriter(fw, true);
            for (Profesor profesor : profesores) {
                if (profesor instanceof ProfesorTiempoParcial) {
                    ProfesorTiempoParcial ptp = (ProfesorTiempoParcial) profesor;
                    pw.print(ptp + "\n");

                }
                if (profesor instanceof ProfesorMedioTiempo) {
                    ProfesorMedioTiempo pmt = (ProfesorMedioTiempo) profesor;
                    pw.print(pmt + "\n");

                }
                if (profesor instanceof ProfesorTiempoCompleto) {
                    ProfesorTiempoCompleto ptc = (ProfesorTiempoCompleto) profesor;
                    pw.print(ptc + "\n");

                }

            }

            pw.close();
        } catch (IOException ex) {

        }
    }

}
