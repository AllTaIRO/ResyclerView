package com.example.recyclerview;

public class item {

    String name;
    String cost;
    int image;

    public item(String name, String cost, int image) {
        this.name = name;
        this.cost = cost;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

