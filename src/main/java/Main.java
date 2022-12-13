import Controller.AnimalController;
import Controller.AtendimentoController;

import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class Main {

    public static void main (String []args){

        Scanner sc = new Scanner(System.in);
        char sair;

        System.out.println("Olá! Seja bem-vindo ao Restauracão");

        do{

        menuInteracao();

        int opcaoCodigo;

        System.out.print("Digite o número da ação que voce deseja realizar: ");
        opcaoCodigo = sc.nextInt();


            switch (opcaoCodigo) {
                case 1:
                    AnimalController.inserirCao();
                    break;
                case 2:
                    AtendimentoController.inserirAtendimento();
                    break;
                case 3:
                    AtendimentoController.consultarAtendimento();
                    break;
                case 4:
                    AnimalController.pesquisarAnimal();
                    break;
                case 5:
                    AnimalController.excluirAnimal();
                    break;
                case 6:
                    AtendimentoController.excluirAtendimento();
                    break;
                case 7:
                    AnimalController.editarAnimal();

            }

        System.out.println("Voce deseja sair do sitema?" +
                "\nEscreva 's' para sim e 'n' para nao");

        sair = toUpperCase(sc.next().charAt(0));
        }while (sair!='S');
    }
    public static void menuInteracao(){

        System.out.printf("1- Cadastrar um novo PET \n" +
                "2- Iniciar um novo atendimento \n" +
                "3- Consultar um atendimento anterior \n" +
                "4- Consultar cadastro de um PET\n" +
                "5- Excluir o cadastro de um PET\n" +
                "6- Excluir o cadastro de um atendimento\n" +
                "7- Editar dados do animal\n");
    }

}
