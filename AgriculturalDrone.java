//--------------------------------------------------------------------
// Elise Proulx (40125538) and Andrei Barbulescu (40208635)
// COMP 249 - Section S
// Assignment 2
// 03/04/2022
//--------------------------------------------------------------------
package DroneMAV;
// Importing all necessary packages
import UAVs.*;

public class AgriculturalDrone extends UAV {
	private String brand;
	private int cap;
	// Constructors
	public AgriculturalDrone () {
		super();
		this.brand = "NONE";
		this.cap = 0;
	}
	public AgriculturalDrone (AgriculturalDrone a) {
		super(a);
		this.brand = a.brand;
		this.cap = a.cap;
	}
	public AgriculturalDrone(double w, double p, String b, int c) {
		super(w, p);
		this.brand = b;
		this.cap = c;
	}
	// Getters and setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
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
		return "\n**Agricultural Drone**\nWeight: " + weight + "kg" + "\nPrice: $" + price + "\nBrand: " + brand
				+ "\nPassenger Capacity: " + cap;
	}
	// equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		AgriculturalDrone other = (AgriculturalDrone) obj;
		return brand == other.brand && cap == other.cap;
	}
	// copy method
	@Override
	public AgriculturalDrone copy() {
		return new AgriculturalDrone(this); // calls copy AgriculturalDrone constructor
	}
}
