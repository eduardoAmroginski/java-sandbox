package cursojava.thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TelaTimeThread extends JDialog {

    /*Declaração dos componentes que serão utilizados dentro da tela*/
    private JPanel jPanel = new JPanel(new GridBagLayout()); /*Painel de componentes*/
    private JLabel descricaoHora = new JLabel("Time Thread 1");
    private JTextField mostraTempo = new JTextField();

    private JLabel descricaoHora2 = new JLabel("Time Thread 2");
    private JTextField mostraTempo2 = new JTextField();

    private JButton jButtonStart = new JButton("Start");
    private JButton jButtonStop = new JButton("Stop");

    private Runnable thread1 = new Runnable() {
        @Override
        public void run() {
            while (true){ /*fica sempre rodando*/
                Date date = Calendar.getInstance().getTime();
                mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(date));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    private Runnable thread2 = new Runnable() {
        @Override
        public void run() {
            while (true){ /*fica sempre rodando*/
                Date date = Calendar.getInstance().getTime();
                mostraTempo2.setText(new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(date));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    private Thread thread1Time;
    private Thread thread2Time;

    public TelaTimeThread() { /*Executa o que estiver dentro no momento da instanciação do objeto*/

        /*Configurações iniciais da tela*/
        setTitle("Minha tela de time com Thread");
        setSize(new Dimension(240, 240));
        setResizable(false);
        setLocationRelativeTo(null);

        GridBagConstraints gridBagConstraints = new GridBagConstraints(); /*Controlador de posicionamento de componentes*/
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2; /*Define quanto os proximos componentes ocuparam de espaço (colunas)*/
        gridBagConstraints.insets = new Insets(5, 10, 5, 5);
        gridBagConstraints.anchor = GridBagConstraints.WEST;

        descricaoHora.setPreferredSize(new Dimension(200, 25));
        jPanel.add(descricaoHora, gridBagConstraints);

        mostraTempo.setPreferredSize(new Dimension(200, 25));
        mostraTempo.setEditable(false);
        gridBagConstraints.gridy++; /*Anda na gridY (linha)*/
        jPanel.add(mostraTempo,gridBagConstraints);

        descricaoHora2.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy++;
        jPanel.add(descricaoHora2, gridBagConstraints);

        mostraTempo2.setPreferredSize(new Dimension(200, 25));
        mostraTempo2.setEditable(false);
        gridBagConstraints.gridy++;
        jPanel.add(mostraTempo2,gridBagConstraints);

        gridBagConstraints.gridwidth = 1; /*Define quanto os proximos componentes ocuparam de espaço (colunas)*/
        jButtonStart.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridy++;
        jPanel.add(jButtonStart, gridBagConstraints);

        jButtonStop.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridx++; /*Anda na gridX (coluna)*/
        jPanel.add(jButtonStop, gridBagConstraints);

        jButtonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thread1Time = new Thread(thread1);
                thread2Time = new Thread(thread2);
                thread1Time.start();
                thread2Time.start();
                jButtonStart.setEnabled(false);
                jButtonStop.setEnabled(true);
            }
        });

        jButtonStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thread1Time.stop();
                thread2Time.stop();
                jButtonStart.setEnabled(true);
                jButtonStop.setEnabled(false);
            }
        });

        jButtonStop.setEnabled(false);
        add(jPanel, BorderLayout.WEST);
        setVisible(true);/*Torna a tela visivel para o usuário, sempre será o ultimo comando*/
    }
}
