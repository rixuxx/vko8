package com.example.myapplication;

import java.util.ArrayList;

public class BottleDispenser {
    private int bottles;
    private int money;
    private ArrayList<Bottle> bottle_list = new ArrayList<>();

    private static BottleDispenser instance = null;

    private BottleDispenser() {
        bottles = 5;
        money = 0;

        for(int i = 0; i<bottles; i++) {
            bottle_list.add(new Bottle());
        }
    }

    public String addMoney() {
        money += 1;
        String sentence = "Klink! Added more money!";
        return (sentence);
    }

    public String buyBottle() {
        String sentence;
        if (bottles == 0) {
            sentence = "Out of bottles.";
        } else if (money < bottle_list.get(bottles-1).getPrice()) {
            sentence = "Add money first!";
        } else {
            bottles -= 1;
            money -= bottle_list.get(bottles).getPrice();
            sentence = "KACHUNK! "+ bottle_list.get(bottles).getName() +" came out of the dispenser!";
            deleteBottle();
        }
        return (sentence);
    }

    public String returnMoney() {
        money = 0;
        String sentence = "Klink klink. Money came out!";
        return (sentence);
    }

    public void deleteBottle(){
        bottle_list.remove(bottles);
    }

    public void printBottles() {
        int i = 1;
        for (Bottle bottle : bottle_list){
            System.out.println(i + ". Name: "+bottle.getName());
            System.out.println( "Size: " + bottle.getSize() + " Price: " +bottle.getPrice());
            i += 1;
        }
    }
    public static BottleDispenser getInstance() {
        if (instance == null) {
            instance = new BottleDispenser();
        }
        return (instance);
    }
}

