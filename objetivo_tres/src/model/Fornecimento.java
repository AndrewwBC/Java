package model;

import java.util.Date;

public class Fornecimento {

    private String data;
    private Double valorTotal;
    private Fornecedor fornecedor;
    private Produto produto;

    public Fornecimento(String data, Double valorTotal, Fornecedor fornecedor, Produto produto) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.fornecedor = fornecedor;
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Fornecimento{" +
                "data='" + data + '\'' +
                ", valorTotal=" + valorTotal +
                ", fornecedor=" + fornecedor +
                ", produto=" + produto +
                '}';
    }
}
