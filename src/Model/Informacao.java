package Model;
import Enums.TipoAnestesia;
import Enums.TipoEquipamentoMedico;
import Enums.TipoProcedimentoCirurgico;
import Enums.TipoProcedimentoMedico;

public class Informacao {
    private TipoProcedimentoMedico tipoProcedimentoMedico;
    private TipoEquipamentoMedico tipoEquipamentoMedico;
    private TipoAnestesia tipoAnestesia;
    private TipoProcedimentoCirurgico tipoProcedimentoCirurgico;


    public Informacao(String tipoProcedimentoMedico, String tipoEquipamentoMedico, String tipoAnestesia, String tipoProcedimentoCirurgico) {
        try {
            this.tipoProcedimentoMedico = TipoProcedimentoMedico.valueOf(tipoProcedimentoMedico.toUpperCase());
            this.tipoEquipamentoMedico = TipoEquipamentoMedico.valueOf(tipoEquipamentoMedico.toUpperCase());
            this.tipoAnestesia = TipoAnestesia.valueOf(tipoAnestesia.toUpperCase());
            this.tipoProcedimentoCirurgico = TipoProcedimentoCirurgico.valueOf(tipoProcedimentoCirurgico.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Um ou mais tipos fornecidos não são válidos. Verifique os valores.");
        }
    }


    public TipoProcedimentoMedico getTipoProcedimentoMedico() {
        return tipoProcedimentoMedico;
    }

    public TipoEquipamentoMedico getTipoEquipamentoMedico() {
        return tipoEquipamentoMedico;
    }

    public TipoAnestesia getTipoAnestesia() {
        return tipoAnestesia;
    }

    public TipoProcedimentoCirurgico getTipoProcedimentoCirurgico() {
        return tipoProcedimentoCirurgico;
    }


    public String inf() {
        return "Informação sobre Procedimentos e Equipamentos:\n" +
                "- Tipo de Procedimento Médico: " + tipoProcedimentoMedico + " (" + tipoProcedimentoMedico.getDescricao() + ")\n" +
                "- Tipo de Equipamento Médico: " + tipoEquipamentoMedico + " (" + tipoEquipamentoMedico.getDescricao() + ")\n" +
                "- Tipo de Anestesia: " + tipoAnestesia + " (" + tipoAnestesia.getDescricao() + ")\n" +
                "- Tipo de Procedimento Cirúrgico: " + tipoProcedimentoCirurgico + " (" + tipoProcedimentoCirurgico.getDescricao() + ")";
    }
}
