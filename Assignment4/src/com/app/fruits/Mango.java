package com.app.fruits;

public class Mango extends Fruit {
    public Mango() {
        //super("Mango", "Yellow", 0.0);
    	setColour("Yellow");
    	this.setName("Mango");
    	this.setWeigth(60.0);
    }

    @Override
    public String taste() {
        return "sweet";
    }

}