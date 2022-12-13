package Controller;

import DataBase.AtendimentoDataBase;
import Model.Animal;
import Repository.FormatacaoDados;

import java.util.Scanner;

public class AnimalController extends FormatacaoDados {

    public static void inserirCao(){

        String nome, raca, endereco, nm_responsavel, cpf ;
        int peso, contato;
        char porte;


        Scanner sc = new Scanner(System.in);
        Animal animal = new Animal();

        System.out.println("Nome do animal: ");
        animal.setNm_animal(sc.next());

        System.out.println("Raça do animal: ");
        animal.setRaca(sc.next());

        System.out.println("Peso do cão: ");
        animal.setPeso(sc.nextInt());

        System.out.println("Porte do animal: ");
        animal.setPorte(sc.next());

        System.out.println("Nome do responsavel: ");
        animal.setNm_responsavel(sc.next());

        System.out.println("Cpf do responsável: ");
        animal.setCpf(sc.nextInt());

        System.out.println("Contato do responsável: ");
        animal.setContato(sc.nextInt());

        System.out.println("Endereço do responsável: ");
        animal.setEndereco(sc.next());

        AtendimentoDataBase.adicionarAnimal(animal);
        animal= new Animal();
    }

    public void imprimirInformacoes(int numero, String cpf, double peso, String telefone){
        numeroAtendimento(numero);
        converterCPF(cpf);
        converterPeso(peso);
        converterTelefone(telefone);

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

}
