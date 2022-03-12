//--------------------------------------------------------------------
// Elise Proulx (40125538) and Andrei Barbulescu (40208635)
// COMP 249 - Section S
// Assignment 2
// 03/04/2022
//--------------------------------------------------------------------
package Multirotors;
import Helicopters.*;

public class Multirotor extends Helicopter {
	private int numRot;
	// Constructors
	public Multirotor () {
		super();
		this.numRot = 0;
	}
	public Multirotor (Multirotor m) {
		super(m);
		this.numCyl = m.numCyl;
		this.cYear = m.cYear;
		this.cap = m.cap;
		this.numRot = m.numRot;
	}
	public Multirotor (String b, double p, int h, int n, int cY, int c, int nR) {
		super(b, p, h, n , cY, c);
		this.numRot = nR;
	}
	// Getters and setters
	public int getNumRot() {
		return numRot;
	}
	public void setNumRot(int numRot) {
		this.numRot = numRot;
	}
	// toString method
	@Override
	public String toString() {
		return "\n**Multirotor**\nBrand: " + brand + "\nPrice: $" + price + "\nHorsepower: " + horsepower 
				+ "\nNumber of Cylinders: " + numCyl + "\nCreation Year: " + cYear 
				+ "\nPassenger Capacity: " + cap + "\nNumber of Rotors: " + numRot;
	}
	// equals method
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
	// copy method
	@Override
	public Multirotor copy() {
		return new Multirotor(this); // calls copy Multirotor constructor
	}
}

