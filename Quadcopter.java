//--------------------------------------------------------------------
// Elise Proulx (40125538) and Andrei Barbulescu (40208635)
// COMP 249 - Section S
// Assignment 2
// 03/04/2022
//--------------------------------------------------------------------
package Helicopters;

public class Quadcopter extends Helicopter {
	private int maxSpeed;
	// Constructors
	public Quadcopter () {
		super();
		this.maxSpeed = 0;
	}
	public Quadcopter(Quadcopter q) {
		super(q);
		this.numCyl = q.numCyl;
		this.cYear = q.cYear;
		this.maxSpeed = q.maxSpeed;
	}
	public Quadcopter(String b, double p, int h, int n, int cY, int c, int m) {
		super(b, p, h, n , cY, c);
		this.maxSpeed = m;
	}
	// Getters and setters
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	// toString method
	@Override
	public String toString() {
		return "\n**Quadcopter**\nBrand: " + brand + "\nPrice: $" + price + "\nHorsepower: " + horsepower 
				+ "\nNumber of Cylinders: " + numCyl + "\nCreation Year: " + cYear 
				+ "\nPassenger Capacity: " + cap + "\nMaximum Speed: " + maxSpeed + "km/h";
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
		Quadcopter other = (Quadcopter) obj;
		return maxSpeed == other.maxSpeed;
	}
	// copy method
	@Override
	public Quadcopter copy() {
		return new Quadcopter(this); // calls copy Quadcopter constructor
	}
}
