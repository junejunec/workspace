package code15_09;

public class Hero {
	private String name;
	private String job;
	private int gold;

	public Hero() {
		this("名無し","無職",0);

	}

	public Hero(String name,String job, int gold) {
		this.name = name;
		this.job  = job;
		this.gold = gold;
	}

	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}
	public int getGold() {
		return gold;
	}


}
