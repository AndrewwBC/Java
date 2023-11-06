package model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private List<Corrida> corridas = new ArrayList<>();


    public Usuario(Long id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Usuario(Long id, String nome, String email, String telefone, List<Corrida> corridas) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.corridas = corridas;
    }

    public List<Corrida> getCorridas(){
        return this.corridas;
    }

    public void adicionarCorridas(Corrida corrida){
        this.corridas.add(corrida);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
