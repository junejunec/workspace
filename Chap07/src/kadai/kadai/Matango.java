package kadai.kadai;

public class Matango extends Monster {//抽象クラスMonsterを継承
	int poizon = 10;

	public Matango() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Matango(int hp, int mp, char zodiac) {
		super("お化けキノコ", hp, mp, zodiac);
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
			System.out.println(c.getName() + "は5のダメージ");
			c.setHp(getHp()-5);
		}else {
			System.out.println(c.getName() + "はすでに倒されていた");
		}
	}

	@Override
	public void run() {
		System.out.println(this.getName()+"は胞子を振りまきながら逃げ出した");
	}

	public void poizonAttack(Character c) {
		if(this.getHp() <= 0) {
			System.out.println(this.getName()+"は倒れたまま動かない");
			return;
		}
		this.attack(c);//追加攻撃
		if(this.poizon > 0) {
			System.out.println(this.getName() + "はさらに毒の胞子を振りまいた");
			int hp = c.getHp();
			int damage = hp / 5;
			System.out.println(c.getName() + "は" + damage + "のダメージ");
			this.poizon --;
		}
	}

}
