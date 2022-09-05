package code12_05;

public class Main {

	public static void main(String[] args) {
		Slime s = new Slime();
		Monster m = new Slime();
		s.run();
		m.run();

//キャスト演算子について
//型変換できるか確認//true時処理を実行
		if(m instanceof Slime) {//実行
			s = (Slime)m;
			s.run();
		}
		m = new Monster();
		if(m instanceof Slime) {//実行されない
			s = (Slime)m;
			s.run();

		}

		//Wizard w = (Wizard)m;//エラー　

	}




}
