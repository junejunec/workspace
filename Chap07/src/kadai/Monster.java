package kadai;

public abstract class Monster {
	String name;
	int hp;
	int mp;

	public Monster(String name) {
		this.name = name;
		this.hp = 80;
		this.mp = 50;


	}
	public Monster() {

	}
	public abstract void attack(Character c);
	public abstract void run();
}