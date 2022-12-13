package Controller;

import DataBase.AtendimentoDataBase;
import Model.Animal;
import Repository.FormatacaoDados;

import java.util.Scanner;

import static com.sun.tools.javac.util.StringUtils.toUpperCase;

public class AnimalController extends FormatacaoDados {

    public static void inserirCao(){

        Scanner sc = new Scanner(System.in);
        Animal animal = new Animal();

        System.out.println("Nome do animal: ");
        animal.setNm_animal(sc.next());

        System.out.println("Raça do animal: ");
        animal.setRaca(sc.next());

        System.out.println("Peso do cão: ");
        animal.setPeso(sc.nextDouble());
        FormatacaoDados.converterPeso(animal.getPeso());

        System.out.println("Porte do animal: ");
        animal.setPorte(sc.next());

        System.out.println("Nome do responsavel: ");
        animal.setNm_responsavel(sc.next());

        System.out.println("Cpf do responsável: ");
        animal.setCpf(sc.next());
        FormatacaoDados.converterCPF(animal.getCpf());

        System.out.println("Contato do responsável: ");
        animal.setContato(sc.next());
        FormatacaoDados.converterTelefone(animal.getContato());

        System.out.println("Endereço do responsável: ");
        animal.setEndereco(sc.next());

        AtendimentoDataBase.adicionarAnimal(animal);
        animal= new Animal();
    }

    public static void pesquisarAnimal(){

        String nomeCao;
        Scanner sc=new Scanner(System.in);

        System.out.println("Informe o nome do cachorro:");
        nomeCao=sc.next();

        for(Animal x : AtendimentoDataBase.animalArrayList){
            if(x.getNm_animal().equals(nomeCao)){
                System.out.println( "Animal " + x.toString() + " foi encontrado");
            }else{
                System.out.println("Animal não encontrado");
            }
            break;
        }
    }

    public static void excluirAnimal(){

        String nomeCao;
        Scanner sc=new Scanner(System.in);

        System.out.println("Informe o nome do cachorro: ");
        nomeCao=sc.next();

        for(Animal x : AtendimentoDataBase.animalArrayList){
            if(x.getNm_animal().equals(nomeCao)){
                AtendimentoDataBase.animalArrayList.remove(x);
                System.out.println("Animal " + x.toString() +  " excluido com sucesso");
                return;
            }
            else{
                System.out.println("animal não encontrado");
            }
        }
    }

    public static void editarAnimal(){

     /*   String nomeCao;
        String respostaUsuario;
        Scanner sc=new Scanner(System.in);

        System.out.println("Informe o nome do cachorro: ");
        nomeCao=sc.next();

        for(Animal x : AtendimentoDataBase.animalArrayList) {
            if (x.getNm_animal().equals(nomeCao)) {

                System.out.println("Digite se você deseja editar o peso, contato ou endereço de cadastro.\n" +
                        "(APENAS UM POR VEZ) ");
                respostaUsuario=sc.next();

                if(respostaUsuario.equals("PESO")||respostaUsuario.equals("peso")){
                    x.setPeso(null);
                    System.out.println("Informe o novo peso: ");
                    double novoPeso = sc.nextInt();
                    x.setPeso(novoPeso);
                    FormatacaoDados.converterPeso(x.getPeso());

                }
                else if(respostaUsuario=="CONTATO"||respostaUsuario=="contato"){
                    x.setContato(null);
                    System.out.println("Informe o novo contato: ");
                    String novoContato = sc.next();
                    x.setContato(novoContato);
                    FormatacaoDados.converterTelefone(x.getContato());

                }
                else if(respostaUsuario=="ENDERECO"||respostaUsuario=="endereco"){
                    x.setEndereco(null);
                    System.out.println("Informe o novo endereço: ");
                    String novoEndereco = sc.next();
                    x.setEndereco(novoEndereco);
                }
            }
            else{

            }
        }*/


    }
}
