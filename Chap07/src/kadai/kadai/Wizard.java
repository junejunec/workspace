package kadai.kadai;

public class Wizard extends Character {

	public Wizard() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Wizard(String name, int hp, int mp) {
		super(name, hp, mp);
	}

	@Override
	public void attack(Monster m) {
		if(this.getHp() <= 0) {
			System.out.println(this.getName() + "は動けない");
			return;
		}
		if(m.getHp() > 0) {
			System.out.println(this.getName() + "の攻撃");
			System.out.println(m.getName() + "に" + "2ダメージ");
			m.setHp(m.getHp()-2);
			if(m.getHp() <= 0) {
				System.out.println(m.getName() + "を倒した！");
			}
		}else {
			System.out.println(m.getName()+"はすでに倒している");
		}
	}

	@Override
	public void run() {
		System.out.println("魔法使い"+this.getName()+"は逃げ出した");
		System.out.println("魔法使い"+this.getName());
		System.out.println("HP:"+this.getHp());
		System.out.println("MP:"+this.getMp());
	}

	public void fireball(Monster m) {
		if(this.getHp() <= 0) {
			System.out.println(this.getName() + "は動けない");
			return;
		}
		if(m.getHp() > 0) {
			int mp = this.getMp();
			if(mp >= 10) {
				System.out.println(this.getName() + "はファイアボールを飛ばした！");
				System.out.println(m.getName() + "に" + "20ダメージ");
				m.setHp(m.getHp()-20);
				if(m.getHp() <= 0) {
					System.out.println(m.getName() + "を倒した！");
				}
				this.setMp(mp-10);
			}else {
				System.out.println("MPが足りない");
			}
		}else {
			System.out.println(m.getName()+"はすでに倒している");
		}
	}

}
