package cursojava.interfaces;

/* Essa Interface será o nosso contrato de autenticação */
public interface PermitirAcesso {

//    public boolean autenticar(); /*Apenas declaração do metodo que será reescrito em "quem" firmar o contrato com esta interface*/
    public boolean autenticar(String login, String senha);

    public boolean autenticar();
}
