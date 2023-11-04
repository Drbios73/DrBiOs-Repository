package misClases;

import misInterfaces.ITransformador;

import java.util.ArrayList;
import java.util.List;

public class TransformaArray implements ITransformador {


    @Override
    public  ArrayList<String> convierteAMayusculas(ArrayList<String> miArray) {

        for(int i= 0; i < miArray.size(); i++)
            miArray.set(i, miArray.get(i).toUpperCase()) ;

        return miArray;
    }
}
