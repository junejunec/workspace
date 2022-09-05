package R08_04;

import R08_01.Cleric;

public class Main {

	public static void main(String[] args) {
		Cleric c = new Cleric();
		c.hp -= 5;
		c.pray(6);
		
		c.selfAid();
		c.selfAid();
		c.selfAid();
		c.pray(20);
		
		
	}

}
