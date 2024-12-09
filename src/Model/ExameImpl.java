package Model;
import Contracts.Exame;

public class ExameImpl implements Exame {
    private String paciente;
    private String tipoExame;
    private String dataExame;
    private boolean realizado;

    public ExameImpl(String paciente, String tipoExame, String dataExame, boolean realizado) {
        this.paciente = paciente;
        this.tipoExame = tipoExame;
        this.dataExame = dataExame;
        this.realizado = realizado;
    }

    @Override
    public void agendarExame(Paciente paciente, String tipoExame, String dataExame) {

    }

    @Override
    public void realizarExame() {

    }



    @Override
    public String visualizarExame() {
        return "ExameImpl{" +
                "paciente='" + paciente + '\'' +
                ", tipoExame='" + tipoExame + '\'' +
                ", dataExame='" + dataExame + '\'' +
                ", realizado=" + realizado +
                '}';
    }
}


