/*7.15 (Argumentos de línea de comandos) Modifique la figura 7.2, de manera que el
tamaño del arreglo se especifique mediante el primer argumento de línea de comandos.
Si no se suministra un argumento de línea de comandos, use 10 como el valor predeterminado
del arreglo.*/
public class Main {
    public static void main(String[] args) {
        int longitudArreglo = 0;
        if (args.length == 0)
            longitudArreglo = 10;

         else
            longitudArreglo = Integer.parseInt(args[0]);


         int[] arreglo = new int[longitudArreglo];

         System.out.printf("%s%8s%n", "Indice", "Valor");
        System.out.println("=======+=======");

         for (int contador = 0; contador < arreglo.length; contador++)
                System.out.printf("%5d%8d%n", contador, arreglo[contador]);
    }
}