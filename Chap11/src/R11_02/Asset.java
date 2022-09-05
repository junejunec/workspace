package R11_02;

public abstract class Asset {
	String name;
	int price;
	String colour;
	String makeAsset;

	public Asset(String name, int price, String colour, String makeAsset) {
		this.name = name;
		this.price = price;
		this.colour = colour;
		this.makeAsset = makeAsset;

	}

}
