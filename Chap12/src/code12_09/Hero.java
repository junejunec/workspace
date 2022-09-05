package code12_09;

public class Hero extends Character {

	@Override
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃");
		System.out.println(m.name + "に１０ポイントのダメージを与えた");
		m.hp -= 10;
	}

}
