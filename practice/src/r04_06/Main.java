package r04_06;

public class Main {

	public static void main(String[] args) {
		int[][] scores1 = new int[2][5];
		//アドレス①→"④"「0」/⑤→"⑥"「1」/
		int[][] scores2;
		//アドレス②→"④"/⑥「1」
		int[] scores3;
		//アドレス③→"⑤"
		int[] score1 = {40,50,60,70,80};
		//④
		int[] score2 = {90,80,40,20,60};
		//⑤
		int[] score3 = {60,65,50};
		//⑥
		scores1[0] = score1;
		scores1[1] = score2;
		scores2 = scores1;
		scores3 = scores1[1];
		scores2[1] = score3;
		// scores1[1]の要素数はいくつになるか答えなさい
		System.out.println(scores1[1].length);
		// scores3の要素数はいくつになるか答えなさい
		System.out.println(scores3.length);
	}

}
