package DroneMAV;
import UAVs.*;

public class AgriculturalDrone extends UAV {
	String brand;
	int cap;
	//CONSTRUCTORS
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
	//GETTETRS & SETTERS
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
	//TO STRING METHOD
	@Override
	public String toString() {
		return "\n**Agricultural Drone**\nWeight: " + weight + "kg" + "\nPrice: $" + price + "\nBrand: " + brand
				+ "\nPassenger Capacity: " + cap;
	}
	//EQUALS METHOD
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
}
