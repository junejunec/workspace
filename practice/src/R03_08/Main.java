package R03_08;

public class Main {

	public static void main(String[] args) {
		// 以下の処理の中で実行できるもの、できないものをそれぞれ述べなさい。
		// まだできない場合はどこに問題があるか述べなさい。
		// ①
		int i;
		for(int i = 0;i < 10; i++) {
			System.out.println(i);
		}

		// ②
		{
		int a;
		}
		for(int a = 0;a < 10; a++) {
			System.out.println(a);
		}

		// ③
		int b = 0;
		for(;b < 10; b++) {
			System.out.println(b);
		}

		// ④
		{
		int c = 0;
		}
		for(;c < 10; c++) {
			System.out.println(c);
		}

	}

}

