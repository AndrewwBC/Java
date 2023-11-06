package controller;

import model.Produto;

import java.util.*;

public class ProdutoController {
    public static void main(String[] args) {

        Produto copo = new Produto("copo", "feito de vidro", 20.99, 6);
        Produto pano = new Produto("pano", "feito de tecido", 5.99, 80);
        Produto lapis = new Produto("lapis", "grafite europeu", 3.99, 258 );
        Produto caderno = new Produto("caderno", "capa de couro", 45.20, 42);
        Produto calca = new Produto("calça", "jeans azul", 99.99, 20);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(copo);
        produtos.add(pano);
        produtos.add(lapis);
        produtos.add(caderno);
        produtos.add(calca);

        Optional<Produto> produtoFiltrado = produtos.stream().filter(produto -> produto.getValor() == 3.99).findAny();

        System.out.println(produtoFiltrado);

        Map<String, Produto> produtoMap = new HashMap<>();
        produtoMap.put(copo.getNome(), copo);
        produtoMap.put(pano.getNome(), pano);
        produtoMap.put(lapis.getNome(), lapis);
        produtoMap.put(caderno.getNome(), caderno);
        produtoMap.put(calca.getNome(), calca);

        System.out.println(produtoMap.get("calça"));
    }
}
