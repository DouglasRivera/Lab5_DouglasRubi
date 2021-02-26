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
public class Docentes {
    String Nombre;
    int Numero_Registro;
    String Apellido;
    String ClaseAsignada;
    String FacultadAsignada;
    boolean MasFacultades;
    String Area_Conocimiento;
    boolean TieneLab;

    public Docentes(String Nombre, int Numero_Registro, String Apellido, String ClaseAsignada, String FacultadAsignada, boolean MasFacultades, String Area_Conocimiento, boolean TieneLab) {
        this.Nombre = Nombre;
        this.Numero_Registro = Numero_Registro;
        this.Apellido = Apellido;
        this.ClaseAsignada = ClaseAsignada;
        this.FacultadAsignada = FacultadAsignada;
        this.MasFacultades = MasFacultades;
        this.Area_Conocimiento = Area_Conocimiento;
        this.TieneLab = TieneLab;
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

    public String getClaseAsignada() {
        return ClaseAsignada;
    }

    public void setClaseAsignada(String ClaseAsignada) {
        this.ClaseAsignada = ClaseAsignada;
    }

    public String getFacultadAsignada() {
        return FacultadAsignada;
    }

    public void setFacultadAsignada(String FacultadAsignada) {
        this.FacultadAsignada = FacultadAsignada;
    }

    public boolean isMasFacultades() {
        return MasFacultades;
    }

    public void setMasFacultades(boolean MasFacultades) {
        this.MasFacultades = MasFacultades;
    }

    public String getArea_Conocimiento() {
        return Area_Conocimiento;
    }

    public void setArea_Conocimiento(String Area_Conocimiento) {
        this.Area_Conocimiento = Area_Conocimiento;
    }

    public boolean isTieneLab() {
        return TieneLab;
    }

    public void setTieneLab(boolean TieneLab) {
        this.TieneLab = TieneLab;
    }

    @Override
    public String toString() {
        return "[Docentes]" + "Nombre=" + Nombre;
    }
    
}
