package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class FolhaDePagamento {
    public static void main(String[] args) {
        GerenteGeral gerenteGeral = new GerenteGeral("Geraldo", 6.500);
        GerenteDeDesenvolvimento gerenteDeDesenvolvimento = new GerenteDeDesenvolvimento("Paulo", 4.500);

        Senior senior1 = new Senior("Andre",3.500);
        Senior senior2 = new Senior("Bruno",3.500);
        Senior senior3 = new Senior("Carlos",3.500);
        Senior senior4 = new Senior("Diego",3.500);
        Senior senior5 = new Senior("Eduardo",3.500);

        Pleno pleno1 = new Pleno("Andre",2.500);
        Pleno pleno2 = new Pleno("Bruno",2.500);
        Pleno pleno3 = new Pleno("Carlos",2.500);
        Pleno pleno4 = new Pleno("Diego",2.500);
        Pleno pleno5 = new Pleno("Eduardo",2.500);

        Junior junior1 = new Junior("Andre",1.500);
        Junior junior2 = new Junior("Bruno",1.500);
        Junior junior3 = new Junior("Carlos",1.500);
        Junior junior4 = new Junior("Diego",1.500);
        Junior junior5 = new Junior("Eduardo",1.500);

        List<Funcionario> funcionarioList = new ArrayList<>();
        funcionarioList.add(gerenteGeral);
        funcionarioList.add(gerenteDeDesenvolvimento);

        funcionarioList.add(senior1);
        funcionarioList.add(senior2);
        funcionarioList.add(senior3);
        funcionarioList.add(senior4);
        funcionarioList.add(senior5);

        funcionarioList.add(pleno1);
        funcionarioList.add(pleno2);
        funcionarioList.add(pleno3);
        funcionarioList.add(pleno4);
        funcionarioList.add(pleno5);

        funcionarioList.add(junior1);
        funcionarioList.add(junior2);
        funcionarioList.add(junior3);
        funcionarioList.add(junior4);
        funcionarioList.add(junior5);

        // bonus
        System.out.println(funcionarioList.stream().mapToDouble(c -> c.getBonus()).sum());

        // salario
        System.out.println(funcionarioList.stream().mapToDouble(c -> c.getSalario()).sum());

        //5%
        System.out.println(funcionarioList.stream().mapToDouble(c -> c.getSalario() + c.getSalario() * 0.05).sum());

    }
}
