package R03_05;

public class Main {

	public static void main(String[] args) {
		// 以下のwhile文は何回繰り返しの処理を行うか答えなさい。
		int count = 20;
		while(count > 0) {
			System.out.println(count);
			count-=3;
		}

		// 続いて以下のdo-while文は何回繰り返しの処理を行うか答えなさい。
		// なおこの処理は上記の処理の続きである。
		do{
			System.out.println(count);
			count+=3;
		}while(count < 20);
	}

}