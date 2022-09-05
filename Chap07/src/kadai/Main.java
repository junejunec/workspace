package kadai;

public class Main {



	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp -= 10;
		System.out.println("ミナトのHPは" + h.hp + "です");
		h.hp = 100;
		h.mp = 50;

		Matango m = new Matango();
		m.hp = 50;
		m.mp = 10;

		Wizard w = new Wizard();
		w.name ="モモンガ";
		w.hp = 80;
		w.mp = 200;

		w.Heal(h);

		Matango m1 = new Matango(40, 10, 'A');
		Matango m2 = new Matango(50,10,'B');






	}

}
