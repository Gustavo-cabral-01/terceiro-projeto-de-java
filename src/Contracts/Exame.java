package Contracts;
import Model.Paciente;

public interface Exame {

    void agendarExame(Paciente paciente, String tipoExame, String dataExame);
    void realizarExame();
    String visualizarExame();


}
