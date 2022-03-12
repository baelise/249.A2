//--------------------------------------------------------------------
// Elise Proulx (40125538) and Andrei Barbulescu (40208635)
// COMP 249 - Section S
// Assignment 2
// 03/04/2022
//--------------------------------------------------------------------
package DroneMAV;
// Importing UAV package
import UAVs.*;

public class MAV extends UAV {
	private String model;
	private double size;
	// Constructors
	public MAV () {
		super();
		this.model = "NONE";
		this.size = 0.0;
	}
	public MAV(MAV m) {
		super(m);
		this.model = m.model;
		this.size = m.size;
	}
	public MAV(double w, double p, String m, double s) {
		super(w, p);
		this.model = m;
		this.size = s;
	}
	// Getters and setters
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
	// toString method
	@Override
	public String toString() {
		return "\n**MAV**\nWeight: " + weight + "kg" + "\nPrice: $" + price + "\nModel: " + model
				+ "\nSize: " + size + "cm";
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
		MAV other = (MAV) obj;
		return model == other.model && size == other.size;
	}
	// copy method
	@Override
	public MAV copy() {
		return new MAV(this); // calls copy MAV constructor
	}
}
