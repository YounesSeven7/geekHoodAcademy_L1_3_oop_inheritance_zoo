package com.company.helper.animal.makeAnimal;

import com.company.helper.SingletonScanner;
import com.company.model.Animals;
import com.company.model.animalsType.Amphibians;
import com.company.model.animalsType.Birds;
import com.company.model.animalsType.Fish;
import com.company.model.animalsType.Mammals;

public class MakeAnimals{
    private static SingletonScanner singletonScanner = SingletonScanner.getIntent();

    public static Animals makesAnAnimal() {
        String name = enterName();
        Animals animals = enterType();
        animals.setName(name);
        animals.setNumberOfMatingTimes(enterNumberOfMatingTimes());
        animals.setBabiesOfMatingInSeason(enterBabiesOfMatingInSeason());
        animals.setYearsToAbleToMating(enterYearsToAbleToMating());
        animals.setDeathPercentInYear(enterDeathPercentInYear());
        animals.setFoodType(enterFoodType());
        animals.setFoodPriceNow(enterFoodPriceNow());
        animals.setFoodPriceBeforeMonth(enterFoodPriceBeforeMonth());
        animals.setFoodAmountInDay(enterFoodAmountInDay());
        return animals;
    }

    private static String enterName() {
        System.out.print("Enter its name: ");
        return singletonScanner.scanString();
    }

    // need some change in valid value
    private static Animals enterType() {
        System.out.print("Enter its type \n 1-Mammals \n 2-Fish \n 3-Amphibians \n 4-Birds \n -> ");
        int choice = singletonScanner.scanInt();
        switch (getValidChoice(choice)) {
            case 1:
                return new Mammals();
            case 2:
                return new Fish();
            case 3:
                return  new Amphibians();
            default:
                return new Birds();
        }
    }

    private static int getValidChoice(int choice) {
        while (choice < 0 || choice > 4) {
            System.out.print("Enter number 1, 2, 3 or 4 ->");
            choice = singletonScanner.scanInt();
        }
        return choice;
    }

    private static int returnValidFamilyChios() {
        int choice = singletonScanner.scanInt();
        while (choice > 4 || choice < 0) {
            System.out.print("Enter number from this list of numbers (1, 2, 3, 4) \n " +
                    "Enter its type \n 1-Mammals \n 2-Fish \n 3-Amphibians \n 4-Birds \n -> ");
            choice = singletonScanner.scanInt();
        }
        return choice;
    }

    private static int enterNumberOfMatingTimes() {
        System.out.print("Enter number of mating times: ");
        return singletonScanner.scanInt();
    }

    private static int enterBabiesOfMatingInSeason() {
        System.out.print("Enter babies of mating in season: ");
        return singletonScanner.scanInt();
    }

    private static int enterYearsToAbleToMating() {
        System.out.print("Enter years to able to mating: ");
        return singletonScanner.scanInt();
    }

    private static int enterDeathPercentInYear() {
        System.out.print("Enter death percent in year: ");
        return returnValidPercent();
    }

    private static int returnValidPercent() {
        int percent = singletonScanner.scanInt();
        while (percent<0) {
            System.out.print("Invalid percent, Enter death percent in year: ");
            percent = singletonScanner.scanInt();
        }
        return percent;
    }

    private static String enterFoodType() {
        System.out.print("Enter food type: ");
        return singletonScanner.scanString();
    }

    private static int enterFoodPriceNow() {
        System.out.print("Enter food price now: ");
        return singletonScanner.scanInt();
    }

    private static int enterFoodPriceBeforeMonth() {
        System.out.print("Enter food price before month: ");
        return singletonScanner.scanInt();
    }

    private static int enterFoodAmountInDay() {
        System.out.print("Enter food amount in day: ");
        return singletonScanner.scanInt();
    }

    private static int enterFoodAmountInMonth() {
        System.out.print("Enter food amount in month: ");
        return singletonScanner.scanInt();
    }
}
