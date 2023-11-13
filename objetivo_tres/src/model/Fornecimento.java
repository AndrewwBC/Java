package model;

import java.time.LocalDate;
import java.util.Date;

public class Fornecimento {

    private LocalDate data;
    private Double valorTotal;
    private Fornecedor fornecedor;
    private Produto produto;

    public Fornecimento(LocalDate data, Double valorTotal, Fornecedor fornecedor, Produto produto) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.fornecedor = fornecedor;
        this.produto = produto;
    }

    public Double getValorTotal(){
        return this.valorTotal;
    }

    @Override
    public String toString() {
        return "\nFornecimento{" +
                "data='" + data + '\'' +
                ", valorTotal=" + valorTotal +
                ", fornecedor=" + fornecedor +
                ", produto=" + produto +
                '}';
    }
}
