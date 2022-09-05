package kadai.kadai;

public class Cleric extends Character {

	public Cleric() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Cleric(String name, int hp, int mp) {
		super(name, hp, mp);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void attack(Monster m) {//修正の余地あり（攻撃システム
		if(this.getHp() <= 0) {
			System.out.println(this.getName() + "は動けない");
			return;
		}
		if(m.getHp() > 0) {
			System.out.println(this.getName() + "の攻撃");
			System.out.println(m.getName() + "に" + "5ダメージ");
			m.setHp(m.getHp()-5);
			if(m.getHp() <= 0) {
				System.out.println(m.getName() + "を倒した！");
			}
		}else {
			System.out.println(m.getName()+"はすでに倒している");
		}
	}

	@Override
	public void run() {
		System.out.println("聖職者"+this.getName()+"は逃げ出した");
		System.out.println("聖職者"+this.getName());
		System.out.println("HP:"+this.getHp());
		System.out.println("MP:"+this.getMp());
	}

	public void Heal(Character c) {//聖職者特有
		if(this.getHp() <= 0) {
			System.out.println(this.getName() + "は動けない");
			return;
		}

		int mp = this.getMp();
		if( mp >= 0 ) {
			System.out.println(this.getName() + "はヒールを唱えた");
			System.out.println(c.getName() + "はHPが20回復した");
			c.setHp(c.getHp()+20);
			this.setMp(mp-10);
		}else {
			System.out.println("MPが足りません");
		}
	}

}
