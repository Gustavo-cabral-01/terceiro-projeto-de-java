package Contracts;

public interface Financeiro {
    void gerarFatura(String cpfPaciente, double valor, String descricao);
    void registrarPagamento(String cpfPaciente, double valor);
    String consultarFaturas(String cpfPaciente);
}

