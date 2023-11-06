package model;

public class Cliente implements Associado {

    private String nome;
    private int quantidadeDeCotas;
    private int valorCota;
    public Cliente() {
    }
    public Cliente(String nome, int quantidadeDeCotas, int valorCota) {
        this.nome = nome;
        this.quantidadeDeCotas = quantidadeDeCotas;
        this.valorCota = valorCota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeCotas() {
        return quantidadeDeCotas;
    }

    public void setQuantidadeDeCotas(int quantidadeDeCotas) {
        this.quantidadeDeCotas = quantidadeDeCotas;
    }

    @Override
    public double lucros(int quantidadeDeCotas, double valorCota) {
        return 0.0;
    }

    @Override
    public String toString() {
        return "\nCliente{" +
                "nome='" + nome + '\'' +
                ", quantidadeDeCotas=" + quantidadeDeCotas +
                '}';
    }
}
