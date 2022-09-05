package R08_01;

public class Cleric {

	String name;
	int hp;
	final int HP_MAX = 50;
	int mp;
	final int MP_MAX = 10;
	
	public void selfAid() {
		System.out.println("セルフエイド");
		this.hp = HP_MAX;
		this.mp -= 5;
		System.out.println("HP=" + hp);
	}
	public int pray(int sec) {	
		int pmp = sec + new java.util.Random().nextInt(3);
		if(MP_MAX <= this.mp + pmp) {
			pmp = MP_MAX - this.mp;//最大MPが超えた場合。最大になるまで引く
		}
		this.mp += pmp;
		System.out.println(sec + "秒祈ったら、" + pmp + "MPポイント回復した");
		return pmp;
	}

}

