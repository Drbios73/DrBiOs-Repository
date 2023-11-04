package misClasesTest;
import misClases.Alumno;
import misClases.Inscripcion;
import misClases.Materia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class InscripcionTest {
    @Test
    public void gabrielSePudoInscribir(){
        Materia m1 = new Materia("Programacion3");
        Materia m2 = new Materia("Programacion1");
        Materia m3 = new Materia("Programacion2");

        Alumno alumno1 = new Alumno("Gabriel", "de la Riva", "23549128", "123");
        m1.setMateriasCorrelativas(m2);
        m1.setMateriasCorrelativas(m3);

        alumno1.addMaterias(m2);
        alumno1.addMaterias(m3);

        Inscripcion miInscripcion = new Inscripcion(m1, alumno1);

        Assertions.assertTrue(miInscripcion.aprobada());

    }
    @Test
    public void gabrielNoSePudoInscribir(){
        Materia m1 = new Materia("Programacion3");
        Materia m2 = new Materia("Programacion1");
        Materia m3 = new Materia("Programacion2");

        Alumno alumno1 = new Alumno("Gabriel", "de la Riva", "23549128", "123");
        m1.setMateriasCorrelativas(m2);
        m1.setMateriasCorrelativas(m3);


        Inscripcion miInscripcion = new Inscripcion(m1, alumno1);

        Assertions.assertFalse(miInscripcion.aprobada());
    }
@Test
    public void gabrielSeAnotaEnMateriaSinCorrelatividad(){
        Materia m1 = new Materia("Programacion3");
        Materia m2 = new Materia("Programacion1");
        Materia m3 = new Materia("Programacion2");

        Alumno alumno1 = new Alumno("Gabriel", "de la Riva", "23549128", "123");

        Inscripcion miInscripcion = new Inscripcion(m2, alumno1);

        Assertions.assertTrue(miInscripcion.aprobada());
    }
}
