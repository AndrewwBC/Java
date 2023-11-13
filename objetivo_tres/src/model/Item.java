package model;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private Integer codItem;
    private Double desconto;
    private Integer quantidade;

    //correção da multiplicidade
    private Produto produto;

    public Item(Integer codItem, Double desconto, Integer quantidade, Produto produto) {
        this.codItem = codItem;
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Integer getCodItem() {
        return codItem;
    }

    public void setCodItem(Integer codItem) {
        this.codItem = codItem;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "codItem=" + codItem +
                ", desconto=" + desconto +
                ", quantidade=" + quantidade +
                ", produto=" + produto +
                '}';
    }
}
