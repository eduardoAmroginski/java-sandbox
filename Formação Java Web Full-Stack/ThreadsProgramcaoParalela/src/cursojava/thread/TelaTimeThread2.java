package cursojava.thread;

import cursojava.classes.ObjetoFilaThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaTimeThread2 extends JDialog {

    /*Declaração dos componentes que serão utilizados dentro da tela*/
    private JPanel jPanel = new JPanel(new GridBagLayout()); /*Painel de componentes*/
    private JLabel nomeLabel = new JLabel("Nome");
    private JTextField nomeInput = new JTextField();

    private JLabel emailLabel = new JLabel("E-mail");
    private JTextField emailInput = new JTextField();

    private JButton jButtonStart = new JButton("Add Lista");
    private JButton jButtonStop = new JButton("Stop");

    private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
    public TelaTimeThread2() { /*Executa o que estiver dentro no momento da instanciação do objeto*/

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

        nomeLabel.setPreferredSize(new Dimension(200, 25));
        jPanel.add(nomeLabel, gridBagConstraints);

        nomeInput.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy++; /*Anda na gridY (linha)*/
        jPanel.add(nomeInput,gridBagConstraints);

        emailLabel.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy++;
        jPanel.add(emailLabel, gridBagConstraints);

        emailInput.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy++;
        jPanel.add(emailInput,gridBagConstraints);

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

                if(fila == null){
                    fila = new ImplementacaoFilaThread();
                    fila.start();
                }

                for (int i = 0; i < 100; i++) {
                    ObjetoFilaThread objeto = new ObjetoFilaThread();
                    objeto.setNome(nomeInput.getText() + " - " + i);
                    objeto.setEmail(emailInput.getText());

                    fila.add(objeto);
                }

            }
        });

        jButtonStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fila.stop();
                fila = null;
                System.out.println("Fila parada!");
            }
        });

        fila.start();
        add(jPanel, BorderLayout.WEST);
        setVisible(true);/*Torna a tela visivel para o usuário, sempre será o ultimo comando*/
    }
}
