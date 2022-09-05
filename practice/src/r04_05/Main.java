package r04_05;

public class Main {

	public static void main(String[] args) {
		String[] names = new String[2];
		String name1 = "佐藤　栄作";
		String name2 = "鈴木　一郎";
		String name3 = "与謝野　晶子";
		names[0] = name1;
		names[1] = name2;
		// それぞれの要素数がいくつになるか答えなさい。
		System.out.println(names[0].length());
		System.out.println(names[1].length());
		names[1] = name3;
		System.out.println(names[1].length());
	}

}