package r17_03;

public class Main {
//NumberFormatException
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("三");

		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException 例外を catch しました");
			e.printStackTrace();
		}
	}



}
