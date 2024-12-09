package Model;

public class Servicos extends ServicoHospitalar {


    public Servicos(String nomeServico, double custo) {
        super(nomeServico, custo);
    }


    public void executarServico() {

        System.out.println("Executando o serviço: " + nomeServico);

    }


}
