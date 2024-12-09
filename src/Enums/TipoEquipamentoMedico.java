package Enums;

public enum TipoEquipamentoMedico {

    RESPIRADOR("Respirador"),
    MONITOR_CARDIACO("Monitor Cardíaco"),
    ECOGRAFO("Ecógrafo"),
    RAIO_X("Raio-X"),
    ULTRASSOM("Ultrassom");

    private final String descricao;

    TipoEquipamentoMedico(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }


}
