package com.camilomorales.app;

import com.camilomorales.dominio.Estudiante;
import com.camilomorales.dominio.Profesor;

public class Main {
    public static void main(String[] args) {

        Profesor profesor = new Profesor("Andrés","Henao",40,"Programación");
        Estudiante estudiante = new Estudiante("Camilo","Morales",30,123);

        // Acceso a los datos de profesor y estudiante
        System.out.println("Profesor: " + profesor.getNombre() + ", Edad: " + profesor.getEdad() + ", Especialidad: " + profesor.getEspecialidad());
        System.out.println("Estudiante: " + estudiante.getNombre() + ", Edad: " + estudiante.getEdad() + ", Matrícula: " + estudiante.getMatricula());
    }
}
