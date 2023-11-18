/*7.16 (Uso de la instrucción formejorada) Escriba una aplicación que utilice una
instrucción for mejorada para sumar los valores double que se pasan mediante los
argumentos de línea de comandos. [Sugerencia: use el método static parseDouble de
la clase Double para convertir un String en un valor double].*/
public class Main {
    public static void main(String[] args) {
        double suma = 0;
        for(String numero: args)
            suma += Double.parseDouble(numero);

        System.out.println("La suma da: "+ suma);
    }
}