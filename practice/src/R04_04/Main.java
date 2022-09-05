package R04_04;

public class Main {

	public static void main(String[] args) {
		int[][] scores = new int[2][5];
		int[] score1 = {40,50,60,70,80};
		int[] score2 = {90,80,40,20,60};
		int[] score3 = {60,65,50};
		scores[0] = score1;
		scores[1] = score2;
		// それぞれの要素数がいくつになるか答えなさい。
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		scores[1] = score3;
		System.out.println(scores[1].length);

	}

}

