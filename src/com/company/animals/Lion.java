package com.company.animals;

public class Lion extends Animal         {


private boolean isTrained;
private double  maneLenth;
private double  noseSize;


    public Lion(String name, String location, char gender, double weight, double maneLenth, double noseSize) {
        super(name, location, gender, weight);
        this.maneLenth = maneLenth;
        this.noseSize = noseSize;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    public double getManeLenth() {
        return maneLenth;
    }

    public void setManeLenth(double maneLenth) {
        this.maneLenth = maneLenth;
    }

    public double getNoseSize() {
        return noseSize;
    }

    public void setNoseSize(double noseSize) {
        this.noseSize = noseSize;
    }
}
