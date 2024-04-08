package com.app.fruits;

public class Apple extends Fruit {
	public Apple() {
        //super("Apple", "RED", 0.0);
    	setColour("RED");
    	this.setName("Apple");
    	this.setWeigth(100.0);
    }

    @Override
    public String taste() {
        return "sweet and sour";
    }
}
