	package kadai.kadai;

public abstract class Character {//抽象化→インスタンス化しないように
	private String name;	// 名前
	private final int MAX_HP;			// 最大HP//定数
	private int hp;			// HP
	private final int MAX_MP;			// 最大MP
	private int mp;			// MP　//属性をカプセル化

	public Character() {
		this("ななし",100,20);
	}
	public Character(String name,int hp , int mp) {
		this.setName(name);
		this.MAX_HP = hp;
		this.setHp(hp);
		this.MAX_MP = mp;
		this.setMp(mp);
	}

	public abstract void attack(Monster m);//どんな敵でも攻撃できるようにしている
	public abstract void run();//継承先でオーバーライドする
	public String getName() {//外部からアクセスできなくなっているのでgetter,setterで定義
		return name;
	}
	public void setName(String name) {//setterは代入
		this.name = name;
	}
	public int getHp() {//getterは値の書き換え
		return hp;
	}
	public void setHp(int hp) {
		if(this.MAX_HP < hp) {
			hp = this.MAX_HP;//最小値の処理を入れてもいいかも
		}
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		if(this.MAX_MP < mp) {
			mp = this.MAX_MP;
		}
		this.mp = mp;
	}

}
