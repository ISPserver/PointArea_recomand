package com.example.customview;

import android.widget.CheckBox;

public class CoffeeData {

    private String coffeee;
    int coffeeImgId;


    public CoffeeData(String coffeee, int coffeeImgId) {

        this.coffeee = coffeee;
        this.coffeeImgId = coffeeImgId;
    }

    public String getCoffeee() {
        return coffeee;
    }

    public void setCoffeee(String coffeee){

        this.coffeee = coffeee;
    }



    public int getCoffeeImgId(){

        return coffeeImgId;
    }

    public void setCoffeeImgId(int coffeeImgId){

        this.coffeeImgId = coffeeImgId;
    }

}