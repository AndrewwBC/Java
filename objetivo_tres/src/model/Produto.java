package model;

public class Produto {
    private Integer codigo;
    private String nome;
    private Integer quantidade;
    private Double preco;

    //correção relação produto com fornecedor, interpretado como 1-1
    private Fornecedor fornecedor;

    public Produto(Integer codigo, String nome, Integer quantidade, Double preco, Fornecedor fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }

    public Produto(Integer codigo, String nome, Integer quantidade, Double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void reduzirEstoque(Integer quantidade) {
        this.quantidade -= quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void receberEstoque(Integer quantidade) {
        this.quantidade += quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
