package R01_01;


//以下のコードを実行するとコンソールにどのような結果が出るか
//もしくは実行できずエラーが発生するか答えなさい。
public class Main {

	public static void main(String[] args) {
		byte a = (int)(10 + 20L + 5.2 + 8.9F);
		int m = Math.max(Integer.parseInt("0150"), a);
		System.out.println(m);

	}

}

}
