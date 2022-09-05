package code14_04;


public class Main {

	public static void main(String[] args) {
		/*Empty*/Object e = new Empty();
		Object o= new Object();
		Object s = e.toString();
		Object o1 ="こんにちは";

		System.out.println(s);
		System.out.println(o1);
		printAnything(o1);

		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		System.out.println(h/*.toString()*/);

	}//Java.lang.Objectがすべてのクラスの親

	public static void printAnything(Object o) {
		System.out.println(o.toString());
	}

}
