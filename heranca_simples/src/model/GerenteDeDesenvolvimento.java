package model;

public class GerenteDeDesenvolvimento extends Gerente {

    public GerenteDeDesenvolvimento(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double getBonus() {
        return this.salario * 0.20;
    }
}
