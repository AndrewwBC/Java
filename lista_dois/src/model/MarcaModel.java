package model;

public class MarcaModel {
    private String descricao;

    public MarcaModel(){}

    public MarcaModel(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(){
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "MarcaModel{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
