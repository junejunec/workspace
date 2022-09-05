package R03_04;

public class Main {

	public static void main(String[] args) {
		// 以下の処理を作りなさい。
		// ランダムで1～10までの数値を表示する。
		// その出たランダムの数値を変数sum加算し、これを10回くりかえす。
		// 変数avgに10回繰り返して加算していったランダムの数値の平均値を代入する。
		// 平均の算出方法は 合計 / 加算した回数
		// 最後に「平均値は(平均)です」と表示させる。(平均)には変数avgの値を表示
		int sum = 0;
		int avg = 0;
		for(int i = 0; i < 10; i++) {
			int rnd = new java.util.Random().nextInt(10);
			System.out.println(rnd);
			sum = sum + rnd;
		}
		avg = sum / 10;
		System.out.println("平均は：" + avg);
	}

}