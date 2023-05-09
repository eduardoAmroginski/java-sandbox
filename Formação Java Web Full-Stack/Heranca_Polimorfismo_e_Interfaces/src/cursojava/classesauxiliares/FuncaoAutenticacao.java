package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/* Essa função ira apenas recer alguem que tem o contrato da interface de PermitirAcesso e chamar o autenticacao() */
public class FuncaoAutenticacao {

    private PermitirAcesso permitirAcesso;

    public boolean autenticar(){
        return this.permitirAcesso.autenticar();
    }

    public FuncaoAutenticacao(PermitirAcesso acesso){
        this.permitirAcesso = acesso;
    }

}
