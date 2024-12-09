package Model;

import Contracts.Ambulancia;

public class Ambulancialmpl implements Ambulancia {

    private boolean estaDisponivel;
    private  String QtddDisponiveis;
    private boolean  Retornar;


    public Ambulancialmpl(boolean estaDisponivel, String qtddDisponiveis, boolean retornar) {
        this.estaDisponivel = estaDisponivel;
        QtddDisponiveis = qtddDisponiveis;
        this.Retornar = retornar;
    }

    public boolean isEstaDisponivel() {
        return estaDisponivel;
    }

    public String getQtddDisponiveis() {
        return QtddDisponiveis;
    }


    public boolean estaDisponivel() {
        return true;
    }


    public String QtddDisponiveis() {
        return getQtddDisponiveis();
    }


    public boolean Retornar() {
        return false;

    }

    public String infAmbulancia() {
        return "Ambulancialmpl{" +
                "estaDisponivel=" + estaDisponivel +
                ", QtddDisponiveis='" + QtddDisponiveis + '\'' +
                ", Retornar=" + Retornar +
                '}';
    }
}
