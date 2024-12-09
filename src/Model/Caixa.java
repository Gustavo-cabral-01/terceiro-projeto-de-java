package Model;
import Contracts.Financeiro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Caixa implements Financeiro {

    private Map<String, List<Fatura>> faturas = new HashMap<>();

    private static class Fatura {
        double valor;
        String descricao;
        boolean pago;

        public Fatura(double valor, String descricao) {
            this.valor = valor;
            this.descricao = descricao;
            this.pago = false;
        }


        public String toString() {
            return "Fatura{" +
                    "valor=" + valor +
                    ", descricao='" + descricao + '\'' +
                    ", pago=" + (pago ? "Sim" : "Não") +
                    '}';
        }
    }


    public void gerarFatura(String cpfPaciente, double valor, String descricao) {
        Fatura novaFatura = new Fatura(valor, descricao);
        faturas.putIfAbsent(cpfPaciente, new ArrayList<>());
        faturas.get(cpfPaciente).add(novaFatura);
        System.out.println("Fatura gerada para o paciente com CPF: " + cpfPaciente);
    }


    public void registrarPagamento(String cpfPaciente, double valor) {
        if (faturas.containsKey(cpfPaciente)) {
            List<Fatura> listaFaturas = faturas.get(cpfPaciente);
            for (Fatura fatura : listaFaturas) {
                if (!fatura.pago && fatura.valor == valor) {
                    fatura.pago = true;
                    System.out.println("Pagamento registrado para a fatura: " + fatura.descricao);
                    return;
                }
            }
            System.out.println("Nenhuma fatura pendente encontrada com o valor especificado.");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }


    public String consultarFaturas(String cpfPaciente) {
        if (faturas.containsKey(cpfPaciente)) {
            StringBuilder sb = new StringBuilder("Faturas do paciente com CPF " + cpfPaciente + ":\n");
            for (Fatura fatura : faturas.get(cpfPaciente)) {
                sb.append(fatura.toString()).append("\n");
            }
            return sb.toString();
        } else {
            return "Nenhuma fatura encontrada para o paciente com CPF: " + cpfPaciente;
        }
    }
}


