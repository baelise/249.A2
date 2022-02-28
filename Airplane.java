package Airplanes;

public class Airplane {
	protected String brand;
	protected double price;
	protected int horsepower;
	//CONSTRUCTORS
	public Airplane () {
		this.brand = "NONE";
		this.price = 0.0;
		this.horsepower = 0;
	}
	public Airplane(Airplane ap) {
		this.brand = ap.brand;
		this.price = ap.price;
		this.horsepower = ap.horsepower;
	}
	public Airplane(String b, double p, int h) {
		this.brand = b;
		this.price = p;
		this.horsepower = h;
	}
	//GETTERS & SETTERS
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	//TO STRING METHOD
	@Override
	public String toString() {
		return "\n**Airplane**\nBrand: " + brand + "\nPrice: $" + price + "\nHorsepower: " + horsepower;
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
		Airplane other = (Airplane) obj;
		return brand == other.brand && horsepower == other.horsepower && price == other.price;
	}
}
