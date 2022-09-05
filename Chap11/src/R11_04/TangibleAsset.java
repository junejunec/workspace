package R11_04;

public abstract class TangibleAsset extends Asset implements Thing {
	double weight;
	String colour;

	public TangibleAsset(String name, int price, String colour) {
		super(name, price);
		this.name = name;
		this.price = price;
		this.colour = colour;
	}
	public String getcolour() {
		return colour;
	}
	public double getWeight() {
		return this.weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
