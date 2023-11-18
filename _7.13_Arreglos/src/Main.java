/*7.13 Etiquete los elementos del arreglo bidimensional ventas de tres por cinco, para indicar el
 orden en el que se establecen en cero, mediante el siguiente fragmento de programa:
for (int fila = 0; fila < ventas.length; fila++)
{
for (int col = 0; col < ventas[fila].length; col++)
{
ventas[fila][col] = 0;
}
}*/

public class Main {
    public static void main(String[] args) {

        int[][] ventas = new int[3][5];

        for (int fila = 0; fila < ventas.length; fila++) {
            for (int col = 0; col < ventas[fila].length; col++) {
                ventas[fila][col] = 0;
                System.out.printf("Se puso a cero el elemento[%d][%d]\n", fila, col);
            }
        }
    }
}