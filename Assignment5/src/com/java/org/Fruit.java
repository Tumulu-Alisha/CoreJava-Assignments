package com.java.org;

public class Fruit {
	
	String FName;
	int  FCalories;
	int  FPrice;
	String FColour;
	public Fruit(String fruitName, int fruitCalories, int fruitPrice, String fruitColour) {
	
		this.FName = fruitName;
		this.FCalories = fruitCalories;
		this.FPrice = fruitPrice;
		this.FColour = fruitColour;
	}
	public String getFruitName() {
		return FName;
	}
	public void setFruitName(String fruitName) {
		FName = fruitName;
	}
	public int getFruitCalories() {
		return FCalories;
	}
	public void setFruitCalories(int fruitCalories) {
		FCalories = fruitCalories;
	}
	public int getFruitPrice() {
		return FPrice;
	}
	public void setFruitPrice(int fruitPrice) {
		FPrice = fruitPrice;
	}
	public String getFruitColour() {
		return FColour;
	}
	public void setFruitColour(String fruitColour) {
		FColour = fruitColour;
	}
	@Override
	public String toString() {
		return "Fruit [FruitName=" + FName + ", FruitCalories=" + FCalories + ", FruitPrice=" + FPrice
				+ ", FruitColour=" + FColour + "]";
	}
}
