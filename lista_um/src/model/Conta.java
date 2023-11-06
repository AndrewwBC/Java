package model;

public class Conta {

    private Double saldo;
    private int id;
    public Conta(){}
    public Conta(int id, Double saldo){
        this.id = id;
        this.saldo = saldo;
    }

    public Double getSaldo(){
        return this.saldo;
    }

    public void deposita(Double valor){
        this.saldo += valor;
    }

    public void saca(Double valor){
        this.saldo -= valor;
    }

    public void atualiza(Double taxa){
        this.saldo += this.saldo * taxa/100;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", id=" + id +
                '}';
    }
}
