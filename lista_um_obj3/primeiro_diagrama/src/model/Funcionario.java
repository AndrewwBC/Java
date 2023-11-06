package model;

public class Funcionario {
    private Long id;
    private String cpf;
    private String nome;
    private String sobrenome;
    private Integer dataNascimento;

    public Funcionario() {
    }
    public Funcionario(Long id, String cpf, String nome, String sobrenome, Integer dataNascimento) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }
    public String getNome(){
        return this.nome;
    }

    public Integer getData(){
        return this.dataNascimento;
    }
}
