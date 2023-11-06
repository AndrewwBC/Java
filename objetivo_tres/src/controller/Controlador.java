package controller;

import model.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Controlador {
    public static void main(String[] args) {

        Vendedor joaoVendedor = new Vendedor(123, "Joao", "Rua 2", "Tereza", "99999", "Pelotas", "RS","local");

        Produto p1 = new Produto(123, "p1", 123,12.00);
        Produto p2 = new Produto(222, "p2", 223, 14.00);
        List<Produto> produtosUm = new ArrayList<>();
        produtosUm.add(p1);
        produtosUm.add(p2);

        Produto p3 = new Produto(444, "p3", 444,16.00);
        Produto p4 = new Produto(555, "p4", 555, 18.00);
        List<Produto> produtosDois = new ArrayList<>();
        produtosDois.add(p3);
        produtosDois.add(p4);


        Item itemUm = new Item(123, 0.0, 20, produtosUm);
        Pedido pedidoUm = new Pedido(14, "22/05/2023", itemUm.getQuantidade() * (p1.getPreco() + p2.getPreco()), itemUm);
        List<Item> itensUm = new ArrayList<>();
        itensUm.add(itemUm);

        Item itemDois = new Item(444, 0.0, 40, produtosDois);
        Pedido pedidoDois = new Pedido(14, "22/05/2023", itemDois.getQuantidade() * (p3.getPreco() + p4.getPreco()), itemUm);
        List<Item> itensDois = new ArrayList<>();
        itensUm.add(itemDois);


        Venda primeiraVenda = new Venda(itensUm, produtosUm, joaoVendedor, pedidoUm, pedidoUm.getValor());
        primeiraVenda.reduzEstoque();

        Venda segundaVenda = new Venda(itensDois, produtosDois, joaoVendedor, pedidoDois, pedidoDois.getValor());
        segundaVenda.reduzEstoque();


        List<Venda> vendas = new ArrayList<>();
        vendas.add(primeiraVenda);
        vendas.add(segundaVenda);

        vendas.forEach(venda -> {
            System.out.println(venda);
        });

        List<Produto> todosProdutosAposVenda = new ArrayList<>();
        todosProdutosAposVenda.add(p1);
        todosProdutosAposVenda.add(p2);
        todosProdutosAposVenda.add(p3);
        todosProdutosAposVenda.add(p4);



        Fornecedor f1 = new Fornecedor(222, "30303030", "tioDosProduto", p4);
        Fornecimento forneUm = new Fornecimento("20/05/2023", p3.getPreco() * p3.getQuantidade(), f1, p3);
        p3.receberEstoque(100);

        Fornecimento forneDois = new Fornecimento("20/07/2023", p4.getPreco() * p4.getQuantidade(), f1, p4);
        p4.receberEstoque(100);

        List<Fornecimento> fornecimentoList = new ArrayList<>();
        fornecimentoList.add(forneUm);
        fornecimentoList.add(forneDois);

        fornecimentoList.forEach(fornecimento -> {
            System.out.println(fornecimento);
        });


    }
}
