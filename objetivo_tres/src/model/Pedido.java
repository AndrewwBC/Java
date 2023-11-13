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


    @Override
    public String toString() {
        return "\nPedido{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                ", item=" + item +
                '}';
    }
}
