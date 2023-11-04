package misClases;
import java.time.LocalDate;

public class Inscripcion {
    private Materia materia;
    private Alumno nombreAlumno;

    public Inscripcion(Materia materia, Alumno nombreAlumno) {
        this.materia = materia;
        this.nombreAlumno = nombreAlumno;
    }

    public LocalDate getFecha() {
        return LocalDate.now();
    }

    public boolean aprobada(){
        boolean respuesta = true;
        for (Materia materia: materia.getMateriasCorrelativas())
        {
            if (nombreAlumno.materiasAprobadas.contains(materia))
            {
                respuesta = true;
            }else{
                respuesta = false;
            }
        }
        return respuesta;
    }
}
