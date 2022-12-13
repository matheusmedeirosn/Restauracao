package Repository;

import java.util.InputMismatchException;

public abstract class FormatacaoDados {


    public void converterCPF(String cpf){
        try{
            String getCPF = cpf.substring(0,3)+"."+cpf.substring(3,6)+"."+cpf.substring(6,9)+"-"+cpf.substring(9,11);
            System.out.println("CPF: " + getCPF);
        } catch (StringIndexOutOfBoundsException ex){
            System.out.println("Você informou menos que 11 digitos para o CPF - Ex: 12345678900");
        }

    }


    public void numeroAtendimento(int numero){

        try{
            System.out.println("Atendimento: " + numero +"-X");
        }catch (InputMismatchException ex){
            System.out.println("Você inseriu algo diferente de NUMEROS");
        }
    }

    public void converterPeso(Double peso){

        System.out.printf("Peso: %.1f Kg\n", peso);
    }

    public void converterTelefone(String telefone){
        try{
            String getTelefone = "("+telefone.substring(0,2)+")"+telefone.substring(2,6)+"-"+telefone.substring(6,10);
            System.out.println("Telefone: " + getTelefone);
        } catch (StringIndexOutOfBoundsException ex){
            System.out.println("Você informou menos que 10 digitos para o telefone - Ex: 8135258489");
        }
    }
}
