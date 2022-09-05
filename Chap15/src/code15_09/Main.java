package code15_09;

class Main {

	public static void main(String[] args) {
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		Hero hero = new Hero("minato","Hero",100);//全角にするとずれるので注意
		Hero witch =new Hero("asaka", "Witch", 1000);//文字数注意

		String s = String.format(FORMAT, hero.getName(),hero.getJob(),hero.getGold());
		System.out.println(s);
		System.out.printf(FORMAT, hero.getName(),hero.getJob(),hero.getGold());
		s = String.format(FORMAT, witch.getName(),witch.getJob(),witch.getGold());

		System.out.println(s);
		
	}

}
