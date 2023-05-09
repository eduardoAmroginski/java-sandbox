package cursojava.executavel;


import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.interfaces.PermitirAcesso;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String login = JOptionPane.showInputDialog("Informe o login:");
        String senha = JOptionPane.showInputDialog("Informe a senha:");


//        PermitirAcesso permitirAcesso = new Secretario(login, senha);

        if(new FuncaoAutenticacao(new Diretor(login, senha)).autenticar() || new FuncaoAutenticacao(new Secretario(login, senha)).autenticar()) {

            System.out.println("------ Secretário autenticado com sucesso! ------");

            Aluno aluno = new Aluno();
            aluno.setNome("Eduardo Amroginski");
            aluno.setIdade(18);

            Diretor diretor = new Diretor();
            diretor.setNome("Leon S. Kennedy");
            diretor.setIdade(40);

//            Secretario secretario = new Secretario();
//            secretario.setNome("Jill Valentine");
//            secretario.setIdade(18);


            System.out.println(aluno);
            System.out.println(diretor);
//            System.out.println(secretario);

            System.out.println(aluno.pessoaMaiorIdade() + " " + aluno.msgMaiorIdade());
            System.out.println(diretor.pessoaMaiorIdade());
//            System.out.println(secretario.pessoaMaiorIdade());

            System.out.println(aluno.salario());
            System.out.println(diretor.salario());
//            System.out.println(secretario.salario());

            teste(aluno);
            teste(diretor);
//            teste(secretario);
        } else {
            JOptionPane.showMessageDialog(null,"Usuário não permitido!");
        }
    }

    public static void teste(Pessoa pessoa){
        System.out.println("Essa pessoa é demais = " + pessoa.getNome() + " e o salário é de " + pessoa.salario());
    }


}