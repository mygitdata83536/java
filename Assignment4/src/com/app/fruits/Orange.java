package com.app.fruits;

public class Orange extends Fruit {
	public 	Orange() {
        //super("Orange", "Orange", 0.0);
    	setColour("Orange");
    	this.setName("Orange");
    	this.setWeigth(50.0);
    }

    @Override
    public String taste() {
        return "Sour";
    }}
