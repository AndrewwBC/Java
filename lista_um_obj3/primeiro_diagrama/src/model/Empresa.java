package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String cnpj;
    private String razaoFantasia;
    private String nomeFantasia;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Empresa() {
    }
    public Empresa(String cnpj, String razaoFantasia, String nomeFantasia, List<Funcionario> funcionarios) {
        this.cnpj = cnpj;
        this.razaoFantasia = razaoFantasia;
        this.nomeFantasia = nomeFantasia;
        this.funcionarios = funcionarios;
    }

    public List<Funcionario> mostraFuncionarios() {
        return this.funcionarios;
    }
}
