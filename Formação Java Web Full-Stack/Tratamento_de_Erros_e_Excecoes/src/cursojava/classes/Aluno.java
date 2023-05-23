package cursojava.classes;

import cursojava.constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*Classe/Objeto que representa o Aluno*/
/* Classe filha de pessoa, extende de Pessoa */
public class Aluno extends Pessoa {

    /* Esses são os atributos do aluno, por padrão são private */
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;

    @Override
    public double salario() {
        return 0;
    }

    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    //Podemos definir mais de um construtor para uma mesma classe
    // Construtor 1
    public Aluno() {

    }

    // Construtor 2
    public Aluno(String nomePadrao, int idadePadrao) {
        nome = nomePadrao;
        idade = idadePadrao;
    }

    /* Veremos os metodos SETTERS e GETTERS do Objeto */
    /* SET é para adicionar ou receber dados para os atributos */
    /* Get é para resgatar ou obter o valor do atributo */

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public double getMediaNota() {
        double somaNotas = 0.0;
        for (Disciplina disciplina : disciplinas){
            somaNotas += disciplina.getNota();
        }

        return somaNotas/ disciplinas.size();
    }

    public boolean getAlunoAprovado() {
        double media = this.getMediaNota();

        if (media >= 7) {
            return true;
        } else {
            return false;
        }
    }

    public String getAlunoAprovado2() {
        double media = this.getMediaNota();

        if (media >= 5) {
            if (media >= 7){
                return StatusAluno.APROVADO;
            }else{
                return StatusAluno.RECUPERACAO;
            }
        } else {
            return StatusAluno.REPROVADO;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(numeroCpf, aluno.numeroCpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroCpf);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "dataMatricula='" + dataMatricula + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +
                ", disciplinas=" + disciplinas +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                '}';
    }

    @Override /*Identifica método sobreescrito*/
    public boolean pessoaMaiorIdade() {
        return this.idade >= 21;
    }

    public String msgMaiorIdade(){
        return this.pessoaMaiorIdade() ? "Aluno maior de idade" : "Aluno menor de idade";
    }

}
