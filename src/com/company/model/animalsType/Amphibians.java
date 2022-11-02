package com.company.model.animalsType;

import com.company.helper.animal.AnimalsTypeCounter;
import com.company.helper.animal.makeAnimal.MakeAnimalFamily;
import com.company.model.Animals;

public class Amphibians extends Animals {
    String family;

    public Amphibians() {
        AnimalsTypeCounter.amphibians++;
        this.family = MakeAnimalFamily.enterAmphibiansFamily();
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "family='" + family + '\'' +
                super.toString() +
                '}';
    }
}
