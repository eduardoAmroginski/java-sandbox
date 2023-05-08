package cursojava.loja;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Long id;
    private String descricaoVenda;
    private String nomeCliente;
    private String enderecoEntrega;
    private BigDecimal valorTotal;

    private List<Produto> listaProdutos = new ArrayList<Produto>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricaoVenda() {
        return descricaoVenda;
    }

    public void setDescricaoVenda(String descricaoVenda) {
        this.descricaoVenda = descricaoVenda;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public BigDecimal getValorTotal() {
        this.setValorTotal(BigDecimal.valueOf(this.totalVenda()));
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    private double totalVenda(){
        double valorTotalVenda = 0.0;
        for (Produto produto : this.getListaProdutos()) {
            valorTotalVenda += produto.getValor().doubleValue();
        }
        return valorTotalVenda;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", descricaoVenda='" + descricaoVenda + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", enderecoEntrega='" + enderecoEntrega + '\'' +
                ", valorTotal=" + valorTotal +
                ", listaProdutos=" + listaProdutos +
                '}';
    }


}
