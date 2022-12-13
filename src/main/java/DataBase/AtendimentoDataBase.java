package DataBase;

import Model.Animal;
import Model.Atendimento;
import Model.Prestador;

import java.util.ArrayList;

public class AtendimentoDataBase {

    public static ArrayList<Atendimento> atendimentoArrayList = new ArrayList<>();
    public static ArrayList<Animal> animalArrayList = new ArrayList<>();
    public static ArrayList<Prestador> prestadorArrayList = new ArrayList<>();

    public static void adicionarAnimal(Animal cao){
        animalArrayList.add(cao);
    }
    public static void adicionarPrestador(Prestador prest){
        prestadorArrayList.add(prest);
    }
    public static void adicionarAtendimento(Atendimento atd){
        atendimentoArrayList.add(atd);
    }

}

