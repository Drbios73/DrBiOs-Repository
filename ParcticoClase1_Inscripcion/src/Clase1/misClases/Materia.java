package Clase1.misClases;

import java.util.ArrayList;
import java.util.List;

public class Materia {

    private String nombre;

    private List<Materia> materiasCorrelativas;

    public String getNombre() {
        return nombre;
    }

    public Materia(String nombre) {
        this.nombre = nombre;
        this.materiasCorrelativas = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

    public void setMateriasCorrelativas(Materia materia) {
        this.materiasCorrelativas.add(materia);
    }

    public boolean sePuedeInscribir(Alumno alumno)
    {
        boolean respuesta = true;
        for (Materia materia: this.getMateriasCorrelativas())
        {
            if (alumno.materiasAprobadas.contains(materia))
            {
                respuesta = true;
            }else{
                respuesta = false;
                break;
            }
        }
        return respuesta;
    }
}
