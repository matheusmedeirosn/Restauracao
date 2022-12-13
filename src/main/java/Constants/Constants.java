package Constants;

import Model.Prestador;

public class Constants {

    private static String tp_servico="consulta";

    public Constants(String tp_servico) {
        this.tp_servico = tp_servico;
    }

    public String getTp_servico() {
        return tp_servico;
    }

    public void setTp_servico(String tp_servico) {
        this.tp_servico = tp_servico;
    }
}
