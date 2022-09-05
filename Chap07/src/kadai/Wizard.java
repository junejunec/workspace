package kadai;

public class Wizard extends Character {

	public Wizard(String name) {
		super(name);

	}
	public void Heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した");

	}

	public Wizard() {
	}

	@Override
	public void attack(Monster m) {
	}

	@Override
	public void run() {
	}

}
