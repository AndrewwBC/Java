package controller;

import model.Conta;

import java.util.*;

public class ContaController {
    public static void main(String[] args) {

        Conta contaUm = new Conta(1,300.25);
        Conta contaDois = new Conta(2,400.25);
        Conta contaTres = new Conta(3,500.25);
        Conta contaQuatro = new Conta(4,600.25);
        Conta contaCinco = new Conta(5,700.25);

        List<Conta> contas = new ArrayList<>();
        contas.add(contaUm);
        contas.add(contaDois);
        contas.add(contaTres);
        contas.add(contaQuatro);
        contas.add(contaCinco);

        Optional<Conta> saldoFiltrado =  contas.stream().filter(conta -> conta.getSaldo() == 300.25).findAny();
        System.out.println(saldoFiltrado);

        Map<Integer, Conta> contasMap = new HashMap<>();
        contasMap.put(contaUm.getId(), contaUm);
        contasMap.put(contaDois.getId(), contaDois);
        contasMap.put(contaTres.getId(), contaTres);
        contasMap.put(contaQuatro.getId(), contaQuatro);
        contasMap.put(contaCinco.getId(), contaCinco);

        System.out.println(contasMap.get(3));

    }
}



















