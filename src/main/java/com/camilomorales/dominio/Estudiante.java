package com.camilomorales.dominio;

public class Estudiante extends Persona {
    private int matricula;

    public Estudiante(String nombre, String apellido, int edad, int matricula) {
        super(nombre, apellido, edad);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}

