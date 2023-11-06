package model;

public class Veiculo {
    private Long id;
    private String tipo;
    private String placa;
    private Integer anoFabricacao;
    private Motorista motorista;

    public Veiculo(Long id, String tipo, String placa, Integer anoFabricacao) {
        this.id = id;
        this.tipo = tipo;
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
    }

    public Veiculo(Long id, String tipo, String placa, Integer anoFabricacao, Motorista motorista) {
        this.id = id;
        this.tipo = tipo;
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", placa='" + placa + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", motorista=" + motorista +
                '}';
    }
}
