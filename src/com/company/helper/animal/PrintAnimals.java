package com.company.helper.animal;

import com.company.model.Animals;
import com.company.model.animalsType.Amphibians;
import com.company.model.animalsType.Birds;
import com.company.model.animalsType.Fish;
import com.company.model.animalsType.Mammals;

import java.util.List;

public class PrintAnimals {

    public static void printAnimalsInfo(List<Animals> animalsList) {
        for (Animals animal : animalsList) {
            if (animal instanceof Mammals) {
                System.out.println(((Mammals) animal).toString());
            } else if (animal instanceof Fish) {
                System.out.println(((Fish) animal).toString());
            } else if (animal instanceof Amphibians) {
                System.out.println(((Amphibians) animal).toString());
            } else {
                System.out.println(((Birds) animal).toString());
            }
        }
    }

}
