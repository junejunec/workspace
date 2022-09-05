package practice;

public class Main5 {

	public static void main(String[] args) {
		System.out.println("【数あてゲーム】");
		int ans = new java.util.Random().nextInt(9);
		for (int i = 1 ; i < 5; i++) {//五回繰り返す
			System.out.println("０～９の数字を入力してください");
			int num =new java.util.Scanner(System.in).nextInt();
			if( num == ans) {
				System.out.println("アタリ！");
			break;

			}else {
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを終了します");
	}

}
