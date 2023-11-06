package controller;


import model.*;

import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ContasController {
    public static void main(String[] args) {

        Cliente andrew = new Cliente("Andrew", 100, 10);
        Cliente bruno = new Cliente("Bruno", 400, 20);
        Cliente carlos = new Cliente("Carlos", 600, 30);

        ContaPoupanca cp1 = new ContaPoupanca();
        ContaPoupanca cp2 = new ContaPoupanca();
        ContaPoupanca cp3 = new ContaPoupanca();

        ContaCorrente cc1 = new ContaCorrente(3520, 300, 10);
        ContaCorrente cc2 = new ContaCorrente(7200,600,30);
        ContaCorrente cc3 = new ContaCorrente(87000,600,30);

        List<Conta> contas = new ArrayList<>();
        contas.add(cp1);
        contas.add(cp2);
        contas.add(cp3);
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);


        //contas.forEach(conta -> {
        //  System.out.println(conta.toString());
        // });

        cp1.deposita(1000);
        cp1.atualiza(5);
        cp1.saca(50);
        cp2.deposita(333);
        cp3.deposita(777);

        cc1.deposita(500);
        cc1.saca(400);
        cc2.deposita(444);
        cc3.deposita(888);


        List<Associado> associadoList = new ArrayList<>();
        associadoList.add(andrew);
        associadoList.add(bruno);
        associadoList.add(carlos);
        associadoList.add(cc1);
        associadoList.add(cc2);
        associadoList.add(cc3);



        /* F */
        associadoList.sort(Comparator.comparing(Associado::getQuantidadeDeCotas).reversed());
        //System.out.println(associadoList);

        double cotaMax = associadoList.stream().max(Comparator.comparing(Associado::getQuantidadeDeCotas)).get().getQuantidadeDeCotas();
        System.out.println(cotaMax);

        associadoList.forEach(associado -> {
            if(associado.getQuantidadeDeCotas() == cotaMax){
               // System.out.println(associado);
            }
        });
        // fim da tentativa força bruta

       List<Associado> maioresCotas = associadoList.stream().filter(associado -> associado.getQuantidadeDeCotas() == cotaMax).collect(Collectors.toList());

        System.out.println(maioresCotas);

        /* FIM F */


        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        //System.out.println(contas);

        associadoList.forEach(associado -> {
            if(associado instanceof Conta) {
                //System.out.println(associado);
            }
        });

        Optional<Conta> maiorSaldoConta = contas.stream().max(Comparator.comparing(Conta::getSaldo));
        //System.out.println(maiorSaldoConta);

    }
}


















