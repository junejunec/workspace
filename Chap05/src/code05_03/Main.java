package code05_03;

public class Main {

	public static void methodA() {
		System.out.println("methodA");//methodA \n methodB
		methodB();

	}
	public static void methodB() {
		System.out.println("methodB");//methodB

	}
	public static void main(String[] args) {
		methodA();//methodA \n methodB
	}

}
