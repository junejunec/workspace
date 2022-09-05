package code14_09;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.hp -= 50;
		Hero h2 = new Hero();
		Hero.money -= 1000;//インスタンスがなくても記述可能
		h1.money += 100;
		System.out.println("HP:" + h1.hp);
		System.out.println("HP:" + h2.hp);
		System.out.println("所持金：" + Hero.money);
		System.out.println(h1.money);
		System.out.println(h2.money);
		h1.money = 300;
		System.out.println(Hero.money);
		System.out.println(h1.money);
		System.out.println(h2.money);
	}

}
