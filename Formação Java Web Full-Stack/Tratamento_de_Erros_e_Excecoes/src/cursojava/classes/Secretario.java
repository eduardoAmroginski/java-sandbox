package cursojava.classes;

import cursojava.constantes.AcessoSecretario;
import cursojava.interfaces.PermitirAcesso;

/* Classe filha de pessoa, extende de Pessoa */
public class Secretario extends Pessoa implements PermitirAcesso {

    private String registro;
    private String nivelCargo;
    private String experiencia;

    private String login;
    private String senha;

    public Secretario(String login, String senha){
        this.setLogin(login);
        this.setSenha(senha);
    }

    public Secretario(){

    }

    @Override
    public double salario() {
        return 2100 * 0.98;
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

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Secretario{" +
                "registro='" + registro + '\'' +
                ", nivelCargo='" + nivelCargo + '\'' +
                ", experiencia='" + experiencia + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                '}';
    }

    /* Esse é o metodo do contrato de autenticação */
    @Override
    public boolean autenticar(String login, String senha) {
        this.setLogin(login);
        this.setSenha(senha);
        return autenticar();
    }

    @Override
    public boolean autenticar() {
        return this.login.equals(AcessoSecretario.LOGIN) && this.senha.equals(AcessoSecretario.SENHA);
    }
}
