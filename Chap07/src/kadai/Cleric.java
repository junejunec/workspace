package kadai;

public class Cleric extends Character  {

	public Cleric(String name) {
		super(name);
		this.name = "ヤマダ";

	}

	public Cleric() {
	}

	@Override
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃");
		System.out.println(m.name + "に3ポイントのダメージを与えた");
		m.hp -= 3;

	}

	@Override
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}

}
