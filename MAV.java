package DroneMAV;

import UAVs.*;

public class MAV extends UAV {
	String model;
	double size;
	//CONSTRUCTORS
	public MAV () {
		super();
		this.model = "NONE";
		this.size = 0.0;
	}
	public MAV(MAV m) {
		this.weight = m.weight;
		this.price = m.price;
		this.model = m.model;
		this.size = m.size;
	}
	public MAV(double w, double p, String m, double s) {
		super(w, p);
		this.model = m;
		this.size = s;
	}
	//GETTERS & SETTERS
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	//TO STRING METHOD
	@Override
	public String toString() {
		return "\n**Agricultural Drone**\nWeight: " + weight + "kg" + "\nPrice: $" + price + "\nModel: " + model
				+ "\nSize: " + size;
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
		MAV other = (MAV) obj;
		return model == other.model && size == other.size;
	}
	
}
