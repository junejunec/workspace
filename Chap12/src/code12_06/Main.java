package code12_06;

import code12_01.Wizard;

public class Main {

	public static void main(String[] args) {
	Hero h1 = new Hero();
	Hero h2 = new Hero();
	Thief t1 = new Thief();
	Wizard w1 = new Wizard();
	Wizard w2 = new Wizard();


	h1.hp += 50;
	System.out.println(h1.hp);
	h2.hp += 50;
	System.out.println(h1.hp);
	t1.hp += 50;
	System.out.println(h1.hp);
	w1.hp += 50;
	System.out.println(h1.hp);
	w2.hp += 50;
	System.out.println(h1.hp);
	}

}
