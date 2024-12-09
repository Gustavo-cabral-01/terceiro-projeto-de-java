package Model;

public class Consulta extends Atendimento {
    private String numerodoCelular;
    private String nomeDoAcompanhante;
    private String dataConsulta;
    private String horaConsulta;
    private String medicoResponsavel;
    private String diagnostico;


    public Consulta(String idade, String tipoAtendimento, String status, String formaDePagamento,
                    String numerodoCelular, String nomeDoAcompanhante, String dataConsulta,
                    String horaConsulta, String medicoResponsavel, String diagnostico) {
        super(idade, tipoAtendimento, status, formaDePagamento);
        this.numerodoCelular = numerodoCelular;
        this.nomeDoAcompanhante = nomeDoAcompanhante;
        this.dataConsulta = dataConsulta;
        this.horaConsulta = horaConsulta;
        this.medicoResponsavel = medicoResponsavel;
        this.diagnostico = diagnostico;
    }


    public String getNumerodoCelular() {
        return numerodoCelular;
    }

    public void setNumerodoCelular(String numerodoCelular) {
        this.numerodoCelular = numerodoCelular;
    }

    public String getNomeDoAcompanhante() {
        return nomeDoAcompanhante;
    }

    public void setNomeDoAcompanhante(String nomeDoAcompanhante) {
        this.nomeDoAcompanhante = nomeDoAcompanhante;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public String getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public void setMedicoResponsavel(String medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }


    public void infAtendimento() {
        atendimento();

        System.out.println("Consulta {");
        System.out.println("    Número do Celular: '" + numerodoCelular + "'");
        System.out.println("    Nome do Acompanhante: '" + nomeDoAcompanhante + "'");
        System.out.println("    Data da Consulta: '" + dataConsulta + "'");
        System.out.println("    Hora da Consulta: '" + horaConsulta + "'");
        System.out.println("    Médico Responsável: '" + medicoResponsavel + "'");
        System.out.println("    Diagnóstico: '" + diagnostico + "'");
        System.out.println("}");
    }
}
