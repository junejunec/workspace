package R03_03;

public class Main {

	public static void main(String[] args) {
		// 次の条件に従ってプログラムを記述しなさい
		// switch文で記述可能な場合はswitch文で記述しなさい
		// ①もし変数maleの値がtrueかつ変数femaleの値がfalseだった場合「男性」と表示する。
		// ②もし変数maleの値がfalseかつ変数femaleの値がtrueだった場合「女性」と表示する。
		// ③もし変数maleの値がfalseかつ変数femaleの値がfalseだった場合「maleかfemaleをtrueにしてください」と画面に表示する。
		// ③もし変数maleの値がtureかつ変数femaleの値がtrueだった場合「maleかfemaleをfalseにしてください」と画面に表示する。
		boolean male = true;
		boolean female = true;
		if(male == true && female == false) {
			System.out.println("男性");
		}else if(male == false && female == true) {
			System.out.println("女性");
		}else if(male == false && female == false) {
			System.out.println("maleかfemaleをtrueにしてください");
		}else {
			System.out.println("maleかfemaleをtrueにしてください");
		}
	}

}
