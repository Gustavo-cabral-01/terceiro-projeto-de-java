package Model;
import Contracts.Leito;

public class LeitoImpl implements Leito {
        private String tipoLeito;
        private String paciente;
        private boolean ocupado;

    public LeitoImpl(String tipoLeito, String paciente, boolean ocupado) {
        this.tipoLeito = tipoLeito;
        this.paciente = paciente;
        this.ocupado = ocupado;
    }

    public String getTipoLeito() {
        return tipoLeito;
    }

    public String getPaciente() {
        return paciente;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void reservarLeito(String nome) {

    }

    public void liberarLeito() {

    }

    public String visualizar() {
        return "";
    }


    public String visualizarLeito() {
        return "LeitoImpl{" +
                "tipoLeito='" + tipoLeito + '\'' +
                ", paciente='" + paciente + '\'' +
                ", ocupado=" + ocupado +
                '}';
    }
}

