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
public class Administrativos {
    String Nombre;
    int Numero_Registro;
    String Apellido;
    String Cargo;
    String AreaAsignada;
    int Cant_Subordinados;
    String Nombre_Asistente;
    String Nombre_Jefe;
    ArrayList<Docentes> Docente  = new ArrayList();

    public Administrativos(String Nombre, int Numero_Registro, String Apellido, String Cargo, String AreaAsignada, int Cant_Subordinados, String Nombre_Asistente, String Nombre_Jefe) {
        this.Nombre = Nombre;
        this.Numero_Registro = Numero_Registro;
        this.Apellido = Apellido;
        this.Cargo = Cargo;
        this.AreaAsignada = AreaAsignada;
        this.Cant_Subordinados = Cant_Subordinados;
        this.Nombre_Asistente = Nombre_Asistente;
        this.Nombre_Jefe = Nombre_Jefe;
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

    public String getAreaAsignada() {
        return AreaAsignada;
    }

    public void setAreaAsignada(String AreaAsignada) {
        this.AreaAsignada = AreaAsignada;
    }

    public int getCant_Subordinados() {
        return Cant_Subordinados;
    }

    public void setCant_Subordinados(int Cant_Subordinados) {
        this.Cant_Subordinados = Cant_Subordinados;
    }

    public String getNombre_Asistente() {
        return Nombre_Asistente;
    }

    public void setNombre_Asistente(String Nombre_Asistente) {
        this.Nombre_Asistente = Nombre_Asistente;
    }

    public String getNombre_Jefe() {
        return Nombre_Jefe;
    }

    public void setNombre_Jefe(String Nombre_Jefe) {
        this.Nombre_Jefe = Nombre_Jefe;
    }

    public ArrayList<Docentes> getDocente() {
        return Docente;
    }

    public void setDocente(ArrayList<Docentes> Docente) {
        this.Docente = Docente;
    }

    @Override
    public String toString() {
        return "[Administrativos]" + "Nombre=" + Nombre;
    }
    
}
