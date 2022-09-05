package kadai;

public class Hero extends Character {
		int hp = 100;

	public Hero(String name) {
		super(name);
		this.name = "ミナト";

	}

	public Hero() {
	}

	@Override
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃");
		System.out.println(m.name + "に１０ポイントのダメージを与えた");
		m.hp -= 10;

	}

	@Override
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}

}
