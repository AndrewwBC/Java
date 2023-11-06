package model;

public class Pedido {

    private Integer numero;
    private String data;
    private Double valor;
    private Item item;
    private enum tipo {
        atendido,
        pendente,
        cancelado
    };

    private Vendedor vendidoPor;

    public Pedido(Integer numero, String data, Double valor, Item item) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.item = item;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Vendedor getVendidoPor() {
        return vendidoPor;
    }

    public void setVendidoPor(Vendedor vendidoPor) {
        this.vendidoPor = vendidoPor;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                ", item=" + item +
                '}';
    }
}
