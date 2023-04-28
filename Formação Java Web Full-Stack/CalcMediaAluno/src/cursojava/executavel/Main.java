package cursojava.executavel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int resposta = 0;

        do {
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota: "));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota: "));
            double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota: "));

            double media = (nota1 + nota2 + nota3) / 3;

            JOptionPane.showMessageDialog(null, String.format("A Media é: %.2f", media));

            resposta = JOptionPane.showConfirmDialog(null, "Você quer ver se passou?");

            if (resposta == 0) {
                if (media >= 5) {

                    if (media >= 7) {
                        JOptionPane.showMessageDialog(null, "Parabéns, você passou!!!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Você está em recuperação");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Infelizmente você reprovou!");

                }
            }

            resposta = JOptionPane.showConfirmDialog(null, "Tentar novamente?");

        } while (resposta == 0);


    }
}