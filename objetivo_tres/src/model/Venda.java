package model;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<Item> itensVendidos = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();
    private Vendedor vendedor;
    private Pedido pedido;
    private Double totalPedido;


    public Venda(List<Item> itensVendidos, List<Produto> produtos, Vendedor vendedor, Pedido pedido, Double totalPedido) {
        this.itensVendidos = itensVendidos;
        this.produtos = produtos;
        this.vendedor = vendedor;
        this.pedido = pedido;
        this.totalPedido = totalPedido;
    }

    public void reduzEstoque(){
        itensVendidos.forEach(item -> {
            item.getProdutos().forEach(produto -> {
                produto.reduzirEstoque(item.getQuantidade());
            });
        });
    }

    @Override
    public String toString() {
        return "Venda{" +
                "itensVendidos=" + itensVendidos +
                ", produtos=" + produtos +
                ", vendedor=" + vendedor +
                ", pedido=" + pedido +
                ", totalPedido=" + totalPedido +
                '}';
    }
}
