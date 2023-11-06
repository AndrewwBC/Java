package model;

public class ModeloModel {
    private String descricao;

    public ModeloModel(){}

    public ModeloModel(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "ModeloModel{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
