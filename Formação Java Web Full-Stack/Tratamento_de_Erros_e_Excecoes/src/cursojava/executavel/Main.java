package cursojava.executavel;


import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.excecao.ExcecaoProcessarNota;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {

        lerArquivo();

        String login = JOptionPane.showInputDialog("Informe o login:");
        String senha = JOptionPane.showInputDialog("Informe a senha:");

        if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar() || new FuncaoAutenticacao(new Secretario(login, senha)).autenticar()) {

            System.out.println("------ Secretário autenticado com sucesso! ------");

            List<Aluno> alunos = new ArrayList<Aluno>();

            for (int qtd = 1; qtd <= 2; qtd++) {
                Aluno aluno = new Aluno();
                aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
                aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno: ")));

                alunos.add(aluno);
            }

            for (Aluno aluno : alunos) {
                System.out.println(aluno);
                System.out.println(aluno.pessoaMaiorIdade() + " = " + aluno.msgMaiorIdade());
                System.out.println(aluno.salario());
                teste(aluno);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Usuário não permitido!");
        }

        }catch (NumberFormatException e){
            StringBuilder saida = new StringBuilder();

            /*Imprime erro no console Java*/
            e.printStackTrace();

            /*Mensagem do erro ou causa*/
            System.out.println("Mensagem: " + e.getMessage());

            for(int i = 0; i < e.getStackTrace().length; i++){
                saida.append("\nClasse de erro: " + e.getStackTrace()[i].getClassName());
                saida.append("\nMétodo de erro: " + e.getStackTrace()[i].getMethodName());
                saida.append("\nErro na linha: " + e.getStackTrace()[i].getLineNumber());
            }


            JOptionPane.showMessageDialog(null,"Erro de conversão de numero " + saida.toString());
        }catch (NullPointerException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Ocorreu um Null Pointer Exception: " + e.getClass());
        }catch (ExcecaoProcessarNota e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Erro da Exceção customizada: " + e.getClass());
        }catch (Exception e ){ /*Captura todas as exceções que não prevemos*/
            StringBuilder saida = new StringBuilder();

            /*Imprime erro no console Java*/
            e.printStackTrace();

            /*Mensagem do erro ou causa*/
            System.out.println("Mensagem: " + e.getMessage());

            for(int i = 0; i < e.getStackTrace().length; i++){
                saida.append("\nClasse de erro: " + e.getStackTrace()[i].getClassName());
                saida.append("\nMétodo de erro: " + e.getStackTrace()[i].getMethodName());
                saida.append("\nErro na linha: " + e.getStackTrace()[i].getLineNumber());
            }

            JOptionPane.showMessageDialog(null,"Ocorreu um Erro: " + saida.toString());
        }finally { /*Sempre é executado ocorrendo erros ou não*/
            JOptionPane.showMessageDialog(null, "Obrigado por aprender Java!");
        }

    }


    public static void lerArquivo() throws ExcecaoProcessarNota {
//        try {
//            File file = new File("lines.txt");
//            Scanner scanner = new Scanner(file);
//        }catch (FileNotFoundException e){
//            throw new ExcecaoProcessarNota(e.getMessage());
//        }
    }

    public static void teste(Pessoa pessoa) {
        System.out.println("Essa pessoa é demais = " + pessoa.getNome() + " e o salário é de " + pessoa.salario());
    }


}