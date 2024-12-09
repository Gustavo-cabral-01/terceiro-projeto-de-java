package Model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Hospital {
    private String nome;
    private String endereco;
    private int numeroLeitos;
    private String dataFundacao;
    private String contato;
    private boolean ativo;


    private Map<String, Funcionario> funcionarios;
    private Map<String, Paciente> pacientes;


    private List<ServicoHospitalar> servicos;


    private Set<String> departamentos;
    private Set<String> planosDeSaudeConveniados;

    public Hospital(String nome, String endereco, int numeroLeitos, String dataFundacao, String contato, boolean ativo) {
        this.nome = nome;
        this.endereco = endereco;
        this.numeroLeitos = numeroLeitos;
        this.dataFundacao = dataFundacao;
        this.contato = contato;
        this.ativo = ativo;

        this.funcionarios = new HashMap<>();
        this.pacientes = new HashMap<>();
        this.servicos = new ArrayList<>();
        this.departamentos = new HashSet<>();
        this.planosDeSaudeConveniados = new HashSet<>();
    }


    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getNumeroLeitos() {
        return numeroLeitos;
    }

    public String getDataFundacao() {
        return dataFundacao;
    }

    public String getContato() {
        return contato;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public Map<String, Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public Map<String, Paciente> getPacientes() {
        return pacientes;
    }

    public List<ServicoHospitalar> getServicos() {
        return servicos;
    }

    public Set<String> getDepartamentos() {
        return departamentos;
    }

    public Set<String> getPlanosDeSaudeConveniados() {
        return planosDeSaudeConveniados;
    }

    public void adicionarServico(ServicoHospitalar servico) {
        servicos.add(servico);
    }

    public void adicionarDepartamento(String departamento) {
        departamentos.add(departamento);
    }

    public void adicionarPlanoDeSaudeConveniado(String planoDeSaude) {
        planosDeSaudeConveniados.add(planoDeSaude);
    }


    public void infHospital() {
        System.out.println("Hospital{");
        System.out.println("    Nome='" + nome + "'");
        System.out.println("    Endereço='" + endereco + "'");
        System.out.println("    Número de Leitos: " + numeroLeitos);
        System.out.println("    Data de Fundação: " + dataFundacao);
        System.out.println("    Contato: " + contato);
        System.out.println("    Funcionários: " + funcionarios.size());
        System.out.println("    Pacientes: " + pacientes.size());
        System.out.println("    Serviços: " + servicos.size());
        System.out.println("    Departamentos: " + departamentos.size());
        System.out.println("    Planos de Saúde Conveniados: " + planosDeSaudeConveniados.size());
        System.out.println("    Status: " + (ativo ? "Ativo" : "Inativo"));
        System.out.println("}");
    }
}
