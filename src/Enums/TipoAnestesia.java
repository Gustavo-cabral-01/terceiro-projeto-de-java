package Enums;

public enum TipoAnestesia {

    LOCAL("Local"),
    GERAL("Geral"),
    RAQUIANESTESIA("Raquianestesia"),
    PERIDURAL("Peridural");

    private final String descricao;

    TipoAnestesia(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }


}
