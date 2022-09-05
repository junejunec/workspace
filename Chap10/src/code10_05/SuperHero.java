package code10_05;

public class SuperHero extends Hero{ //Heroクラスを継承
	/*String name= "アサカ";*/
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した");
	}
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた");
		super.attack(m);
		if(this.flying) {
			super.attack(m);
			System.out.println(this.name + "の攻撃");
			m.hp -= 5;
			System.out.println("5ポイントのダメージを与えた");
		}
	}

	public void run() {
		System.out.println(this.name + "は撤退した");
	}
}
