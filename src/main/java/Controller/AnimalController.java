package Controller;

import DataBase.AtendimentoDataBase;
import Model.Animal;
import Model.FormatacaoDeDados;
import Repository.PadronizacaoPeso;

import java.util.Scanner;

public class AnimalController extends PadronizacaoPeso {

    public static void inserirCao() {

        Scanner sc = new Scanner(System.in);
        Animal animal = new Animal();
        FormatacaoDeDados formatDados = new FormatacaoDeDados();

        System.out.print("Nome do animal: ");
        animal.setNm_animal(sc.next());

        System.out.print("Raça do animal: ");
        animal.setRaca(sc.next());

        System.out.print("Peso do cão: ");
        animal.setPeso(sc.nextDouble());
        PadronizacaoPeso.converterPeso(animal.getPeso());

        System.out.print("Porte do animal: ");
        animal.setPorte(sc.next());

        System.out.print("Nome do responsavel: ");
        animal.setNm_responsavel(sc.next());

        System.out.print("Cpf do responsável: ");
        animal.setCpf(sc.next());
        System.out.println(formatDados.converterCPF(animal.getCpf()));

        System.out.print("Contato do responsável: ");
        animal.setContato(sc.next());
        System.out.println(formatDados.converteTelefone(animal.getContato()));

        System.out.print("Endereço do responsável: ");
        animal.setEndereco(sc.next());

        AtendimentoDataBase.adicionarAnimal(animal);
        animal = new Animal();
    }

    public static void pesquisarAnimal() {

        String nomeCao;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o nome do cachorro:");
        nomeCao = sc.next();

        for (Animal x : AtendimentoDataBase.animalArrayList) {
            if (x.getNm_animal().equals(nomeCao)) {
                System.out.println("\nAnimal " + x.toString() + " foi encontrado\n");
            } else {
                System.out.println("\n***Animal não encontrado***\n");
            }
            break;
        }
    }

    public static void excluirAnimal() {

        String nomeCao;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o nome do cachorro: \n");
        nomeCao = sc.next();

        for (Animal x : AtendimentoDataBase.animalArrayList) {
            if (x.getNm_animal().equals(nomeCao)) {
                AtendimentoDataBase.animalArrayList.remove(x);
                System.out.println("Animal " + x.toString() + " excluido com sucesso");
                return;
            } else {
                System.out.println("\n***Animal não encontrado***\n");
            }
        }
    }

    public static void editarAnimal() {

        String nomeCao;
        int respostaUsuario;
        Scanner sc = new Scanner(System.in);
        FormatacaoDeDados formatDados = new FormatacaoDeDados();

        System.out.println("Informe o nome do cachorro: ");
        nomeCao = sc.next();

        for (Animal x : AtendimentoDataBase.animalArrayList) {
            if (x.getNm_animal().equals(nomeCao)) {

                System.out.print("Voce deseja editar qual campo:\n" +
                        "1-Peso\n" +
                        "2-Contato\n" +
                        "3-Endereço de cadastro.\n" +
                        "(APENAS UM POR VEZ) ");
                respostaUsuario = sc.nextInt();

                if (respostaUsuario == (1)) {
                    x.setPeso(null);
                    System.out.println("Informe o novo peso: ");
                    double novoPeso = sc.nextInt();
                    x.setPeso(novoPeso);
                    PadronizacaoPeso.converterPeso(x.getPeso());
                    System.out.println("Este é o novo peso");

                } else if (respostaUsuario == (2)) {
                    x.setContato(null);
                    System.out.println("Informe o novo contato: ");
                    String novoContato = sc.next();
                    x.setContato(novoContato);
                    formatDados.converteTelefone(x.getContato());
                    System.out.println("Este é o novo contato");

                } else if (respostaUsuario == (3)) {
                    x.setEndereco(null);
                    System.out.println("Informe o novo endereço: ");
                    String novoEndereco = sc.next();
                    x.setEndereco(novoEndereco);
                    System.out.println("Este é o novo endereço");

                }
            }
        }
    }
}