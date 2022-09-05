package R11_01;

public  class Book extends TangibleAsset {//Tangible～を継承
	//String name;
	//int price;
	//String colour;
	String isbn;

	public Book(String name, int price, String colour, String isbn) {
		super(name, price, colour);
		this.isbn = isbn;
	}
	/*public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public String getColour(){
		return this.colour;
	}*/
	public String getIsbn(){
		return this.isbn;
	}

}
