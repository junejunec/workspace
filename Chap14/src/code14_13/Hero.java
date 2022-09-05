package code14_13;

public class Hero {
	private String name;
	private int hp = 100;

	static int money;//静的フィールド

	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 1000);
		//System.out.println(this.name + "たちの所持金を初期化しました");
		//存在しないものを呼び出してしまうことになりえるからthisは使えない
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

