package Helicopters;

public class Quadcopter extends Helicopter {
	int maxSpeed;
	//CONSTRUCTORS
	public Quadcopter () {
		super();
		this.maxSpeed = 0;
	}
	public Quadcopter(Quadcopter q) {
		this.brand = q.brand;
		this.price = q.price;
		this.horsepower = q.horsepower;
		this.numCyl = q.numCyl;
		this.cYear = q.cYear;
		this.maxSpeed = q.maxSpeed;
	}
	public Quadcopter(String b, double p, int h, int n, int cY, int c, int m) {
		super(b, p, h, n , cY, c);
		this.maxSpeed = m;
	}
	//GETTER & SETTER
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	//TO STRING METHOD
	@Override
	public String toString() {
		return "\n**Quadcopter**\nBrand: " + brand + "\nPrice: $" + price + "\nHorsepower: " + horsepower 
				+ "\nNumber of Cylinders: " + numCyl + "\nCreation Year: " + cYear 
				+ "\nPassenger Capacity: " + cap + "\nMaximum Speed: " + maxSpeed + "km/h";
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
		Quadcopter other = (Quadcopter) obj;
		return maxSpeed == other.maxSpeed;
	}
	
}
