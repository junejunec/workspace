package R03_02;

public class Main {

	public static void main(String[] args) {
		// 次の条件に従ってプログラムを記述しなさい
		// switch文で記述可能な場合はswitch文で記述しなさい
		// ①画面に「今年の干支を入力してください」と表示する。
		// ②文字列を入力し、変数zodiacに代入する（2.6.6.項参照）
		// ③もし変数zodiacの値が寅と等しかったら「アタリ！」と画面に表示する。
		// ④もし変数zodiacの値が丑と等しかったら「残念、それは去年です。」と画面に表示する。
		// ⑤もし変数zodiacの値が卯と等しかったら「残念、それは来年です。」と画面に表示する。
		// ⑥変数zodiacが③～⑤のいずれでもない場合は「残念、正解は"寅"年でした！」と画面に表示する。
		System.out.println("今年の干支を入れてください");
		String zodiac = new java.util.Scanner(System.in).nextLine();
		switch(zodiac) {
		case "寅":
			System.out.println("アタリ");
			break;
		case"丑":
			System.out.println("去年です");
			break;
		case"卯":
			System.out.println("来年です");
			break;
		default:
			System.out.println("残念、正解は\"寅\"年でした！");
			break;
		}
	}

}