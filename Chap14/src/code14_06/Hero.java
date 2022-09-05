package code14_06;

public class Hero {
	String name = "ミナト";
	int hp = 100;
	//戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた");
	}
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	public String toString() {//画面にずっと表示させることができる
		return "名前:" +this.name + " /HP:" + this.hp;
	}
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof Hero) {
			Hero h = (Hero)o;
			if (this.name.equals(h.name)) {//名前が同じか
				if(this.hp == h.hp) {//HPも同じか
				return true;
				}
			}

		}
		return false;
	}
}
