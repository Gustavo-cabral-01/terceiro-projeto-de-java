package Model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GerenciadorDePacientes {

    private Map<String, Paciente> pacientesMap = new HashMap<>();

    private Map<String, ArrayList<String>> consultasMap = new HashMap<>();

    private Set<String> especialidadesSet = new HashSet<>();

    public void adicionarPaciente(Paciente paciente) {
        try {

            if (pacientesMap.containsKey(paciente.getCpf())) {
                throw new IllegalArgumentException("Paciente com CPF " + paciente.getCpf() + " já cadastrado.");
            }
            pacientesMap.put(paciente.getCpf(), paciente);
            System.out.println("Paciente " + paciente.getNome() + " adicionado com sucesso.");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }


    public Paciente buscarPaciente(String cpf) {
        if (pacientesMap.containsKey(cpf)) {
            return pacientesMap.get(cpf);
        } else {
            System.err.println("Erro: Paciente com CPF " + cpf + " não encontrado.");
            return null;
        }
    }

    public void adicionarConsulta(String cpf, String consulta) {
        try {
            if (!pacientesMap.containsKey(cpf)) {
                throw new IllegalArgumentException("Paciente não encontrado para o CPF fornecido.");
            }
            consultasMap.putIfAbsent(cpf, new ArrayList<>());
            consultasMap.get(cpf).add(consulta);
            System.out.println("Consulta adicionada para o paciente " + cpf);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    public void listarConsultas(String cpf) {
        ArrayList<String> consultas = consultasMap.get(cpf);
        if (consultas != null) {
            System.out.println("Consultas do paciente com CPF " + cpf + ":");
            for (String consulta : consultas) {
                System.out.println("  - " + consulta);
            }
        } else {
            System.err.println("Erro: Nenhuma consulta encontrada para o paciente com CPF " + cpf);
        }
    }


    public void adicionarEspecialidade(String especialidade) {
        if (!especialidadesSet.add(especialidade)) {
            System.err.println("Erro: Especialidade " + especialidade + " já cadastrada.");
        } else {
            System.out.println("Especialidade " + especialidade + " adicionada com sucesso.");
        }
    }

    public void listarEspecialidades() {
        System.out.println("Especialidades cadastradas:");
        for (String especialidade : especialidadesSet) {
            System.out.println("  - " + especialidade);
        }
    }
}
