package kadai;

public class Matango extends Monster {

	public Matango(String name) {
		super(name);
		this.name = "お化けキノコ";

	}

	public Matango() {
	}

	@Override
	public void attack(Character c) {
		System.out.println(this.name + "の攻撃");
		System.out.println(c.name + "に１０ポイントのダメージを与えた");
		c.hp -= 10;
	}

	@Override
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}

}
