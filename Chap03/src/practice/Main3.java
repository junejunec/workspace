package practice;

public class Main3 {

	public static void main(String[] args) {
		boolean tenki = false;
		if(tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		} else {
			System.out.println("DVDを見ます");
			System.out.println("寝ます");
			/*elseのあとの波括弧が抜けていたためエラー表示になった*/
		}//DVDを見ますしか表示されなくなる

	}


}
