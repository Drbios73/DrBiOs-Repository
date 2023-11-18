/*7.17 (Tiro de dados) Escriba una aplicación para simular el tiro de dos dados.
La aplicación debe utilizar un objeto de la clase Random una vez para tirar el
primer dado, y de nuevo para tirar el segundo. Después debe calcularse la suma de
los dos valores. Cada dado puede mostrar un valor entero del 1 al 6, por lo que la
suma de los valores variará del 2 al 12, siendo 7 la suma más frecuente, mientras
que 2 y 12 serán las sumas menos frecuentes. En la figura 7.28 se muestran las 36
posibles combinaciones de los dos dados. Su aplicación debe tirar los dados 36,000,000
de veces.
Utilice un arreglo unidimensional para registrar el número de veces que aparezca cada }
una de las posibles sumas.  Muestre los resultados en formato tabular.

*/

import java.util.Random;

public class Main {
    public static void main(String[] args) {
       int[] arregloDados = new int[11];
       Random miAleatorio = new Random();
       int suma = 0;
       int dado1, dado2;
       int sumaDosDAdos = 2;
       for (int i = 0; i <36000000; i++){
           suma= miAleatorio.nextInt(6)+1 + miAleatorio.nextInt(6)+1;
           ++arregloDados[suma-2];

       }

       for(int numero: arregloDados){
           System.out.print(sumaDosDAdos + "\t= ");
           System.out.println(numero);
           sumaDosDAdos+=1;
       }

    }
}