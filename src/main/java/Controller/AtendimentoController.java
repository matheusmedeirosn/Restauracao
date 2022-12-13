package Controller;

import DataBase.AtendimentoDataBase;
import Model.FormatacaoDeDados;
import Model.Animal;
import Model.Atendimento;
import Model.Prestador;

import java.util.Scanner;

public class AtendimentoController {

    public static void inserirAtendimento(){

        Scanner sc = new Scanner(System.in);
        Atendimento atd = new Atendimento();
        Prestador prest=new Prestador();
        FormatacaoDeDados format = new FormatacaoDeDados();
        int tamanhoArrayList = AtendimentoDataBase.atendimentoArrayList.size();
        int sequenceAtendimento=tamanhoArrayList+1;
        String nomeCao;

        int cd_atendimento= sequenceAtendimento;
        atd.setCd_atendimento(cd_atendimento);

        System.out.println("Informe o nome do cão: ");
        nomeCao=sc.next();

        for(Animal x : AtendimentoDataBase.animalArrayList){
            if(x.getNm_animal().equals(nomeCao)){

                System.out.println("Informe o nome do prestador responsavel pelo atendimento: ");
                prest.setNm_prestador(sc.next());

                System.out.println("Informe a especialidade do prestador responsavel pelo atendimento: ");
                prest.setEspecialidade(sc.next());

                AtendimentoDataBase.adicionarPrestador(prest);
                prest= new Prestador();

                System.out.println("Como você descreve o atendimento em questão? ");
                atd.setDs_servico(sc.next());

                System.out.println("o código do seu atendimento é: "+sequenceAtendimento);
                format.numeroatendimento(sequenceAtendimento);

                AtendimentoDataBase.adicionarAtendimento(atd);
                atd=new Atendimento();

            }
        }
    }
    public static void consultarAtendimento(){

        int cod_atd;
        Scanner sc=new Scanner(System.in);

        System.out.println("Informe o codigo do atendimento: ");
        cod_atd=sc.nextInt();

        for(Atendimento x : AtendimentoDataBase.atendimentoArrayList){
            if(x.getCd_atendimento()==cod_atd){
                System.out.println( "Atendimento de número " + cod_atd +" foi encontrado");
            }else{
                System.out.println("Atendimento não encontrado");
            }
        }
    }

    public static void excluirAtendimento(){

        int cdAtendimento;
        Scanner sc=new Scanner(System.in);

        System.out.println("Informe o código do atendimento que você deseja excluir: ");
        cdAtendimento=sc.nextInt();

        for(Atendimento x : AtendimentoDataBase.atendimentoArrayList){
            if(x.getCd_atendimento()==(cdAtendimento)){
                System.out.println("Atendimento de número " + x.getCd_atendimento() +  " excluido com sucesso");
                AtendimentoDataBase.atendimentoArrayList.remove(x);
                return;
            }
            else{
                System.out.println("atendimento não encontrado");
            }
            break;
        }

    }

}
