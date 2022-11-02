package com.company;

import com.company.helper.animal.PrintAnimals;
import com.company.helper.animal.Zoo;
import com.company.helper.animal.makeAnimal.MakeAnimalFamily;
import com.company.helper.animal.makeAnimal.MakeAnimals;
import com.company.model.Animals;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Zoo.makeAnimals();
        List<Animals> animalsList = Zoo.getAnimalsList();
        PrintAnimals.printAnimalsInfo(animalsList);
    }
}
