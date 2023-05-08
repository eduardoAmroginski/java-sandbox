package cursojava.executavel;


import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Eduardo Amroginski");
        aluno.setIdade(18);

        Diretor diretor = new Diretor();
        diretor.setNome("Leon S. Kennedy");
        diretor.setIdade(40);

        Secretario secretario = new Secretario();
        secretario.setNome("Jill Valentine");
        secretario.setIdade(18);


        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);

        System.out.println(aluno.pessoaMaiorIdade() + " " + aluno.msgMaiorIdade());
        System.out.println(diretor.pessoaMaiorIdade());
        System.out.println(secretario.pessoaMaiorIdade());

        System.out.println(aluno.salario());
        System.out.println(diretor.salario());
        System.out.println(secretario.salario());

        teste(aluno);
        teste(diretor);
        teste(secretario);

    }

    public static void teste(Pessoa pessoa){
        System.out.println("Essa pessoa é demais = " + pessoa.getNome() + " e o salário é de " + pessoa.salario());
    }

}