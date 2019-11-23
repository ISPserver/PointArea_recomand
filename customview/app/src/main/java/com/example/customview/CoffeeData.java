package com.example.customview;


import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class CoffeeData {

    private String coffeee;
    Drawable coffeeImgId;


    public CoffeeData(String coffeee, Drawable coffeeImgId) {

        this.coffeee = coffeee;
        this.coffeeImgId = coffeeImgId;
    }

    public String getCoffeee() {
        return coffeee;
    }

    public void setCoffeee(String coffeee){

        this.coffeee = coffeee;
    }



    public Drawable getCoffeeImgId(){

        return coffeeImgId;
    }

    public void setCoffeeImgId(Drawable coffeeImgId){

        this.coffeeImgId = coffeeImgId;
    }

}