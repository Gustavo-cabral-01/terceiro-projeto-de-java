package Enums;

public enum TipoProcedimentoMedico {

    CIRURGIA("Cirurgia"),
    EXAME("Exame"),
    CONSULTA("Consulta"),
    ATENDIMENTO("Atendimento de urgência"),
    VACINACAO("Vacinação");

    private final String descricao;

    TipoProcedimentoMedico(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
