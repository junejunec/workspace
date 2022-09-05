package code10_03;

public class SuperHero extends Hero{ //Heroクラスを継承
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した");
	}
//	Matango m = new Matango() ;
//	String s = m.toString();

}
