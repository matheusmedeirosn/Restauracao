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

        System.out.print("\nInforme o nome do cão: ");
        nomeCao=sc.next();

        for(Animal x : AtendimentoDataBase.animalArrayList){
            if(x.getNm_animal().equals(nomeCao)){

                System.out.print("\nInforme o nome do prestador responsavel pelo atendimento: ");
                prest.setNm_prestador(sc.next());

                System.out.print("\nInforme a especialidade do prestador responsavel pelo atendimento: ");
                prest.setEspecialidade(sc.next());

                AtendimentoDataBase.adicionarPrestador(prest);
                prest= new Prestador();

                System.out.print("\nComo você descreve o atendimento em questão? ");
                atd.setDs_servico(sc.next());

                System.out.print("\nO código do seu atendimento é: "+ format.numeroatendimento(sequenceAtendimento));

                AtendimentoDataBase.adicionarAtendimento(atd);
                atd=new Atendimento();

            }
        }
    }
    public static void consultarAtendimento(){

        int cod_atd;
        Scanner sc=new Scanner(System.in);

        System.out.print("\nInforme o codigo do atendimento: ");
        cod_atd=sc.nextInt();

        for(Atendimento x : AtendimentoDataBase.atendimentoArrayList){
            if(x.getCd_atendimento()==cod_atd){
                System.out.println( "\nAtendimento de número " + cod_atd +" foi encontrado\n");
            }else{
                System.out.println("\nAtendimento não encontrado\n");
            }
        }
    }

    public static void excluirAtendimento(){

        int cdAtendimento;
        Scanner sc=new Scanner(System.in);

        System.out.print("Informe o código do atendimento que você deseja excluir: ");
        cdAtendimento=sc.nextInt();

        for(Atendimento x : AtendimentoDataBase.atendimentoArrayList){
            if(x.getCd_atendimento()==(cdAtendimento)){
                System.out.println("\nAtendimento de número " + x.getCd_atendimento() +  " excluido com sucesso");
                AtendimentoDataBase.atendimentoArrayList.remove(x);
                return;
            }
            else{
                System.out.println("\natendimento não encontrado");
            }
            break;
        }

    }

}
