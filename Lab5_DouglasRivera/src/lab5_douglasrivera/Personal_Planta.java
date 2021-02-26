/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_douglasrivera;

import java.util.ArrayList;

/**
 *
 * @author famii
 */
public class Personal_Planta {
    String Nombre;
    int Numero_Registro;
    String Apellido;
    String Cargo;
    String FacultadAsignada;
    String CarreraAsignada;
    String ClaseAsignada;
    ArrayList<Estudiantes> Estudiante  = new ArrayList();
    ArrayList<Tutores> Tutor  = new ArrayList();

    public Personal_Planta(String Nombre, int Numero_Registro, String Apellido, String Cargo, String FacultadAsignada, String CarreraAsignada, String ClaseAsignada) {
        this.Nombre = Nombre;
        this.Numero_Registro = Numero_Registro;
        this.Apellido = Apellido;
        this.Cargo = Cargo;
        this.FacultadAsignada = FacultadAsignada;
        this.CarreraAsignada = CarreraAsignada;
        this.ClaseAsignada = ClaseAsignada;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumero_Registro() {
        return Numero_Registro;
    }

    public void setNumero_Registro(int Numero_Registro) {
        this.Numero_Registro = Numero_Registro;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getFacultadAsignada() {
        return FacultadAsignada;
    }

    public void setFacultadAsignada(String FacultadAsignada) {
        this.FacultadAsignada = FacultadAsignada;
    }

    public String getCarreraAsignada() {
        return CarreraAsignada;
    }

    public void setCarreraAsignada(String CarreraAsignada) {
        this.CarreraAsignada = CarreraAsignada;
    }

    public String getClaseAsignada() {
        return ClaseAsignada;
    }

    public void setClaseAsignada(String ClaseAsignada) {
        this.ClaseAsignada = ClaseAsignada;
    }

    public ArrayList<Estudiantes> getEstudiante() {
        return Estudiante;
    }

    public void setEstudiante(ArrayList<Estudiantes> Estudiante) {
        this.Estudiante = Estudiante;
    }

    public ArrayList<Tutores> getTutor() {
        return Tutor;
    }

    public void setTutor(ArrayList<Tutores> Tutor) {
        this.Tutor = Tutor;
    }

    @Override
    public String toString() {
        return "[Personal_Planta]" + "Nombre=" + Nombre;
    }
    
}
