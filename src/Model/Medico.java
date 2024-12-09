package Model;

public class Medico extends Funcionario {
    private String especialidade;
    private String crm;
    private int anosExperiencia;
    private String hospitalVinculo;
    private String contato;
    private String universidade;


    public Medico(String nome, String profissao, double salario, int idade, String especialidade,
                  String crm, int anosExperiencia, String hospitalVinculo, String contato, String universidade) {
        super(nome, profissao, salario, idade);
        this.especialidade = especialidade;
        this.crm = crm;
        this.anosExperiencia = anosExperiencia;
        this.hospitalVinculo = hospitalVinculo;
        this.contato = contato;
        this.universidade = universidade;
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public String getHospitalVinculo() {
        return hospitalVinculo;
    }

    public void setHospitalVinculo(String hospitalVinculo) {
        this.hospitalVinculo = hospitalVinculo;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }


    public void infMedico() {
        infFuncionario();
        System.out.println("Médico {");
        System.out.println("    Nome: '" + nome + "'");
        System.out.println("    Idade: " + idade);
        System.out.println("    Salário: " + salario);
        System.out.println("    Profissão: '" + proficao + "'");
        System.out.println("    Especialidade: '" + especialidade + "'");
        System.out.println("    CRM: '" + crm + "'");
        System.out.println("    Anos de Experiência: " + anosExperiencia);
        System.out.println("    Hospital de Vínculo: '" + hospitalVinculo + "'");
        System.out.println("    Contato: '" + contato + "'");
        System.out.println("    Universidade: '" + universidade + "'");
        System.out.println("}");
    }
}
