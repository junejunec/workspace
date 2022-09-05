package r09_01;

public class Thief {
	String name;
	int hp;
	int mp;

	public Thief(String name, int hp, int mp) {
		this("アサカ", 40, 5);
	}
	public Thief(String name, int hp) {
		this.name = "アサカ";
		this.hp = 35;
	}
	public Thief(String name) {
		this.name = "アサカ";
	}
	public Thief() {

	}
}
