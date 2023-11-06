package model;

public class Pleno extends Desenvolvedor {

    public Pleno(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double getBonus() {
        return this.salario * 0.05;
    }
}
