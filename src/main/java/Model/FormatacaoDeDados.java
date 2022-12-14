package Model;

import View.FormataCPF;
import View.FormatarNumeroAtendimento;
import View.FormatarTelefone;
import Exceptions.FormatacaoExceptions;
import org.jetbrains.annotations.NotNull;


public class FormatacaoDeDados implements FormataCPF, FormatarTelefone, FormatarNumeroAtendimento {

    @Override
    public String converterCPF(@NotNull String cpf){
        try {
            String getCPF = cpf.substring(0,3)+"."+cpf.substring(3,6)+"."+cpf.substring(6,9)+"-"+cpf.substring(9,11);
            return "CPF: " + getCPF;
        }catch (Exception e){
            return "Quantidade de Caracteres informado é menor que o valor exigido! >CADASTRO SERÁ DESCONSIDERADO<";
        }
    }

    @Override
    public String converteTelefone(@NotNull String telefone) {
        try {
            String getTelefone = "("+telefone.substring(0,2)+")"+telefone.substring(2,3)+"."+telefone.substring(3,7)+"-"+telefone.substring(7,11);
        return "Telefone: " + getTelefone;
        }catch (Exception e){
            return "Quantidade de Caracteres informado é menor que o valor exigido! >CADASTRO SERÁ DESCONSIDERADO<";
        }
    }

    @Override
    public String numeroatendimento(@NotNull int numeroatt) {
        String numattio = ("0000" + numeroatt + "-X");
            return numattio;
    }


    }
