/*7.18 (Juego de Craps) Escriba una aplicación que ejecute 1,000,000 de juegos de Craps
(figura 6.8) y responda a las siguientes preguntas:
a) ¿Cuántos juegos se ganan en el primer tiro, en el segundo, …, en el vigésimo y después de éste?
b) ¿Cuántos juegos se pierden en el primer tiro, en el segundo, …, en el vigésimo y después de éste?
c) ¿Cuáles son las probabilidades de ganar en Craps? [Nota: debe descubrir que Craps es uno de los juegos
de casino más justos. ¿Qué cree usted que significa esto?].
d) ¿Cuál es la duración promedio de un juego de Craps?
e) ¿Las probabilidades de ganar mejoran con la duración del juego?

REGLAS:
Un jugador tira dos dados. Cada uno tiene seis caras, las cuales contienen uno, dos, tres cuatro, cinco
y seis puntos negros, respectivamente. Una vez que los dados dejan de moverse, se calcula la suma de
los puntos negros en las dos caras superiores. Si la suma es 7 u 11 en el primer tiro, el jugador gana. Si
la suma es 2, 3 o 12 en el primer tiro (llamado “Craps”), el jugador pierde (es decir, la “casa” gana).
Si la suma es 4, 5, 6, 8, 9 o 10 en el primer tiro, esta suma se convierte en el “punto” del jugador.
Para ganar, el jugador debe seguir tirando los dados hasta que salga otra vez “su punto” (es decir, que
tire ese mismo valor de punto). El jugador pierde si tira un 7 antes de llegar a su punto.
*/

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int sumaDados = tiraDados();
        int miPuntoParaGanar = 0;
        boolean gana = false;
        boolean sigueJugando = false;
        switch (sumaDados){
            case 2:
            case 3:
            case 12:
                gana = false;
                break;
            case 7:
            case 11:
                gana = true;
                break;
            default:
                sigueJugando = true;
                System.out.println("Debes sacar " + sumaDados + " para ganar, si sale un 7 antes perderás!");
                miPuntoParaGanar = sumaDados;
                break;
        }

        while (sigueJugando){
            sumaDados = tiraDados();
            if (sumaDados == 7){
                gana = false;
                sigueJugando = false;
            }else{
                if (sumaDados == miPuntoParaGanar){
                    gana = true;
                    sigueJugando = false;
                }
            }
        }

        if (gana)
            System.out.println("ganaste!!!!");
        else
            System.out.println("Perdiste :(");
    }

    public static int tiraDados(){
        Random miAleatorio = new Random();
        return (miAleatorio.nextInt(6)+1 + miAleatorio.nextInt(6)+1);
    }
}