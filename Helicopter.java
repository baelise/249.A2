package Helicopters;

import Airplanes.*;
public class Helicopter extends Airplane {
	protected int numCyl;
	protected int cYear;
	protected int cap;
	//CONSTRUCTORS
	public Helicopter () {
		super();
		this.numCyl = 0;
		this.cYear = 0;
		this.cap = 0;
	}
	public Helicopter(Helicopter h) {
		this.brand = h.brand;
		this.price = h.price;
		this.horsepower = h.horsepower;
		this.numCyl = h.numCyl;
		this.cYear = h.cYear;
		this.cap = h.cap;
	}
	public Helicopter(String b, double p, int h, int n, int cY, int c) {
		super(b, p, h);
		this.numCyl = n;
		this.cYear = cY;
		this.cap = c;
	}
	//GETTERS & SETTERS
	public int getNumCyl() {
		return numCyl;
	}
	public void setNumCyl(int numCyl) {
		this.numCyl = numCyl;
	}
	public int getcYear() {
		return cYear;
	}
	public void setcYear(int cYear) {
		this.cYear = cYear;
	}
	public int getCap() {
		return cap;
	}
	public void setCap(int cap) {
		this.cap = cap;
	}
	//TO STRING METHOD
	@Override
	public String toString() {
		return "\n**Helicopter**\nBrand: " + brand + "\nPrice: $" + price + "\nHorsepower: " + horsepower 
				+ "\nNumber of Cylinders: " + numCyl + "\nCreation Year: " + cYear + "\nPassenger Capacity: " + cap;
		//return "**Helicopter**" + super.toString() + "\nNumber of Cylinders: " + numCyl + "\nCreation Year: " + cYear + "\nPassenger Capacity: " + cap;
	}
	//EQUALS METHOD
	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		if (this == obj)
			return true;
		Helicopter other = (Helicopter) obj;
		return cYear == other.cYear && cap == other.cap && numCyl == other.numCyl;
	}
	

}
