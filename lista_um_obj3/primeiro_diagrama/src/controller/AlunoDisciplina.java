package controller;

import model.Aluno;
import model.Disciplina;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AlunoDisciplina {
    public static void main(String[] args) {
        // pq L dps do valor em long??
        Aluno a1 = new Aluno(2000156L, "Andrew", "Campos");
        Aluno a2 = new Aluno(2333156L, "Bruno", "Campos");

        Disciplina d1 = new Disciplina(123456L, "Português");
        Disciplina d2 = new Disciplina(133456L, "Física");
        Disciplina d3 = new Disciplina(155456L, "Artes");

        d1.matricularAluno(a1);
        a1.atribuirDisciplina(d1);
        d2.matricularAluno(a1);
        a1.atribuirDisciplina(d2);


        d1.matricularAluno(a2);
        a2.atribuirDisciplina(d1);
        d2.matricularAluno(a2);
        a2.atribuirDisciplina(d2);
        d3.matricularAluno(a2);
        a2.atribuirDisciplina(d3);

        List<Aluno> alunoList = new ArrayList<>();
        alunoList.add(a1);
        alunoList.add(a2);

        alunoList.forEach(aluno -> {
            aluno.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
            System.out.println(aluno.getDisciplinas());
        });

        d1.retirarAluno(a2);
        d2.retirarAluno(a2);
        d3.retirarAluno(a2);
        a2.retirarDisciplina(d1);
        a2.retirarDisciplina(d2);
        a2.retirarDisciplina(d3);

        alunoList.forEach(aluno -> {
            aluno.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
            System.out.println(aluno.getDisciplinas());
        });

    }
}
