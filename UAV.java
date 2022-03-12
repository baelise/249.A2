//--------------------------------------------------------------------
// Elise Proulx (40125538) and Andrei Barbulescu (40208635)
// COMP 249 - Section S
// Assignment 2
// 03/04/2022
//--------------------------------------------------------------------
package UAVs;
import driverPack.FlyingObject;

public class UAV extends FlyingObject{
	protected double weight;
	protected double price;
	// Constructors
	public UAV () {
		this.price = 0.0;
		this.weight = 0.0;
	}
	public UAV (UAV u) {
		this.price = u.price;
		this.weight = u.weight;
	}
	public UAV(double w, double p) {
		this.price = p;
		this.weight = w;
	}
	// Getters and setters
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	// toString method
	@Override
	public String toString() {
		return "\n**UAV**\nWeight: " + weight + "kg" + "\nPrice: $" + price;
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
		UAV other = (UAV) obj;
		return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}
	// copy method
	@Override
	public UAV copy() {
		return new UAV(this); // calls copy UAV constructor
	}
}
