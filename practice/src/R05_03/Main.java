package R05_03;

public class Main {
	public static void add(short x, short y) {
		System.out.println(x + y);
	}
	// 以下のaddメソッドの中で上記のaddメソッドに対してオーバーロード出来ないメソッドはどれか？
	// ①
	public static int add(int x, int y) {
		return x + y;
	}
	// ②
	public static double add(double x, double y) {
		return x + y;
	}
	// ③
	public static void add(float x, float y) {
		System.out.println(x + y);
	}
	// ④
	public static int add(short x, int y) {
		return x + y;
	}
	// ⑤
	public static int add(short xx, short yy) {
		return xx + yy;
	}

}
