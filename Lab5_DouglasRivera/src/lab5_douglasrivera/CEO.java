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
public class CEO {
    String Nombre;
    int Numero_Registro;
    String Apellido;
    String Nacionalidad;
    String Titulo_Uni;
    int Edad;
    int Years_Experiencia;
    int Cant_Years;
    ArrayList<Administrativos> Admin  = new ArrayList();
    ArrayList<Personal_Planta> Personal  = new ArrayList();
    ArrayList<Consejo_Academico> Consejo  = new ArrayList();

    public CEO() {
    }

    public CEO(String Nombre, int Numero_Registro, String Apellido, String Nacionalidad, String Titulo_Uni, int Edad, int Years_Experiencia, int Cant_Years) {
        this.Nombre = Nombre;
        this.Numero_Registro = Numero_Registro;
        this.Apellido = Apellido;
        this.Nacionalidad = Nacionalidad;
        this.Titulo_Uni = Titulo_Uni;
        this.Edad = Edad;
        this.Years_Experiencia = Years_Experiencia;
        this.Cant_Years = Cant_Years;
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

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getTitulo_Uni() {
        return Titulo_Uni;
    }

    public void setTitulo_Uni(String Titulo_Uni) {
        this.Titulo_Uni = Titulo_Uni;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getYears_Experiencia() {
        return Years_Experiencia;
    }

    public void setYears_Experiencia(int Years_Experiencia) {
        this.Years_Experiencia = Years_Experiencia;
    }

    public int getCant_Years() {
        return Cant_Years;
    }

    public void setCant_Years(int Cant_Years) {
        this.Cant_Years = Cant_Years;
    }

    public ArrayList<Administrativos> getAdmin() {
        return Admin;
    }

    public void setAdmin(ArrayList<Administrativos> Admin) {
        this.Admin = Admin;
    }

    public ArrayList<Personal_Planta> getPersonal() {
        return Personal;
    }

    public void setPersonal(ArrayList<Personal_Planta> Personal) {
        this.Personal = Personal;
    }

    public ArrayList<Consejo_Academico> getConsejo() {
        return Consejo;
    }

    public void setConsejo(ArrayList<Consejo_Academico> Consejo) {
        this.Consejo = Consejo;
    }

    @Override
    public String toString() {
        return "[CEO]" + "Nombre=" + Nombre;
    }
     
}
