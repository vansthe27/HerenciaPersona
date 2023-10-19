package com.camilomorales.dominio;

public class Profesor extends Persona {
    private String especialidad;

    public Profesor(String nombre, String apellido, int edad, String especialidad) {
        super(nombre, apellido, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}

