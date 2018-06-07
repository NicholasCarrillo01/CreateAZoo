package com.company.people;

public class Visitor extends People {


private int groupSize;
private boolean membership;
private String location;
private String allergies;


    public Visitor(int groupSize, boolean membership, String location) {
        this.groupSize = groupSize;
        this.membership = membership;
        this.location = location;
    }

    public int getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }

    public boolean isMembership() {
        return membership;
    }

    public void setMembership(boolean membership) {
        this.membership = membership;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }
}
