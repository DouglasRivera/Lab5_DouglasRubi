/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_douglasrivera;

/**
 *
 * @author famii
 */
public class Tutores extends Estudiantes {
    String ClaseDaTutorias;
    boolean EsTutorLab;

    public Tutores(String ClaseDaTutorias, boolean EsTutorLab) {
        this.ClaseDaTutorias = ClaseDaTutorias;
        this.EsTutorLab = EsTutorLab;
    }

    public Tutores(String Nombre, int Numero_Registro, String Apellido, String CarreraEstudia, boolean TieneEquipo, String FacultadPertenece, int Cant_Clases, boolean TieneBeca, boolean TieneCarro) {
        super(Nombre, Numero_Registro, Apellido, CarreraEstudia, TieneEquipo, FacultadPertenece, Cant_Clases, TieneBeca, TieneCarro);
    }

    public String getClaseDaTutorias() {
        return ClaseDaTutorias;
    }

    public void setClaseDaTutorias(String ClaseDaTutorias) {
        this.ClaseDaTutorias = ClaseDaTutorias;
    }

    public boolean isEsTutorLab() {
        return EsTutorLab;
    }

    public void setEsTutorLab(boolean EsTutorLab) {
        this.EsTutorLab = EsTutorLab;
    }
    
}
