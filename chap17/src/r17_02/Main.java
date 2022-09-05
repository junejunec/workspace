package r17_02;

public class Main {

	public static void main(String[] args) {
		try{
			String s = null;
			System.out.println(s.length());

		}catch(NullPointerException e) {
			System.err.println("NullPointerException 例外を catch しました");
			System.err.println("--スタックトレース（ここから）--");
			e.printStackTrace();
			System.err.println("--スタックトレース（ここまで）--");

		}

	}

}
