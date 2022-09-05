package R11_01;

public class  Computer extends TangibleAsset{

	String makerName;
	public Computer(String name, int price, String colour, String makerName) {
	super(name, price, colour);
	this.makerName = makerName;
	}
	public String getMakerName() {
		return this.makerName;
	}

}
//ア資産　イ無形資産　ウ特許権
