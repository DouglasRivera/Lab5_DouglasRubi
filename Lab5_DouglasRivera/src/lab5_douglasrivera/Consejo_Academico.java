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
public class Consejo_Academico {
    String Nombre;
    int Numero_Registro;
    String Apellido;
    String Cargo;
    String PuestoConsejo;
    int CantidadBecados;
    int Num_PersonasAcargo;
    String Lugar2do_Trabajo;
    String Cargo2do_Trabajo;
    String NombreAcuerdo_Universidad;

    public Consejo_Academico() {
    }

    public Consejo_Academico(String Nombre, int Numero_Registro, String Apellido, String Cargo, String PuestoConsejo, int CantidadBecados, int Num_PersonasAcargo, String Lugar2do_Trabajo, String Cargo2do_Trabajo, String NombreAcuerdo_Universidad) {
        this.Nombre = Nombre;
        this.Numero_Registro = Numero_Registro;
        this.Apellido = Apellido;
        this.Cargo = Cargo;
        this.PuestoConsejo = PuestoConsejo;
        this.CantidadBecados = CantidadBecados;
        this.Num_PersonasAcargo = Num_PersonasAcargo;
        this.Lugar2do_Trabajo = Lugar2do_Trabajo;
        this.Cargo2do_Trabajo = Cargo2do_Trabajo;
        this.NombreAcuerdo_Universidad = NombreAcuerdo_Universidad;
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

    public String getPuestoConsejo() {
        return PuestoConsejo;
    }

    public void setPuestoConsejo(String PuestoConsejo) {
        this.PuestoConsejo = PuestoConsejo;
    }

    public int getCantidadBecados() {
        return CantidadBecados;
    }

    public void setCantidadBecados(int CantidadBecados) {
        this.CantidadBecados = CantidadBecados;
    }

    public int getNum_PersonasAcargo() {
        return Num_PersonasAcargo;
    }

    public void setNum_PersonasAcargo(int Num_PersonasAcargo) {
        this.Num_PersonasAcargo = Num_PersonasAcargo;
    }

    public String getLugar2do_Trabajo() {
        return Lugar2do_Trabajo;
    }

    public void setLugar2do_Trabajo(String Lugar2do_Trabajo) {
        this.Lugar2do_Trabajo = Lugar2do_Trabajo;
    }

    public String getCargo2do_Trabajo() {
        return Cargo2do_Trabajo;
    }

    public void setCargo2do_Trabajo(String Cargo2do_Trabajo) {
        this.Cargo2do_Trabajo = Cargo2do_Trabajo;
    }

    public String getNombreAcuerdo_Universidad() {
        return NombreAcuerdo_Universidad;
    }

    public void setNombreAcuerdo_Universidad(String NombreAcuerdo_Universidad) {
        this.NombreAcuerdo_Universidad = NombreAcuerdo_Universidad;
    }

    @Override
    public String toString() {
        return "[Consejo_Academico]" + "Nombre=" + Nombre;
    }
    
}
