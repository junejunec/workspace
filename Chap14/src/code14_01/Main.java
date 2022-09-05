package code14_01;

public class Main {

	public static void main(String[] args) {
		/*Empty*/Object e = new Empty();
		Object o= new Object();
		Object s = e.toString();
		Object o1 ="こんにちは";
		Object o2 = 100;

		System.out.println(s);
		System.out.println(o2);
		printAnything(o2);

	}//Java.lang.Objectがすべてのクラスの親

	public static void printAnything(Object o) {
		System.out.println(o.toString());
	}

}
