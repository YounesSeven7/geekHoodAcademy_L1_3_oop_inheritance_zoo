package com.company.model.animalsType;

import com.company.helper.animal.AnimalsTypeCounter;
import com.company.helper.animal.makeAnimal.MakeAnimalFamily;
import com.company.model.Animals;

public class Mammals extends Animals {
    String family;


    public Mammals() {
        AnimalsTypeCounter.mammals++;
        this.family = MakeAnimalFamily.enterMammalsFamily();
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "family= " + family +
                super.toString() +
                '}';
    }
}
