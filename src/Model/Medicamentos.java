package Model;

public class Medicamentos {
    private String id;
    private String nome;
    private String descricao;
    private String categoria;
    private double preco;
    private int quantidadeEmEstoque;


    public  Medicamentos(String id, String nome, String descricao, String categoria, double preco, int quantidadeEmEstoque) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }


    public String getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }


    public String getDescricao() {
        return descricao;
    }


    public String getCategoria() {
        return categoria;
    }


    public double getPreco() {
        return preco;
    }


    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }


public String infmedicamentos() {
    return "Medicamentos{" +
            "id=" + id +
            ", nome='" + nome + '\'' +
            ", descricao='" + descricao + '\'' +
            ", categoria='" + categoria + '\'' +
            ", preco=" + preco +
            ", quantidadeEmEstoque=" + quantidadeEmEstoque +
            '}';
}
}


