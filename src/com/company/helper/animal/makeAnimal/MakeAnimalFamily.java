package com.company.helper.animal.makeAnimal;

import com.company.helper.SingletonScanner;

public class MakeAnimalFamily {
    public static  SingletonScanner singletonScanner = SingletonScanner.getIntent();

    public static String enterMammalsFamily() {
        switch (getMammalsFamilyChoice()) {
            case 1:
                return "Cats";
            case 2:
                return "Bears";
            default:
                return "kangaroos";
        }
    }

    public static String enterFishFamily() {
        switch (getFishFamilyChoice()) {
            case 1:
                return "Sharks";
            case 2:
                return "Dolphins";
            default:
                return "Octopuses";
        }
    }

    public static String enterAmphibiansFamily() {
        switch (getAmphibiansFamilyChoice()) {
            case 1:
                return "Frogs";
            case 2:
                return "Penguin";
            default:
                return "Hippos";
        }
    }

    public static String enterBirdsFamily() {
        switch (getBirdsFamilyChoice()) {
            case 1:
                return "OwlS";
            case 2:
                return "Vultures";
            default:
                return "Pigeons";
        }
    }

    private static int getMammalsFamilyChoice() {
        System.out.print("Enter mammals family \n 1-Cats \n 2-Bears \n 3-kangaroos \n -> ");
        int choice = singletonScanner.scanInt();
        return getValidChoice(choice);
    }

    private static int getFishFamilyChoice() {
        System.out.print("Enter fish family \n 1-Sharks \n 2-Dolphins \n 3-Octopuses \n -> ");
        int choice = singletonScanner.scanInt();
        return getValidChoice(choice);
    }

    private static int getAmphibiansFamilyChoice() {
        System.out.print("Enter amphibians family \n 1-Frogs  \n 2-Penguin \n 3-Hippos \n -> ");
        int choice = singletonScanner.scanInt();
        return getValidChoice(choice);
    }

    private static int getBirdsFamilyChoice() {
        System.out.print("Enter birds family \n 1-OwlS \n 2-Vultures \n 3-Pigeons \n -> ");
        int choice = singletonScanner.scanInt();
        return getValidChoice(choice);
    }

    private static int getValidChoice(int choice) {
        while (choice < 0 || choice > 3) {
            System.out.print("Enter number 1, 2 or 3 ->");
            choice = singletonScanner.scanInt();
        }
        return choice;
    }

}
