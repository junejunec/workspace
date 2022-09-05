package code11_17;

public class Fool extends Character implements Human {
	public void attack(Matango m) {
		System.out.println(this.name + "は戦わず遊んでいる");
	}
	@Override
	public void run() {
	}

	@Override
	public void talk() {
	}

	@Override
	public void watch() {
	}

	@Override
	public void hear() {

	}//1つでも実装されてなければabstract宣言をする
	//public abstract void run(){  }
	//CharacterとHumanのパッケージからメソッドを持ってくるので
	//例えばrunがranになってたりするとコンパイルエラーが発生する

}
