package controller;

import model.Empresa;
import model.Funcionario;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmpresaFuncionario {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario(111111L, "0000001", "Andrew", "Campos", 1996);
        Funcionario f2 = new Funcionario(222222L, "0000002", "Bruno", "Campos", 1995);
        Funcionario f3 = new Funcionario(333333L, "0000003", "Carlos", "Campos", 1994);
        Funcionario f4 = new Funcionario(444444L, "0000004", "Diego", "Campos", 1993);
        Funcionario f5 = new Funcionario(555555L, "0000005", "Eduardo", "Campos", 1992);
        Funcionario f6 = new Funcionario(666666L, "0000006", "Fernando", "Campos", 1991);

        List<Funcionario> funcionariosEmpresaUm = new ArrayList<>();
        funcionariosEmpresaUm.add(f1);
        funcionariosEmpresaUm.add(f2);
        funcionariosEmpresaUm.add(f3);

        List<Funcionario> funcionariosEmpresaDois = new ArrayList<>();
         funcionariosEmpresaDois.add(f4);
         funcionariosEmpresaDois.add(f5);
         funcionariosEmpresaDois.add(f6);


        Empresa e1 = new Empresa("1231554/0", "PraCasa", "EmpresaUm", funcionariosEmpresaUm);

        Empresa e2 = new Empresa("1231334/0", "PraGaragem", "EmpresaDois", funcionariosEmpresaDois);


        e1.mostraFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        e1.mostraFuncionarios().forEach(funcionario -> {
            System.out.println(funcionario.getNome());
        });

        e2.mostraFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        e2.mostraFuncionarios().forEach(funcionario -> {
            System.out.println(funcionario.getNome());
        });

        // criterio idade

        e1.mostraFuncionarios().sort(Comparator.comparing(Funcionario::getData));
        e1.mostraFuncionarios().forEach(funcionario -> {
            System.out.println(funcionario.getData());
        });

        e2.mostraFuncionarios().sort(Comparator.comparing(Funcionario::getData));
        e2.mostraFuncionarios().forEach(funcionario -> {
            System.out.println(funcionario.getData());
        });



    }

}
