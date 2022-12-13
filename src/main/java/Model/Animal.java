package Model;

public class Animal {

    private String nm_animal,raca,porte,cpf,contato,endereco,nm_responsavel;
    private Double peso;


    public Animal(String nm_animal, String raca, Double peso, String porte, String nm_responsavel, String cpf, String contato, String endereco) {
        this.nm_animal = nm_animal;
        this.raca = raca;
        this.peso = peso;
        this.porte = porte;
        this.nm_responsavel = nm_responsavel;
        this.cpf = cpf;
        this.contato = contato;
        this.endereco = endereco;
    }

    public Animal() {

    }

    public String getNm_animal() {
        return nm_animal;
    }

    public void setNm_animal(String nm_animal) {
        this.nm_animal = nm_animal;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getNm_responsavel() {
        return nm_responsavel;
    }

    public void setNm_responsavel(String nm_responsavel) {
        this.nm_responsavel = nm_responsavel;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString(){
        return this.nm_animal;
    }

}
