package model;

public class Fornecedor {

    private Integer cnpj;
    private String contato;
    private String nome;
    private Produto produto;

    public Fornecedor(Integer cnpj, String contato, String nome, Produto produto) {
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
        this.produto = produto;
    }
}
