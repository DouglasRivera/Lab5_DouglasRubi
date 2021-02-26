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
public class Estudiantes {
    String Nombre;
    int Numero_Registro;
    String Apellido;
    String CarreraEstudia;
    boolean TieneEquipo;
    String FacultadPertenece;
    int Cant_Clases;
    boolean TieneBeca;
    boolean TieneCarro;

    public Estudiantes() {
    }

    public Estudiantes(String Nombre, int Numero_Registro, String Apellido, String CarreraEstudia, boolean TieneEquipo, String FacultadPertenece, int Cant_Clases, boolean TieneBeca, boolean TieneCarro) {
        this.Nombre = Nombre;
        this.Numero_Registro = Numero_Registro;
        this.Apellido = Apellido;
        this.CarreraEstudia = CarreraEstudia;
        this.TieneEquipo = TieneEquipo;
        this.FacultadPertenece = FacultadPertenece;
        this.Cant_Clases = Cant_Clases;
        this.TieneBeca = TieneBeca;
        this.TieneCarro = TieneCarro;
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

    public String getCarreraEstudia() {
        return CarreraEstudia;
    }

    public void setCarreraEstudia(String CarreraEstudia) {
        this.CarreraEstudia = CarreraEstudia;
    }

    public boolean isTieneEquipo() {
        return TieneEquipo;
    }

    public void setTieneEquipo(boolean TieneEquipo) {
        this.TieneEquipo = TieneEquipo;
    }

    public String getFacultadPertenece() {
        return FacultadPertenece;
    }

    public void setFacultadPertenece(String FacultadPertenece) {
        this.FacultadPertenece = FacultadPertenece;
    }

    public int getCant_Clases() {
        return Cant_Clases;
    }

    public void setCant_Clases(int Cant_Clases) {
        this.Cant_Clases = Cant_Clases;
    }

    public boolean isTieneBeca() {
        return TieneBeca;
    }

    public void setTieneBeca(boolean TieneBeca) {
        this.TieneBeca = TieneBeca;
    }

    public boolean isTieneCarro() {
        return TieneCarro;
    }

    public void setTieneCarro(boolean TieneCarro) {
        this.TieneCarro = TieneCarro;
    }

    @Override
    public String toString() {
        return "[Estudiantes]" + "Nombre=" + Nombre;
    }
    
}
