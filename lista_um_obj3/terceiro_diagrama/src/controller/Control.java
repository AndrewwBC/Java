package controller;

import model.Fornecedor;
import model.Fornecimento;
import model.Produto;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Control {
    public static void main(String[] args) {

        Fornecedor tioDosPapel = new Fornecedor(111, "539999999", "tioDosPapel");
        Fornecedor tioDasCaneta = new Fornecedor(222, "538654566", "tioDasCaneta");

        Produto papel = new Produto(1, "Papel", 120, 12.00, tioDosPapel);
        Fornecimento fornecimentoUm = new Fornecimento("05/05/2023", papel.getPreco() * papel.getQuantidade());

        Produto caneta = new Produto(2, "Caneta", 99, 14.00, tioDasCaneta);
        Fornecimento fornecimentoDois = new Fornecimento("06/06/2023", caneta.getPreco() * caneta.getQuantidade());

        Produto caderno = new Produto(3, "Caderno", 77, 25.00, tioDosPapel);
        Fornecimento fornecimentoTres = new Fornecimento("07/07/2023", caderno.getPreco() * caderno.getQuantidade());

        List<Fornecimento> fornecimentoList = new ArrayList<>();
        fornecimentoList.add(fornecimentoUm);
        fornecimentoList.add(fornecimentoDois);
        fornecimentoList.add(fornecimentoTres);

        fornecimentoList.forEach(fornecimento -> {
            System.out.println(fornecimento.getValorTotal());
        });


    }
}
