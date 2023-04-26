import javax.swing.*;

public class Main {

    /*Main é um método auto executavel em Java*/
    public static void main(String[] args) {
        /*Escreve texto no console*/
        System.out.println("Primeiro Programa em Java");

        //JOptionPane é importada da lib swing, utilizada para mostrar caixas de dialogo com input.
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

        //Mostra uma caixa de dialogo com sim e não, sim é 0 e não é 1
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o que você digitou?");

        if(resposta == 0){
            //JOptionPane é importada da lib swing, utilizada para mostrar caixas de dialogo
            JOptionPane.showMessageDialog(null, "Olá, " + nome + ", você tem: " + idade);

        }
    }
}