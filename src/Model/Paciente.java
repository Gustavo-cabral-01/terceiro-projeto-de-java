package Model;

public class Paciente {
    private String nome;
    private int idade;
    private String cpf;
    private String genero;
    private String estadoCivil;
    private String tipoSanguineo;

    public Paciente(String nome, int idade, String cpf, String genero, String estadoCivil, String tipoSanguineo) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getGenero() {
        return genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void infPaciente() {
        System.out.println("--Paciente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", genero='" + genero + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", tipoSanguineo='" + tipoSanguineo + '\'' +
                '}');
    }
}


