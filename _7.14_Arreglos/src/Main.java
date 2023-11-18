/*7.14 (Lista de argumentos de longitud variable) Escriba una aplicación que calcule el producto
de una serie de enteros que se pasan al método producto; use una lista de argumentos de longitud
variable. Pruebe su método con varias llamadas, cada una con un número distinto de argumentos.*/
public class Main {
    public static void main(String[] args) {
        System.out.println("El producto da: " + producto(2, 3, 4, 10));
        System.out.println("El producto da: "+ producto2 (2,3,4,10));
    }

    public static int producto (int...numeros){
        int numero = 1;
        for(int i = 0; i < numeros.length; i++ )
            numero*=numeros[i];

        return numero;
    }

    public static int producto2 (int...numeros){
        int producto = 1;
        for(int numero: numeros)
            producto *= numero;

        return producto;
    }

}