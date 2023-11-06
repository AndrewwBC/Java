package model;

// . Foi possível criar instâncias da classe Funcionario? Justifique sua resposta
// Não. Pois funcionário é abstrato.

//2. Onde você deve inserir estas regras de negócio? Na classe xxController ou nas
//classes Gerente e Desenvolvedor? Justifique sua resposta.
//   Devemos implementar nas classes correspondentes a cada tipo. Para dividir as responsabilidades para cada caso.

abstract public class Funcionario {
    protected String nome;
    protected Double salario;


    public Funcionario() {}
    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public abstract Double getBonus();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
