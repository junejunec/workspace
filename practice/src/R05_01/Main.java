package R05_01;

public class Main {

	// ①
	public static void printArray(String[] arrays) {
		for(String array:arrays) {
			System.out.println(array);
		}
	}

	// ②
	public static int add(int x, int y) {
		return x + y;
	}

	// ③
	public static double mul(double x, double y) {
		return x * y;
	}

	// ④
	public static double div(int x, int y) {//double型にしてから計算を行う
		return (double)x / y;
	}

	// ⑤
	public static char[] makeArray() {
		return makeArray(1);
	}

	// ⑥
	public static char[] makeArray(int size) {
		return new char[size];
	}
	
	public static void main(String[] args) {
		// 上記のメソッドを呼び出すコードを記述しなさい。引数の値は自由に決めて構いませんが型に会った記述をすること。
		// 戻り値がある場合は変数を宣言しそれに戻り値を代入すること。こちらの変数名も自由に決めて構いません。
		// ①
		String[] name = {"miru","momonga"};
		printArray(name);

		// ②
		int a = add(1, 2);
		

		// ③
		double b = mul(2.0, 3.0);

		// ④
		double c = div(3, 4);

		// ⑤
		char[] d = makeArray();

		// ⑥
		char[] e =makeArray(10);//10の要素を持ったchar型の配列
		
		

	}

}

