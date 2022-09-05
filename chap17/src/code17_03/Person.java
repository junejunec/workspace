package code17_03;

public class Person {
	private int age;
	public void setAge(int age) {
		if(age < 0) {
			throw new IllegalArgumentException//thorws IOException    →だとスロー宣言してtry catchの義務が生まれる
			("年齢は０以上の数を指定すべきです。指定値＝" + age);//例外作成
		}
		this.age = age;
	}

}
