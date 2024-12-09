package Model;

public abstract class Atendimento {
    private String idade;
    private String tipoAtendimento;
    private String status;
    private String formadepagamento;

    public Atendimento(String idade, String tipoAtendimento, String status, String formadepagamento) {
        this.idade = idade;
        this.tipoAtendimento = tipoAtendimento;
        this.status = status;
        this.formadepagamento = formadepagamento;
    }

    public String getIdade() {
        return idade;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public String getStatus() {
        return status;
    }

    public String getFormadepagamento() {
        return formadepagamento;
    }

    public void atendimento() {
        System.out.println("Atendimento{");
        System.out.println("    idade=" + idade);
        System.out.println("    tipoAtendimento='" + tipoAtendimento + "'");
        System.out.println("    status='" + status + "'");
        System.out.println("    formadepagamento='" + formadepagamento + "'");
        System.out.println("}");
    }
}
