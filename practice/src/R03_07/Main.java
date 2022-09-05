package R03_07;

public class Main {

	public static void main(String[] args) {
		// 以下のwhile文終了後 変数countの値がいくつになっているか答えなさい。
		int count = 20;
		while(count > 0) {
			count-=3;
			if(count < 6) {
				continue;
			}
			System.out.println(count);
		}
		System.out.println(count);

		// 続いて以下のwhile文終了後 変数countの値がいくつになっているか答えなさい。
		count = 20;
		while(count > 0) {
			count-=3;
			if(count < 6) {
				break;
			}
			System.out.println(count);
		}
		System.out.println(count);

	}

}
