package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String login = JOptionPane.showInputDialog("Informe o Login");
        String senha = JOptionPane.showInputDialog("Informe a Senha");

        if (login.equalsIgnoreCase( "admin") && senha.equalsIgnoreCase( "admin123")) {
            List<Aluno> alunos = new ArrayList<Aluno>();

            /*HashMap é uma lista que dentro dela temos uma chave que identifica uma sequencia de valores*/
            HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

            /* Com o uso de HashMap, podemos dispensar as listas abaixo */
            List<Aluno> alunosAprovados = new ArrayList<Aluno>();
            List<Aluno> alunosReprovados = new ArrayList<Aluno>();
            List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();

            for (int quantidade = 1; quantidade <= 5; quantidade++) {

                String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + quantidade + "? ");
//        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno? "));
//        String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento? ");
//        String rg = JOptionPane.showInputDialog("Qual o RG ");
//        String cpf = JOptionPane.showInputDialog("Qual o CPF? ");
//        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual é a nota1? "));
//        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual é a nota2? "));
//        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Qual é a nota3? "));
//        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Qual é a nota4? "));


                /* new Aluno() é uma instancia (Criação de objeto) */
                /* aluno1 é uma referencia para o objeto Aluno*/
                Aluno aluno1 = new Aluno();

                aluno1.setNome(nome);
//        aluno1.setIdade(idade);
//        aluno1.setDataNascimento(dataNascimento);
//        aluno1.setRegistroGeral(rg);
//        aluno1.setNumeroCpf(cpf);
//        aluno1.setNomeMae("Klebina Silva");
//        aluno1.setNomePai("Kleber Jorge");
//        aluno1.setDataMatricula("27/04/2023");
//        aluno1.setNomeEscola("Vovo Ursulino");
//        aluno1.setSerieMatriculado("1");

                for (int pos = 1; pos <= 1; pos++) {
                    String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da disciplina" + pos + "?");
                    double notaDisciplina = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota da disciplina de " + nomeDisciplina + "?"));

                    Disciplina disciplina = new Disciplina();
                    disciplina.setDisciplina(nomeDisciplina);
                    disciplina.setNota(notaDisciplina);

                    aluno1.getDisciplinas().add(disciplina);

                }
                int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

                if (escolha == 0) {

                    int continuarRemovendo = 0;
                    int posicao = 1;
                    while (continuarRemovendo == 0) {
                        int disciplinaRemover = Integer.parseInt(JOptionPane.showInputDialog("Qual a disciplina você deseja remover: 1, 2, 3 ou 4?"));
                        aluno1.getDisciplinas().remove(disciplinaRemover - posicao);
                        posicao++;
                        continuarRemovendo = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
                    }
                }

                alunos.add(aluno1);
            }

//      Questiona se quer remover algum aluno.
            int removerAluno = JOptionPane.showConfirmDialog(null, "Deseja remover algum Aluno?");
            while (removerAluno == 0) {
                String nomeAluno = JOptionPane.showInputDialog("Qual é o nome do aluno a ser removido?");
                for (Aluno aluno : alunos) {
                    if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                        alunos.remove(aluno);
                        System.out.println("Aluno " + nomeAluno + " removido!");
                        break;
                    }
                }
                removerAluno = JOptionPane.showConfirmDialog(null, "Deseja remover outro Aluno?");
            }

