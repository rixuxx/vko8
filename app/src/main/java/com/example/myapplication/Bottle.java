package com.example.myapplication;

public class Bottle {
    private String name;
    private String manufacturer;
    private double total_energy;
    private double price;
    private double size;

    public Bottle(){
        name = "Pepsi Max";
        manufacturer = "Pepsi";
        total_energy = 0.3;
        price = 1.80;
        size = 0.5;
    }
    public Bottle(String name, String manuf, float totE, double price, double size){
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public double getEnergy(){
        return total_energy;
    }
    public double getPrice(){
        return price;
    }
    public double getSize(){
        return size;
    }
}
