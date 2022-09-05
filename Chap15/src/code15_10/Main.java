package code15_10;

public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		StringBuilder sb =new StringBuilder();
		System.out.println("StringBuilder処理開始");
		for(int i = 0; i < 30000; i++) {
			sb.append("Java");
		}
		String s = sb.toString();
		System.out.println("StringBuilder処理終了");
		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は、、" + (end - start) + "ミリ秒でした");

		start = System.currentTimeMillis();

		System.out.println("+演算処理開始");
		s = "Java";
		for(int i = 0; i < 30000; i++) {
			s += "Java";
		}
		System.out.println("StringBuilder処理終了");
		end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は、、" + (end - start) + "ミリ秒でした");

	}


}
