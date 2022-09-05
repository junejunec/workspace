package code03_08;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			System.out.print("現在" + (i + 1) + "周目'(→");
		}
		System.out.println("\n");
		for (int i = 0; i <= 2; i++) {
			System.out.print("現在" + (i + 1) + "周目→");
		}

		//ループ変数を１からスタート
		for(int i =1; i < 10; i += 2) {
		}

		//ループ変数を２ずつ増やす
		for(int i = 0; i < 10; i += 2) {
		}

		//ループ変数を10から1ずつ１まで減らしていく
		for (int i = 10; i > 0; i--) {
		}

		//ループ変数を初期化しない
		int i = 0 ;
		for(; i < 10; i++) {

		//繰り返しの時処理を行わない
		for(int i = 0; i < 10;) {
		}
	}

}
