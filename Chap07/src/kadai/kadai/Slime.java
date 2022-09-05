package kadai.kadai;

public class Slime extends Monster {

	public Slime() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Slime(int hp, int mp, char zodiac) {
		super("スライム", hp, mp, zodiac);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void attack(Character c) {
		if(this.getHp() <= 0) {
			System.out.println(this.getName()+"は動かない");
			return;
		}
		System.out.println(this.getName()+"の攻撃！");
		if(c.getHp() > 0) {
			System.out.println(c.getName() + "は4のダメージ");
			c.setHp(getHp()-4);
			if(c.getHp() <= 0) {
				System.out.println(c.getName()+"は倒れて動かなくなった");
			}
		}else {
			System.out.println(c.getName() + "はすでに倒されていた");
		}
	}

	@Override
	public void run() {
		System.out.println(this.getName()+"はうねうねと逃げ出した");
	}

}
