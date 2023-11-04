package misClasesTest;

import misClases.TransformaArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TransforArrayTest {
    @Test
    public void transformaAMayusculasArray() {
        ArrayList<String> arreglo = new ArrayList<>();
        ArrayList<String> arregloControl = new ArrayList<>();

        arreglo.add("hola");
        arreglo.add("soy");
        arreglo.add("gabriel");

        arregloControl.add("HOLA");
        arregloControl.add("SOY");
        arregloControl.add("GABRIEL");

        TransformaArray miArreglo = new TransformaArray();
        miArreglo.convierteAMayusculas(arreglo);


        Assertions.assertLinesMatch(arregloControl, arreglo);
    }
}
