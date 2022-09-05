package code12_09;

public abstract class Monster {
	int hp;
	String name;
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
}
