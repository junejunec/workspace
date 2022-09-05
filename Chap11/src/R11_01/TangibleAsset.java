package R11_01;

public abstract class TangibleAsset {//抽象クラスを作成
	String name;
	int price;
	String colour;//共通点　有形

	public TangibleAsset(String name, int price, String colour) {
		this.name = name;
		this.price = price;
		this.colour = colour;
	}
	public String getName() {
		return name;
	}
	public int price() {
		return price;
	}
	public String colour() {
		return colour;
	}

}
