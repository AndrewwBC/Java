package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private Long matricula;
    private String nome;
    private String sobrenome;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Aluno() {
    }

    public Aluno(Long matricula, String nome, String sobrenome) {
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Aluno(Long matricula, String nome, String sobrenome, List<Disciplina> disciplinas) {
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.disciplinas = disciplinas;
    }

    public Long getMatricula() {
        return this.matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void atribuirDisciplina (Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public void retirarDisciplina(Disciplina disciplina){
        this.disciplinas.remove(disciplina);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
