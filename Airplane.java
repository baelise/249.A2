//--------------------------------------------------------------------
// Elise Proulx (40125538) and Andrei Barbulescu (40208635)
// COMP 249 - Section S
// Assignment 2
// 03/04/2022
//--------------------------------------------------------------------
package Airplanes;
 import driverPack.FlyingObject;

public class Airplane extends FlyingObject {
	protected String brand;
	protected double price;
	protected int horsepower;
	// Constructors
	public Airplane () {
		this.price = 0.0;
		this.brand = "NONE";
		this.horsepower = 0;
	}
	public Airplane(Airplane ap) {
		this.price = ap.price;
		this.brand = ap.brand;
		this.horsepower = ap.horsepower;
	}
	public Airplane(String b, double p, int h) {
		this.price = p;
		this.brand = b;
		this.horsepower = h;
	}
	// Getters and setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	// toString method
	@Override
	public String toString() {
		return "\n**Airplane**\nBrand: " + brand + "\nPrice: $" + price + "\nHorsepower: " + horsepower;
	}
	// equals method
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if (this == obj)
			return true;
		Airplane other = (Airplane) obj;
		return brand == other.brand && horsepower == other.horsepower && price == other.price;
	}
	// copy method
	@Override
	public Airplane copy() {
		return new Airplane(this); // calls copy Airplane constructor
	}
}
