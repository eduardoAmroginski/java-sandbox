package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

/* Classe filha de pessoa, extende de Pessoa */
public class Diretor extends Pessoa implements PermitirAcesso {
    private String registroEducacao;
    private int tempoDirecao;
    private String titulacao;

    private String login;
    private String senha;


    public Diretor(String login, String senha){
        this.setLogin(login);
        this.setSenha(senha);
    }

    public Diretor(){

    }

    @Override
    public double salario() {
        return 5500.0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getRegistroEducacao() {
        return registroEducacao;
    }

    public void setRegistroEducacao(String registroEducacao) {
        this.registroEducacao = registroEducacao;
    }

    public int getTempoDirecao() {
        return tempoDirecao;
    }

    public void setTempoDirecao(int tempoDirecao) {
        this.tempoDirecao = tempoDirecao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "registroEducacao='" + registroEducacao + '\'' +
                ", tempoDirecao=" + tempoDirecao +
                ", titulacao='" + titulacao + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                '}';
    }

    @Override
    public boolean autenticar(String login, String senha) {
        this.setLogin(login);
        this.setSenha(senha);
        return autenticar();
    }

    @Override
    public boolean autenticar() {
        return this.login.equals("diretor") && this.senha.equals("1234");
    }

}
