package R11_02;

public abstract class TangibleAsset extends Asset {
	//String name;
	//int price;
	String colour;

	public TangibleAsset(String name, int price, String colour) {
		super(name, price);
		//this.name = name;
		//this.price = price;
		this.colour = colour;
	}
	/*public String getName() {
		return name;
	}
	public int price() {
		return price;
	}*/
	public String getColour() {
		return colour;
	}

}
