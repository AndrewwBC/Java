package model;

public class Senior extends Desenvolvedor{

    public Senior(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double getBonus() {
        return this.salario * 0.10;
    }
}
