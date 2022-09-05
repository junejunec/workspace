package code12_09;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name= "ミナト";
//
		Monster[] mo = new Monster[3];
		mo[0] = new Matango();
		mo[1] = new Goblin();
		mo[2] = new Slime();

		for(Monster m : mo) {
			h.attack(m);
		}

		System.out.println();

		for(Monster m : mo) {//これは追加
			m.run();
		}


		System.out.println();
//↑↓同じ結果になる


		Matango m = new Matango();
		Goblin g = new Goblin();
		Slime s = new Slime();

		Monster mo1 =m;
		Monster mo2 =g;
		Monster mo3 =s;
		h.attack(m);
		h.attack(g);
		h.attack(s);
	}

//クラスを切り替えるだけで自動的に表示される

}
