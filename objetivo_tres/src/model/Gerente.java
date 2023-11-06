package model;

public class Gerente extends Funcionario{
    private String formacao;

    public Gerente(Integer matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado) {
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
    }
}
