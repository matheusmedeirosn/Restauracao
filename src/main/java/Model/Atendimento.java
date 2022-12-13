package Model;

import Constants.Constants;

public class Atendimento {

    private int cd_atendimento;
    private Animal animal;
    private Prestador prestador;
    private String tp_servico;
    private String ds_servico;

    public Atendimento(int cd_atendimento, Animal animal, Prestador prestador, String tp_servico, String ds_servico) {
        this.cd_atendimento = cd_atendimento;
        this.animal = animal;
        this.prestador = prestador;
        this.tp_servico = tp_servico;
        this.ds_servico = ds_servico;
    }

    public Atendimento() {

    }

    public int getCd_atendimento() {
        return cd_atendimento;
    }

    public void setCd_atendimento(int cd_atendimento) {
        this.cd_atendimento = cd_atendimento;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    public String getDs_servico() {
        return ds_servico;
    }

    public void setDs_servico(String ds_servico) {
        this.ds_servico = ds_servico;
    }
}
