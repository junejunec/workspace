package kadai.kadai;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("ミナト",100,20);
		Cleric cl = new Cleric("アサカ",90,50);
		Wizard wi = new Wizard("スガワラ",80,100);

		Matango m1 = new Matango(40,10,'A');
		Matango m2 = new Matango(50,10,'B');
		Goblin g1 = new Goblin(80,10,'A');
		Goblin g2 = new Goblin(90,10,'B');
		Slime s1 = new Slime(30,10,'A');
		Slime s2 = new Slime(20,10,'B');

		h1.attack(m1);//この部分を条件付けして使ってもよい
		cl.attack(m2);//ランダムでこれらの動作を選ぶようにさせることも可能
		wi.attack(g1);//拡張可能

		m1.attack(h1);//ぱーてぃ用の配列を選んで動かすことも可能
		m2.attack(cl);//（素早さをあげる、など）

		g1.attack(wi);
		g2.attack(h1);

		s1.attack(cl);
		s2.attack(wi);

		h1.attack(s1);
		wi.fireball(s2);
		cl.Heal(h1);

		m1.run();
		m2.poizonAttack(wi);

		g1.attack(cl);
		g2.run();

		s1.attack(h1);

		h1.attack(m2);
		wi.fireball(m2);
		cl.Heal(wi);

		m2.poizonAttack(h1);

		g1.attack(wi);

		s1.run();

		h1.attack(m2);
		wi.fireball(m2);
		cl.Heal(h1);

		h1.run();
		wi.run();
		cl.run();

	}

}
