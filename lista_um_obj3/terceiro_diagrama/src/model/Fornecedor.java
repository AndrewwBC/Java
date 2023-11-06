package model;

public class Fornecedor {

    private Integer cnpj;
    private String contato;
    private String nome;
    private Produto produto;

    public boolean manterFornec(Integer cnpj) {
        return true;
    }

    public Fornecedor(Integer cnpj, String contato, String nome) {
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
    }

    public Fornecedor(Integer cnpj, String contato, String nome, Produto produto) {
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
        this.produto = produto;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "cnpj=" + cnpj +
                ", contato='" + contato + '\'' +
                ", nome='" + nome + '\'' +
                ", produto=" + produto +
                '}';
    }
}
