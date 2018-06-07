package com.company.animals;

public class Rabbit extends Animal {


private String furColor;
private double weight;
private double earLenth;
private String favoriteFood;


    public Rabbit(String name, String location, char gender, double weight, String furColor, double earLenth) {
        super(name, location, gender, weight);
        this.furColor = furColor;
        this.earLenth = earLenth;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getEarLenth() {
        return earLenth;
    }

    public void setEarLenth(double earLenth) {
        this.earLenth = earLenth;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
}
