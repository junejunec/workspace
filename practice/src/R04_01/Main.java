package R04_01;

public class Main {

	public static void main(String[] args) {
		// 以下の各配列の全要素数を述べよ
		int[] scores1 = new int[10];
		int[] scores2 = {0,1,2,3};
		int[][] scores3 = new int[2][6];
		int[][] scores4 = {{1,2,3},{1,2,3,4}};

		// 以下の配列の出力結果を述べよ。エラーが出る場合はその理由を述べよ。
		System.out.println(scores1[2]);
		System.out.println(scores2[2]);
		System.out.println(scores3[0][5]);
		System.out.println(scores3[1][5]);
		System.out.println(scores4[0][3]);
		System.out.println(scores4[1][3]);
	}

}