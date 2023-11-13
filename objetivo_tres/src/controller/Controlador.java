package controller;

import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Controlador {
    public static void main(String[] args) {

        Vendedor joaoVendedor = new Vendedor(123, "Joao", "Rua 2", "Tereza", "99999", "Pelotas", "RS","local");

        Produto p1 = new Produto(123, "p1", 123,12.00);
        Item itemUm = new Item(123, 0.0, 20, p1);

        Pedido pedidoUm = new Pedido(14, "22/05/2023", itemUm.getQuantidade()  * p1.getPreco(), itemUm);
        p1.reduzirEstoque(itemUm.getQuantidade());

        List<Item> itensUm = new ArrayList<>();
        itensUm.add(itemUm);


        Produto p2 = new Produto(222, "p2", 223, 14.00);
        Item itemDois = new Item(222, 0.0, 20, p2);
        Pedido pedidoDois = new Pedido(14, "22/05/2023", itemDois.getQuantidade() * p2.getPreco(), itemDois);
        p2.reduzirEstoque(itemDois.getQuantidade());

        List<Item> itensPedidoDois= new ArrayList<>();
        itensPedidoDois.add(itemDois);


        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedidoUm);
        pedidos.add(pedidoDois);

        pedidos.forEach(pedido -> {
            System.out.println(pedido);
        });

        List<Produto> todosProdutosAposVenda = new ArrayList<>();
        todosProdutosAposVenda.add(p1);
        todosProdutosAposVenda.add(p2);

        // reduçao do estoque
        todosProdutosAposVenda.forEach(produto -> {
            System.out.println(produto.getQuantidade());
        });

        // relacao produto com fornecedor corrigido
        Fornecedor f1 = new Fornecedor(222, "30303030", "tioDosProduto", p1);
        p1.setFornecedor(f1);

        Fornecimento forneUm = new Fornecimento(LocalDate.now(), p1.getPreco() * p1.getQuantidade(), f1, p1);
        p1.receberEstoque(100);

        Fornecimento forneDois = new Fornecimento(LocalDate.now(), p2.getPreco() * p2.getQuantidade(), f1, p2);
        p2.receberEstoque(100);

        List<Fornecimento> fornecimentoList = new ArrayList<>();
        fornecimentoList.add(forneUm);
        fornecimentoList.add(forneDois);

        Double custoTotalFornecimento = 0.0;

        for (Fornecimento fornecimento1 : fornecimentoList) {
            custoTotalFornecimento += fornecimento1.getValorTotal();
        }

        // correção valor total fornecimentos
        System.out.println(custoTotalFornecimento);

        fornecimentoList.forEach(fornecimento -> {
            System.out.println(fornecimento);
        });

    }
}
