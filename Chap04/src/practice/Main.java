package practice;

public class Main {

	public static void main(String[] args) {
	int[] points = new int[4];
	double[] weights = new double[5];
	boolean[] answers = new boolean[3];
	String[] names = new String[3];


	int[] moneyList = {121902, 8302, 55100};
	for(int i=0; i < moneyList.length; i++) {//int i = 0
		System.out.println(moneyList[i]);//for(int money:moneyList){
		for(int value:moneyList) {//i++;
			System.out.println(value);//sysout("拡張for構文の口座残高" i + ":" + money);
		}
	}
	int[] numbers = new int[] {3, 4, 9};
	System.out.println("1桁の数字を入力してください");
	int input = new java.util.Scanner(System.in).nextInt();
	for(int number : numbers) {
		if(input == number) {
			System.out.println("アタリ！");
		}
	}


	}

}