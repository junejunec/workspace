package code11_02;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		Matango m = new Matango('A');
		h.attack(m);
		h.run();
		//Character c = new Character(); →abstractがクラスとして宣言されているとエラーになる
		Dancer d = new Dancer();
		d.name = "ダンサー";
		d.attack(m);
	}

}
//継承はnewとして使えないが、意図せずnewとして利用されてしまう可能性がある。
//newはキャラ生成すること。
//キャラを作る金型を登場人物として登場させることはオブジェクト指向から外れる
//抽象クラスを使うことで間違って宣言されることがない