//      Mostra os alunos, usando o foreach
            System.out.println(" ---- Pegando os alunos de um forEach ---- ");
            for (Aluno aluno : alunos) {
                /* Caso não tenha sido criada um toString() personalziado, será mostrado apenas o endereço na memória do objeto */
                System.out.println(aluno.toString());
                System.out.println("A média do aluno é: " + aluno.getMediaNota());
                System.out.println("O aluno está " + (aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
                System.out.println("Resultado = " + aluno.getAlunoAprovado2());
                System.out.println("As matérias do aluno(a) são:");
                for (Disciplina disciplina : aluno.getDisciplinas()) {
                    System.out.println(disciplina.getDisciplina());
                }
                System.out.println("-------------------------------------------------------------------------");
            }


//     Mostra os alunos, pela posição
            System.out.println(" ---- Pegando os alunos através da posição ---- ");
            for (int pos = 0; pos < alunos.size(); pos++) {
                Aluno aluno = alunos.get(pos);

                //Substitui determinado aluno
                if (aluno.getNome().equalsIgnoreCase("alex")) {
                    Aluno trocar = new Aluno();
                    trocar.setNome("Aluno foi trocado");

                    Disciplina disciplina = new Disciplina();
                    disciplina.setDisciplina("Matematica");
                    disciplina.setNota(9.6);

                    trocar.getDisciplinas().add(disciplina);
                    alunos.set(pos, trocar);
                    aluno = alunos.get(pos);
                }

                System.out.println("Aluno = " + aluno.getNome());
                System.out.println("Média do aluno = " + aluno.getMediaNota());
                System.out.println("Resultado = " + aluno.getAlunoAprovado2());
                System.out.println("-------------------------------------------------------------------------");

                for (int posDisciplina = 0; posDisciplina < aluno.getDisciplinas().size(); posDisciplina++) {
                    Disciplina disciplina = aluno.getDisciplinas().get(posDisciplina);
                    System.out.println("Matéria = " + disciplina.getDisciplina() + " Nota = " + disciplina.getNota());
                }

            }

//      Separa os alunos em aprovados, reprovados e em recuperação
            for (Aluno aluno : alunos) {
                if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
                    alunosAprovados.add(aluno);
                } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                    alunosRecuperacao.add(aluno);
                } else {
                    alunosReprovados.add(aluno);
                }
            }

            System.out.println("---------------- LISTA DOS ALUNOS APROVADOS ----------------");
            for (Aluno aluno : alunosAprovados) {
                System.out.println("Nome do Aluno: " + aluno.getNome() + " --- Nota Final: " + aluno.getMediaNota());
            }

            System.out.println("---------------- LISTA DOS ALUNOS EM RECUPERAÇÃO  ----------------");
            for (Aluno aluno : alunosRecuperacao) {
                System.out.println("Nome do Aluno: " + aluno.getNome() + " --- Nota Final: " + aluno.getMediaNota());
            }

            System.out.println("---------------- LISTA DOS ALUNOS REPROVADOS  ----------------");
            for (Aluno aluno : alunosReprovados) {
                System.out.println("Nome do Aluno: " + aluno.getNome() + " --- Nota Final: " + aluno.getMediaNota());
            }


            System.out.println("\n\n---------------- USANDO HASHMAP----------------");

            maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
            maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
            maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

            for (Aluno aluno : alunos) {
                if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
                    maps.get(StatusAluno.APROVADO).add(aluno);
                } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                    maps.get(StatusAluno.RECUPERACAO).add(aluno);
                } else {
                    maps.get(StatusAluno.REPROVADO).add(aluno);
                }
            }

            System.out.println("---------------- LISTA DOS ALUNOS APROVADOS USANDO HASHMAP ----------------");
            for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
                System.out.println("Nome do Aluno: " + aluno.getNome() + " --- Nota Final: " + aluno.getMediaNota());
            }

            System.out.println("---------------- LISTA DOS ALUNOS EM RECUPERAÇÃO USANDO HASHMAP ----------------");
            for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
                System.out.println("Nome do Aluno: " + aluno.getNome() + " --- Nota Final: " + aluno.getMediaNota());
            }

            System.out.println("---------------- LISTA DOS ALUNOS REPROVADOS USANDO HASHMAP ----------------");
            for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
                System.out.println("Nome do Aluno: " + aluno.getNome() + " --- Nota Final: " + aluno.getMediaNota());
            }



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
}