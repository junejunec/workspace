package code03_02;

public class Main {

	public static void main(String[] args) {
		boolean doorClose = false;//tureにすると無限ループ
		while (doorClose == true) {
			System.out.println("ノックする");
			System.out.println("１分待つ");
		}
	}

}
