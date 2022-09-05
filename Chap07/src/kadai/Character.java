package kadai;

public abstract class Character {
	private String name;
	private int hp;
	private int mp;

	public Character(String name) {
		this.name = name;
		this.hp = 100;
		this.mp = 50;
	}

	public Character() {

	}

	public abstract void attack(Monster m);
	public abstract void run();
}
