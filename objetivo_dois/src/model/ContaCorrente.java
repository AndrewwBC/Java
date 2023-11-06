package model;

public class ContaCorrente extends Conta implements Associado {
    private int quantidadeDeCotas;
    private double valorCota;

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo, int quantidadeDeCotas, int valorCota) {
        super(saldo);
        this.quantidadeDeCotas = quantidadeDeCotas;
        this.valorCota = valorCota;
    }

    public int getQuantidadeDeCotas() {
        return quantidadeDeCotas;
    }

    public void setQuantidadeDeCotas(int quantidadeDeCotas) {
        this.quantidadeDeCotas = quantidadeDeCotas;
    }

    public double getValorCota() {
        return valorCota;
    }

    public void setValorCota(int valorCota) {
        this.valorCota = valorCota;
    }

    @Override
    public double lucros(int quantidadeDeCotas, double valorCota) {
        return 0.0;
    }

    @Override
    public String toString() {
        return "\nContaCorrente{" +
                "quantidadeDeCotas=" + quantidadeDeCotas +
                ", valorCota=" + valorCota +
                ", saldo=" + saldo +
                '}';
    }
}
