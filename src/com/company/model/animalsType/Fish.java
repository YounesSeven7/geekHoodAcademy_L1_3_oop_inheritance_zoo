package com.company.model.animalsType;

import com.company.helper.animal.AnimalsTypeCounter;
import com.company.helper.animal.makeAnimal.MakeAnimalFamily;
import com.company.model.Animals;

public class Fish extends Animals {
    String family;

    public Fish() {
        AnimalsTypeCounter.fish++;
        this.family = MakeAnimalFamily.enterFishFamily();
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "family='" + family + '\'' +
                super.toString() +
                '}';
    }
}
