package Model;

public class Prestador {

    private String nm_prestador;
    private String especialidade;

    public Prestador(String nm_prestador, String especialidade) {
        this.nm_prestador = nm_prestador;
        this.especialidade = especialidade;
    }


    public Prestador() {

    }

    public String getNm_prestador() {
        return nm_prestador;
    }

    public void setNm_prestador(String nm_prestador) {
        this.nm_prestador = nm_prestador;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
