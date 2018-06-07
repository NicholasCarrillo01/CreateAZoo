package com.company;

public class Food extends Items {


  private String category;
  private String expirationDate;
  private boolean refrigerated;


    public Food(String category, String expirationDate, boolean refrigerated) {
        this.category = category;
        this.expirationDate = expirationDate;
        this.refrigerated = refrigerated;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isRefrigerated() {
        return refrigerated;
    }

    public void setRefrigerated(boolean refrigerated) {
        this.refrigerated = refrigerated;
    }
}
