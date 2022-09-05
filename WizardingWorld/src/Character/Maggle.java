package Character;

public abstract class Maggle {
	private String name;
	private int HP;
	private final int MIN_HP;

	public Maggle() {
		this("マグル", 50);

	}
	public Maggle(String name, int hp) {
		this.setName(name);
		this.MIN_HP = 0;
		this.setHp(hp);

	}
	//public  void run() {
		//System.out.println(this.name + "は逃げまどっている");
	//}

	public abstract void complain();
	public abstract void surprise();
	public abstract void run();


}
