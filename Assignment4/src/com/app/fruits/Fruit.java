package com.app.fruits;

public class Fruit {
	 private String colour;
	 private double weigth;
	 private String name;
	 private  boolean isFresh;
	 
	 public Fruit()
	 {
		 
	 }

	public Fruit( String name,String colour, double weigth) {
		this.colour = colour;
		this.weigth = weigth;
		this.name = name;
		this.isFresh = true;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

		public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

    public String taste() {
        return "no specific taste";
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Color: " + colour + ", Weight: " + weigth;
    }
	 
}
