package UAVs;

public class UAV {
	protected double weight;
	protected double price;
	//CONSTRUCTORS
	public UAV () {
		this.weight = 0.0;
		this.price = 0.0;
	}
	public UAV (UAV u) {
		this.weight = u.weight;
		this.price = u.price;
	}
	public UAV(double w, double p) {
		this.weight = w;
		this.price = p;
	}
	//GETTERS & SETTERS
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
	//TO STRING METHOD
	@Override
	public String toString() {
		return "\n**UAV**\nWeight: " + weight + "kg" + "\nPrice: $" + price;
	}
	//EQUALS METHOD
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
}
