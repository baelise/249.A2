//--------------------------------------------------------------------
// Elise Proulx (40125538) and Andrei Barbulescu (40208635)
// COMP 249 - Section S
// Assignment 2
// 03/04/2022
//--------------------------------------------------------------------
package Helicopters;

import Airplanes.*;
public class Helicopter extends Airplane {
	protected int numCyl;
	protected int cYear;
	protected int cap;
	// Constructors
	public Helicopter () {
		super();
		this.numCyl = 0;
		this.cYear = 0;
		this.cap = 0;
	}
	public Helicopter(Helicopter h) {
		super(h);
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
	// Getters and setters
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
	// toString method
	@Override
	public String toString() {
		return "\n**Helicopter**\nBrand: " + brand + "\nPrice: $" + price + "\nHorsepower: " + horsepower 
				+ "\nNumber of Cylinders: " + numCyl + "\nCreation Year: " + cYear + "\nPassenger Capacity: " + cap;
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
		Helicopter other = (Helicopter) obj;
		return cYear == other.cYear && cap == other.cap && numCyl == other.numCyl;
	}
	// copy method
	@Override
	public Helicopter copy() {
		return new Helicopter(this); // calls copy Helicopter constructor
	}
}
