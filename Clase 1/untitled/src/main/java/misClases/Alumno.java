package misClases;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private String dni;
    private String legajo;
    List<Materia> materiasAprobadas;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getLegajo() {
        return legajo;
    }

    public Alumno(String nombre, String apellido, String dni, String legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<Materia>();
    }

    public void addMaterias(Materia materia){
        this.materiasAprobadas.add(materia);
    }
}

