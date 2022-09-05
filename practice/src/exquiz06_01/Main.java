package exquiz06_01;
import R06_01.Logic
public class Main {

	public static void main(String[] args) {
		// 以下のメソッドの呼び出しを
		// exquiz06_01パッケージのLogicクラスのメソッドから
		// 呼び出すように修正しなさい
		double x1 = add(120,200);
		String x2 = exquiz06_01.Logic.add("文字列1","文字列2");
		int x3 = R06_01.Logic.add(120, 240);
		//この３つのメソッドを呼び出した後
		//importを使って省略機能を使うとどうなるか、なぜそうなるのか
	}
//オーバーロードは適用されない。別のパッケージクラスなので
}