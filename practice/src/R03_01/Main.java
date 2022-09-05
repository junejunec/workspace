package R03_01;

public class Main {

	public static void main(String[] args) {
		// 映画料金を決める分岐の構文を書きなさい。
		// 年齢（変数 age）を条件に映画料金(変数 price)を設定する。
		// 判定は最適な形で記述せよ。（条件が重複しないようにする）
		// 以下が判定条件および料金設定
		// 条件　子供料金(1000円)　13歳未満
		// 条件　学生料金(1200円)　13才以上18歳未満
		// 条件　一般料金(1900円)　18才以上65歳未満
		// 条件　シニア料金(1400円)　65歳以上
		// switch文で記述可能な場合はswitch文で記述すること
		int age = 18;
		int price;
		if(age < 13) {
			price = 1000;
		}else if (age < 18) {
			price = 1200;
		}else if (age < 65) {
			price = 1900;
		}else {
			price = 1400;
		
		}


		// 出力は以下の表示とする
		System.out.println(age+"歳のお客様の料金は"+price+"円です");
	}
}