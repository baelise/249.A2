package Multirotors;

import Helicopters.*;

public class Multirotor extends Helicopter {
	int numRot;
	//CONSTRUCTORS
	public Multirotor () {
		super();
		this.numRot = 0;
	}
	public Multirotor (Multirotor m) {
		this.brand = m.brand;
		this.price = m.price;
		this.horsepower = m.horsepower;
		this.numCyl = m.numCyl;
		this.cYear = m.cYear;
		this.cap = m.cap;
		this.numRot = m.numRot;
	}
	
	public Multirotor (String b, double p, int h, int n, int cY, int c, int nR) {
		super(b, p, h, n , cY, c);
		this.numRot = nR;
	}
	//GETTER & SETTER
	public int getNumRot() {
		return numRot;
	}
	public void setNumRot(int numRot) {
		this.numRot = numRot;
	}
	//TO STRING METHOD
	@Override
	public String toString() {
		return "\n**Helicopter**\nBrand: " + brand + "\nPrice: $" + price + "\nHorsepower: " + horsepower 
				+ "\nNumber of Cylinders: " + numCyl + "\nCreation Year: " + cYear 
				+ "\nPassenger Capacity: " + cap + "\nNumber of Rotors: " + numRot;
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
		Multirotor other = (Multirotor) obj;
		return numRot == other.numRot;
	}	
}

