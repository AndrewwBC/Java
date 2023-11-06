package controller;

import model.Funcionario;

import java.util.*;

public class FuncionarioController {
    public static void main(String[] args) {

        Funcionario andre = new Funcionario("andre", 500.25);
        Funcionario bruno = new Funcionario("bruno", 600.25);
        Funcionario carlos = new Funcionario("carlos", 700.25);
        Funcionario diana = new Funcionario("diana", 800.25);
        Funcionario euclesio = new Funcionario("euclesio", 900.25);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(andre);
        funcionarios.add(bruno);
        funcionarios.add(carlos);
        funcionarios.add(diana);
        funcionarios.add(euclesio);

        Optional<Funcionario> funcFiltrado = funcionarios.stream().filter(funcionario -> funcionario.getSalario() == 600.25).findAny();
        System.out.println(funcFiltrado);

        Map<String, Funcionario> funcMap = new HashMap<>();
        funcMap.put(andre.getNome(), andre);
        funcMap.put(bruno.getNome(), bruno);
        funcMap.put(carlos.getNome(), carlos);
        funcMap.put(diana.getNome(), diana);
        funcMap.put(euclesio.getNome(), euclesio);

        funcMap.get("bruno");

    }
}
