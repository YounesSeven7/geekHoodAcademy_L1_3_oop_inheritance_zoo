package com.company.helper.animal;

import com.company.helper.SingletonScanner;
import com.company.helper.animal.makeAnimal.MakeAnimals;
import com.company.model.Animals;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private static SingletonScanner singletonScanner = SingletonScanner.getIntent();
    private static List<Animals> animalsList = new ArrayList<>();

    public static void makeAnimals() {
        System.out.println("welcome in our zoo, insert any animals you need ");
        do {
            Animals animals = MakeAnimals.makesAnAnimal();
            animalsList.add(animals);
        } while (doYouNeedMoreAnimals());
    }

    public static List<Animals> getAnimalsList() {
        return animalsList;
    }

    private static boolean doYouNeedMoreAnimals() {
        return returnYesOrNoChios() == 1;
    }

    private static int returnYesOrNoChios() {
        int choice = 0;
        do {
            System.out.print("Do you need more animals \n 1-yes \n 2-no  \n -> ");
            choice = singletonScanner.scanInt();
        } while (choice != 1 && choice != 2);
        return choice;
    }

}
