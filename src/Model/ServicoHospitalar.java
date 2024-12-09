package Model;

public abstract class ServicoHospitalar {
    protected String nomeServico;
    protected double custo;

    public ServicoHospitalar(String nomeServico, double custo) {
        this.nomeServico = nomeServico;
        this.custo = custo;
    }

    public abstract void executarServico();


    public double calcularCusto() {
        return custo;
    }


}
