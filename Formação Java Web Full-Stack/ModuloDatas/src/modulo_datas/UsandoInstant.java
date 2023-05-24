package modulo_datas;

import java.time.Duration;
import java.time.Instant;

/*O Instants usamos quando queremos saber quanto tempo um processo está demorando para ser executado*/
public class UsandoInstant {
    public static void main(String[] args) throws InterruptedException {

        Instant inicio = Instant.now();

        Thread.sleep(2000); /*Pode ser um processo com tempo qualquer que não conhecemos*/

        Instant iFinal = Instant.now();

        Duration duracao = Duration.between(inicio, iFinal);

        System.out.println("Duração em nano segundos: " + duracao.toNanos());
        System.out.println("Duração em minutos: " + duracao.toMinutes());
        System.out.println("Duração em segundos: " + duracao.toSeconds());
        System.out.println("Duração em horas: " + duracao.toHours());
        System.out.println("Duração em milisegundos: " + duracao.toMillis());

    }
}
