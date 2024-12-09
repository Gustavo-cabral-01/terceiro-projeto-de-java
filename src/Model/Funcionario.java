package Model;

public abstract class Funcionario {
        public String nome;
        public int idade;
        public double salario;
        public String proficao;

    public Funcionario(String nome, String proficao, double salario, int idade) {
        this.nome = nome;
        this.proficao = proficao;
        this.salario = salario;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getProficao() {
        return proficao;
    }

    public double getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }


    public String infFuncionario() {
        return "Model.Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                ", proficao='" + proficao + '\'' +
                '}';
    }


}
