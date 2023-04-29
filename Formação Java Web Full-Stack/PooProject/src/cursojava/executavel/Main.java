package cursojava.executavel;

import cursojava.classes.Aluno;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno? "));
        String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento? ");
        String rg = JOptionPane.showInputDialog("Qual o RG ");
        String cpf = JOptionPane.showInputDialog("Qual o CPF? ");
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual é a nota1? "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual é a nota2? "));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Qual é a nota3? "));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Qual é a nota4? "));


        /* new Aluno() é uma instancia (Criação de objeto) */
        /* aluno1 é uma referencia para o objeto Aluno*/
        Aluno aluno1 = new Aluno();

        aluno1.setNome(nome);
        aluno1.setIdade(idade);
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistroGeral(rg);
        aluno1.setNumeroCpf(cpf);
        aluno1.setNomeMae("Klebina Silva");
        aluno1.setNomePai("Kleber Jorge");
        aluno1.setDataMatricula("27/04/2023");
        aluno1.setNomeEscola("Vovo Ursulino");
        aluno1.setSerieMatriculado("1");
        aluno1.getDisciplina().setNota1(nota1);
        aluno1.getDisciplina().setNota2(nota2);
        aluno1.getDisciplina().setNota3(nota3);
        aluno1.getDisciplina().setNota4(nota4);
        aluno1.getDisciplina().setDisciplina1("Disciplina 1");
        aluno1.getDisciplina().setDisciplina2("Disciplina 2");
        aluno1.getDisciplina().setDisciplina3("Disciplina 3");
        aluno1.getDisciplina().setDisciplina4("Disciplina 4");

        /* Caso não tenha sido criada um toString() personalziado, será mostrado apenas o endereço na memória do objeto */
        System.out.println(aluno1.toString());
        System.out.println("A média do aluno é: " + aluno1.getMediaNota());
        System.out.println("O aluno está " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));

        /* ----------------------------------------------------------------------------------------------------------------- */
        /* Equals e hashcode (Diferenciar e comparar objetos) */
        /* é necessário criar um metodo equals personalizado e hashcode para comparar dois objetos e seus atributos,
           se não sempre será considerado diferente um do outro */
        /*Aluno aluno1 = new Aluno();
        aluno1.setNome("Alex");
        aluno1.setNumeroCpf("0000000001");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Alex");
        aluno1.setNumeroCpf("0000000002");

        if(aluno1.equals(aluno2)){
            System.out.println("São objetos Aluno iguais");
        }else{
            System.out.println("São objetos Aluno diferentes");
        }*/



    }
}