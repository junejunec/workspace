package R03_06;

public class Main {

	public static void main(String[] args) {
		// 以下のwhile文終了後 変数countの値がいくつになっているか答えなさい。
		int count = 20;
		while(count < 20) {
			System.out.println(count);
			count-=3;
		}

		// 続いて以下のdo-while文終了後 変数countの値がいくつになっているか答えなさい。
		count = 20;
		do{
			System.out.println(count);
			count+=3;
		}while(count < 20);

	}

}
