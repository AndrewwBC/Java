package model;

public class GerenteGeral extends Gerente{

    public GerenteGeral(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double getBonus() {
        return this.salario * 0.40;
    }
}
