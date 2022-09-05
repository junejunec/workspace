package code03_04;

class Main {

	public static void main(String[] args) {
		String initial = "雅";
		if("雅".equals(initial)){

		}
	 System.out.println("あなたの運勢を占います");
	 int fortune = new java.util.Random().nextInt(4) + 1;
	 if (fortune == 1) {
		System.out.println("大吉");
	 } else if (fortune == 2) {
		System.out.println("中吉");
	 } else if (fortune == 3) {
		System.out.println("吉");
	 } else {
		 System.out.println("凶");
//switch構文に書き換えられる
	 }

	}

}
