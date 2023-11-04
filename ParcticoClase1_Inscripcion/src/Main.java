import Clase1.misClases.Alumno;
import Clase1.misClases.Inscripcion;
import Clase1.misClases.Materia;

import java.util.ArrayList;


public class Main{
    public static void main(String[] args) {

        Materia miMateria = new Materia("Fisica");
        Materia miMateria2 = new Materia ("Matematica");
        Materia miMateria3 = new Materia ("Matematica 2");
        Materia miMateria4 = new Materia ("Química");

        miMateria.setMateriasCorrelativas(miMateria2);
        miMateria.setMateriasCorrelativas(miMateria3);


        Alumno alumno1 = new Alumno("Gabriel", "de la Riva", "2354928", "1973");
        alumno1.addMaterias(miMateria2);
        alumno1.addMaterias(miMateria4);

        Alumno alumno2 = new Alumno("Alejandra", "Di Iorio de de la Riva", "23479259", "1974");
        alumno2.addMaterias(miMateria3);


        System.out.println("El alumno 1 es:\n" +
                "== ====== = ==\n" + "Nombre:\t\t " + alumno1.getNombre()
        + "\nApellido:\t " + alumno1.getApellido() +
                "\nD.N.I.:\t\t " + alumno1.getDni() +
                "\nLegajo:\t\t " + alumno1.getLegajo());

        Inscripcion miInscripcion = new Inscripcion(miMateria, alumno1);

        System.out.println("En el día " + miInscripcion.getFecha() + " Se quiere inscribir en  "+ miMateria.getNombre());
        System.out.println("que tiene " +  miMateria.getMateriasCorrelativas().stream().count() +
                        " correlativas y son las siguientes :\n");
        for(Materia materia: miMateria.getMateriasCorrelativas())
        {
            System.out.println("materia= " + materia.getNombre());;
        }



        System.out.println("Puede anotarse? " + miMateria.sePuedeInscribir(alumno1));

    }
}