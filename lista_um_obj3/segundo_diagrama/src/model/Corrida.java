package model;

public class Corrida {
    private Long id;
    private String tipoPagamento;
    private String detalhesPagamento;
    private Integer dataInicio;
    private double preco;
    private Motorista motorista;
    private Usuario usuario;

    public Corrida(Long id, String tipoPagamento, String detalhesPagamento, Integer dataInicio, double preco, Motorista motorista, Usuario usuario) {
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.detalhesPagamento = detalhesPagamento;
        this.dataInicio = dataInicio;
        this.preco = preco;
        this.motorista = motorista;
        this.usuario = usuario;
    }

    public Integer getDataInicio() {
        return this.dataInicio;
    }

    public Double getPreco(){
        return this.preco;
    }

    @Override
    public String toString() {
        return "\nCorrida{" +
                "id=" + id +
                ", tipoPagamento='" + tipoPagamento + '\'' +
                ", detalhesPagamento='" + detalhesPagamento + '\'' +
                ", dataInicio=" + dataInicio +
                ", preco=" + preco +
                ", motorista=" + motorista +
                ", usuario=" + usuario +
                '}';
    }
}
