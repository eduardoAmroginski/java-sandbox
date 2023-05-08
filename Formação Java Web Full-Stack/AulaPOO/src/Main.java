import cursojava.loja.Produto;
import cursojava.loja.Venda;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.setId(1L);
        produto1.setNome("Modulo POO");
        produto1.setValor(BigDecimal.valueOf(100));

        Produto produto2 = new Produto();
        produto2.setId(2L);
        produto2.setNome("Modulo Spring Boot API Rest");
        produto2.setValor(BigDecimal.valueOf(50));

        Produto produto3 = new Produto();
        produto3.setId(3L);
        produto3.setNome("Modulo Angular");
        produto3.setValor(BigDecimal.valueOf(250));

        Produto produto4 = new Produto();
        produto4.setId(4L);
        produto4.setNome("Modulo Angular");
        produto4.setValor(BigDecimal.valueOf(389.90));

        Venda venda = new Venda();
        venda.setDescricaoVenda("Venda Curso Formação Java");
        venda.setEnderecoEntrega("Entrega pelo E-mail");
        venda.setId(10L);
        venda.setNomeCliente("Eduardo Amroginski");

        venda.getListaProdutos().add(produto1);
        venda.getListaProdutos().add(produto2);
        venda.getListaProdutos().add(produto3);
        venda.getListaProdutos().add(produto4);

        System.out.println(venda);

        for (Produto produto : venda.getListaProdutos()) {
            System.out.println(produto);
        }

        System.out.println("Total: " + venda.getValorTotal());

    }
}