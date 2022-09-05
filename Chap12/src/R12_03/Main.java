package R12_03;


public class Main {

	public static void main(String[] args) {
		Y[] y = new Y[2];
		y[0] = new A();
		y[1] = new B();

		for(Y i:y) {
			i.b();
		}
		for(int i = 0; i < y.length; i++) {
			y[i].b();
		}
	}


}

//Y[]
