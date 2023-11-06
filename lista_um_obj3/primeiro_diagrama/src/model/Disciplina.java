package model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private Long codigo;
    private String nome;
    private List<Aluno> alunos = new ArrayList<>();

    public Disciplina() {}
    public Disciplina(Long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    public Disciplina(Long codigo, String nome, List<Aluno> alunos) {
        this.codigo = codigo;
        this.nome = nome;
        this.alunos = alunos;
    }


    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Aluno> getAlunos() {
        return this.alunos;
    }
    public void setAlunos(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void matricularAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void retirarAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
