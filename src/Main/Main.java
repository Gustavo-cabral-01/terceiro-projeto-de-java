package Main;
import Contracts.Financeiro;
import Model.*;

public class Main {
    public static void main(String[] args) {
        try {

            Medico medico = new Medico("Dr. João Silva", "Médico", 12000.0, 45, "Cardiologista", "12345678", 20, "Hospital das Clínicas", "(11) 98765-4321", "Universidade de São Paulo");


            GerenciadorDePacientes gerenciador = new GerenciadorDePacientes();


            Paciente p1 = new Paciente("João Silva", 30, "12345678900", "Masculino", "Solteiro", "O+");
            Paciente p2 = new Paciente("Maria Oliveira", 28, "98765432100", "Feminino", "Casada", "A-");


            gerenciador.adicionarPaciente(p1);
            gerenciador.adicionarPaciente(p2);


            Paciente paciente = gerenciador.buscarPaciente("12345678900");
            if (paciente != null) {
                paciente.infPaciente();
            } else {
                System.out.println("Paciente não encontrado.");
            }


            gerenciador.adicionarConsulta("12345678900", "Consulta de rotina");
            gerenciador.adicionarConsulta("98765432100", "Consulta emergencial");


            gerenciador.listarConsultas("12345678900");
            gerenciador.listarConsultas("98765432100");


            gerenciador.adicionarEspecialidade("Cardiologia");
            gerenciador.adicionarEspecialidade("Dermatologia");
            gerenciador.adicionarEspecialidade("Cardiologia");


            gerenciador.listarEspecialidades();


            Consulta consulta = new Consulta("45", "Urgente", "Concluída", "Cartão de Crédito", "(11) 98765-4321", "Maria Silva", "10/12/2024", "14:30", "Dr. João Silva", "Infecção respiratória aguda");
            consulta.infAtendimento();


            Hospital hospital = new Hospital("Hospital São Vicente", "Bela Vista", 45, "10/05/2005", "88993576721", true);
            hospital.infHospital();


            Financeiro financeiro = new Caixa();


            Medicamentos medicamentos = new Medicamentos("2244", "aa", "dds", "qq", 20, 17);
            System.out.println(medicamentos.infmedicamentos());


            Informacao informacao = new Informacao("CIRURGIA", "RESPIRADOR", "GERAL", "CARDIACO");
            System.out.println(informacao.inf());


            LeitoImpl leito = new LeitoImpl("aa", "lucas", true);
            System.out.println(leito.visualizarLeito());


            ExameImpl exame = new ExameImpl("luacss", "cirurgia", "20,11,2005", false);
            System.out.println(exame.visualizarExame());


            Ambulancialmpl ambulancialmpl = new Ambulancialmpl(true, "5", false);
            System.out.println(ambulancialmpl.infAmbulancia());



            financeiro.gerarFatura("12345678900", 500.0, "Consulta Médica");


            System.out.println(financeiro.consultarFaturas("12345678900"));
            financeiro.registrarPagamento("12345678900", 500.0);


            System.out.println(financeiro.consultarFaturas("12345678900"));


            medico.infMedico();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
