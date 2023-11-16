package model;

import java.util.List;

public class Fornecedor {

    private Integer cnpj;
    private String contato;
    private String nome;
    private List<Produto> produtos;

    public Fornecedor(Integer cnpj, String contato, String nome, Produto produto) {
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
        this.produto = produto;
    }
}
