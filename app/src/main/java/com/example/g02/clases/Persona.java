package com.example.g02.clases;

public class Persona {
    private int idPersona;
    private String nombrePersona;
    private String apellidoPersona;
    private int edadPersona;
    private String correoPersona;

    public Persona() {
    }

    public Persona(int idPersona, String nombrePersona, String apellidoPersona, int edadPersona, String correoPersona) {
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.edadPersona = edadPersona;
        this.correoPersona = correoPersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    public String getCorreoPersona() {
        return correoPersona;
    }

    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }

    @Override
    public String toString() {
        return  idPersona + nombrePersona + " " + apellidoPersona + " " + edadPersona + " " + correoPersona;
    }
}
