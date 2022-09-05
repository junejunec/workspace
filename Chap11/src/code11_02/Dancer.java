package code11_02;

public /*abstract*/ class Dancer extends Character {
	public void dance() {
		System.out.println(this.name + "は情熱的に踊った");
	}
	public void attack(Matango m) { //これを追加
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に３ポイントのダメージ");
		m.hp -= 3;
	}
}

//抽象メソッドを書くことでオーバーライド忘れを防ぐ
//
