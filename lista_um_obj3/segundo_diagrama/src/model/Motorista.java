package model;

import java.util.ArrayList;
import java.util.List;

public class Motorista {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private List<Corrida> corridas = new ArrayList<>();
    private Veiculo veiculo;

    public Motorista(Long id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Motorista(Long id, String nome, String email, String telefone, List<Corrida> corridas, Veiculo veiculo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.corridas = corridas;
        this.veiculo = veiculo;
    }

    public List<Corrida> getCorridas(){
        return this.corridas;
    }

    public void adicionarCorridas(Corrida corrida){
        this.corridas.add(corrida);
    }

    public void adicionarVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }


}
