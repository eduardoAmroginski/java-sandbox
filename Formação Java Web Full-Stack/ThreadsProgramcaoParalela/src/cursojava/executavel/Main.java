package cursojava.executavel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        /*Thread processando em paralelo do envio de email*/
        Thread threadEmail = new Thread(thread1);
        threadEmail.start();

        /****** Divisão das Threads  ******/

        /*Thread processando em paralelo do envio de nota fiscal*/
        Thread threadNotaFiscal = new Thread(thread2);
        threadNotaFiscal.start();

        /*Código do sistema do usuário continua o fluxo de trabalho*/
        System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD USANDO SLEEP");
        JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
    }

    private static Runnable thread1 = new Runnable() {
        @Override
        public void run() {
            /*código da rotina*/

            /*Código da rotina que eu quero executar em paralelo*/
            for (int i = 0; i < 10; i++) {
                /*Quero executar esse envio com um tempo de parada, ou com um tempo determinado*/
                System.out.println("Executando alguma rotina, por exemplo envio de email");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }

            }
            /*Fim do código em paralelo*/
        }
    };

    private static Runnable thread2 = new Runnable() {
        @Override
        public void run() {
            /*código da rotina*/

            /*Código da rotina que eu quero executar em paralelo*/
            for (int i = 0; i < 10; i++) {
                /*Quero executar esse envio com um tempo de parada, ou com um tempo determinado*/
                System.out.println("Executando alguma rotina, por exemplo envio de nota fiscal");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }

            }
            /*Fim do código em paralelo*/
        }
    };

}
