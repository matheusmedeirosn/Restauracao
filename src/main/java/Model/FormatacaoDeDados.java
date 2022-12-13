package Model;

import View.FormataCPF;
import View.FormatarNumeroAtendimento;
import View.FormatarTelefone;


public class FormatacaoDeDados implements FormataCPF, FormatarTelefone, FormatarNumeroAtendimento {

    @Override
    public String converterCPF(String cpf) {
            String getCPF = cpf.substring(0,3)+"."+cpf.substring(3,6)+"."+cpf.substring(6,9)+"-"+cpf.substring(9,11);
        return "CPF: " + getCPF;
    }

    @Override
    public String converteTelefone(String telefone) {

            String getTelefone = "("+telefone.substring(0,2)+")"+telefone.substring(2,3)+"."+telefone.substring(3,7)+"-"+telefone.substring(7,11);
        return "Telefone: " + getTelefone;

    }

    @Override
    public String numeroatendimento(int numeroatt) {
        String numattio = ("Numero do Atendimento: " + numeroatt + "-X");
            return numattio;
    }


    }
