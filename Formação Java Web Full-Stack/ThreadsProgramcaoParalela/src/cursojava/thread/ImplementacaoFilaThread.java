package cursojava.thread;

import cursojava.classes.ObjetoFilaThread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

    private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha = new ConcurrentLinkedQueue<ObjetoFilaThread>();

    public static void add(ObjetoFilaThread objetoFilaThread) {
        pilha_filha.add(objetoFilaThread);
    }

    @Override
    public void run() {

        System.out.println("A fila de Threads está rodando");


        while (true) {
            Iterator iteracao = pilha_filha.iterator();
            synchronized (iteracao) { /*Bloqueia o acesso a esta lista por outros processos*/
                while (iteracao.hasNext()) { /*Enquanto conter dados na lista irá processar*/

                    ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); /*Pega o Objeto atual*/

                    /*Processar 10 mil notas fiscais*/
                    /*Gerar uma lista enorme de PDF*/
                    /*Gerar um envio em massa de emails*/

                    System.out.println("-----------------------------------------------------");
                    System.out.println(processar.getNome());
                    System.out.println(processar.getEmail());

                    iteracao.remove();

                    try {
                        Thread.sleep(1000); /*Dar um tempo para descarga de memória*/
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }

            try {
                Thread.sleep(1000); /*Processou toda a lista, dá um tempo para limpeza de memória*/
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
