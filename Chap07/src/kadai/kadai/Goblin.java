package kadai.kadai;

public class Goblin extends Monster {

	public Goblin() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Goblin(int hp, int mp, char zodiac) {
		super("ゴブリン", hp, mp, zodiac);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void attack(Character c) {
		if(this.getHp() <= 0) {
			System.out.println(this.getName()+"は倒れたまま動かない");
			return;
		}
		System.out.println(this.getName()+"の攻撃！");
		if(c.getHp() > 0) {
			System.out.println(c.getName() + "は10のダメージ");
			c.setHp(getHp()-10);
			if(c.getHp() <= 0) {
				System.out.println(c.getName()+"は倒れて動かなくなった");
			}
		}else {
			System.out.println(c.getName() + "はすでに倒されていた");
		}
	}

	@Override
	public void run() {
		System.out.println(this.getName()+"は大きく腕を振って逃げ出した");
	}

	public void doubleAttack(Character c) {//特殊攻撃
		if(this.getHp() <= 0) {
			System.out.println(this.getName()+"は倒れたまま動かない");
			return;
		}
		System.out.println(this.getName()+"の二連続攻撃！");
		this.attack(c);
		this.attack(c);
	}

}
