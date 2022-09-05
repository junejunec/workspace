package code12_02;

public class Main {

	public static void main(String[] args) {
		Wizard w = new Wizard();
		Matango m = new Matango();
		w.name = "アサカ";
		w.attack(m);
		w.fireball(m);

		Character c = w;
		c.name = "ミナト";
		c.attack(m);
		c.fireball(m);//エラー。Characterにfireballはないウィザードのは引き継げない

	}

}
