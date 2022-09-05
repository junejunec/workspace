package kadai.kadai;//敵側のクラス

public abstract class Monster {
	private String name;		// 種族名
	private int hp;				// HP//回復する操作を持つなら上限も必要
	private int mp;				// MP

	public Monster() {
		this("正体不明",100,20,' ');
	}
	public Monster(String name,int hp ,int mp,char zodiac) {
		if(zodiac != ' ') {
			this.name = name + zodiac;
		}else {
			this.name = name;
		}
		this.hp = hp;
		this.mp = mp;
	}
	public abstract void attack(Character c);
	public abstract void run();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}

}
