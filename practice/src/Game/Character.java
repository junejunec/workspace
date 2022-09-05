package Game;

public abstract class Character {
	String name;
	int hp;
	int mp;

	public abstract void attack(Monster m) {
	}

}
