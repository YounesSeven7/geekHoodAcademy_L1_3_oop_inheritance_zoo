package com.company.model;

public class Animals {
    private String name;
    private int numberOfMatingTimes, babiesOfMatingInSeason, yearsToAbleToMating, deathPercentInYear;
    private String foodType;
    //price for 18(kg)
    private int foodPriceNow, foodPriceBeforeMonth, foodAmountInDay;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfMatingTimes() {
        return numberOfMatingTimes;
    }

    public void setNumberOfMatingTimes(int numberOfMatingTimes) {
        this.numberOfMatingTimes = numberOfMatingTimes;
    }

    public int getBabiesOfMatingInSeason() {
        return babiesOfMatingInSeason;
    }

    public void setBabiesOfMatingInSeason(int babiesOfMatingInSeason) {
        this.babiesOfMatingInSeason = babiesOfMatingInSeason;
    }


    public int getYearsToAbleToMating() {
        return yearsToAbleToMating;
    }

    public void setYearsToAbleToMating(int yearsToAbleToMating) {
        this.yearsToAbleToMating = yearsToAbleToMating;
    }

    public int getDeathPercentInYear() {
        return deathPercentInYear;
    }

    public void setDeathPercentInYear(int deathPercentInYear) {
        this.deathPercentInYear = deathPercentInYear;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getFoodPriceNow() {
        return foodPriceNow;
    }

    public void setFoodPriceNow(int foodPriceNow) {
        this.foodPriceNow = foodPriceNow;
    }

    public int getFoodPriceBeforeMonth() {
        return foodPriceBeforeMonth;
    }

    public void setFoodPriceBeforeMonth(int foodPriceBeforeMonth) {
        this.foodPriceBeforeMonth = foodPriceBeforeMonth;
    }

    public void setFoodAmountInDay(int foodAmountInDay) {
        this.foodAmountInDay = foodAmountInDay;
    }

    public int calculateBabiesOfMatingInYear() {
        return babiesOfMatingInSeason*numberOfMatingTimes;
    }

    public int calculatorPercentageChangeInPrice() {
        return (foodPriceNow*100)/foodPriceBeforeMonth;
    }

    public boolean isThisAnimalThreatenedWithExtinction() {
        return (100-deathPercentInYear)>=25;
    }

    public int getFoodAmountInMonth() {
        return foodAmountInDay*30;
    }

    @Override
    public String toString() {
        return  "name= " + name +
                ", numberOfMatingTimes= " + numberOfMatingTimes +
                ", babiesOfMatingInSeason= " + babiesOfMatingInSeason +
                ", yearsToAbleToMating= " + yearsToAbleToMating +
                ", babiesOfMatingInYear= " + calculateBabiesOfMatingInYear()+
                ", deathPercentInYear= " + deathPercentInYear + "%" +
                ", isThisAnimalThreatenedWithExtinction = " + isThisAnimalThreatenedWithExtinction()+
                "------food-----" +
                ", foodType= " + foodType  +
                ", foodPriceNow= " + foodPriceNow +
                ", foodPriceBeforeMonth= " + foodPriceBeforeMonth +
                ", percentageChangeInPrice= " + calculatorPercentageChangeInPrice()+  "%" +
                ", foodAmountInDay= " + foodAmountInDay +
                ", foodAmountInMonth" + getFoodAmountInMonth()+
                '}';
    }
}
