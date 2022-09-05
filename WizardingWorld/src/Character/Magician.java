package Character;

public abstract class Magician  {
	String name;
	int hp;
	int mp;


	public Magician() {
		this("魔法使い", 100, 200);
	}

	public Magician(String name, int hp, int mp) {
		this.setName(name);
		this.setHp(hp);
		this,setMp(mp);

	}
	public abstract void useSpell();
	public abstract void

}
