package model;

public class Junior extends Desenvolvedor {
    public Junior(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double getBonus() {
        return this.salario * 0.05;
    }
}
