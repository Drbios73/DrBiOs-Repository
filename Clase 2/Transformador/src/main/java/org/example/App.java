package org.example;

import misClases.TransformaArray;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main ( String[] args )
    {
        ArrayList<String> arreglo = new ArrayList<>();

        arreglo.add("hola");
        arreglo.add("soy");
        arreglo.add("gabriel");

        TransformaArray miArreglo = new TransformaArray();
        miArreglo.convierteAMayusculas(arreglo);

        for(String cadena: arreglo){
            System.out.println(cadena);
        }


    }

    public static void cargaArray(ArrayList<String> arreglo){

    }
}
