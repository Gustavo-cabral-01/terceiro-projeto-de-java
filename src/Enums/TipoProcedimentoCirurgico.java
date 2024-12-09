package Enums;

public enum TipoProcedimentoCirurgico {
    ABDOMINAL("Abdominal"),
    ORTOPEDICO("Ortopédico"),
    CARDIACO("Cardíaco"),
    NEUROLOGICO("Neurológico"),
    PLASTICA("Plástica");

    private final String descricao;

    TipoProcedimentoCirurgico(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }


}
