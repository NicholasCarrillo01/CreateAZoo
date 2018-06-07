package com.company;

public class souvenir extends Items {


    private String type;
    private String idNumber;

    public souvenir(String type, String idNumber) {
        this.type = type;
        this.idNumber = idNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
