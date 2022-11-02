package com.company.model.animalsType;

import com.company.helper.animal.AnimalsTypeCounter;
import com.company.helper.animal.makeAnimal.MakeAnimalFamily;
import com.company.model.Animals;

public class Birds extends Animals {
    String family;

    public Birds() {
        AnimalsTypeCounter.birds++;
        this.family = MakeAnimalFamily.enterBirdsFamily();
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Birds{" +
                "family='" + family + '\'' +
                super.toString() +
                '}';
    }
}
