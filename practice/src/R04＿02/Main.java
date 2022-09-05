package R04＿02;

public class Main {

	public static void main (String[]args) {
		double[] height = new double[] {150.5, 168.2, 183.8, 172.0};
		for(double height1 : height) {
			System.out.println(height1);
		}
		// 上記の拡張for文をfor文に書き換えて同じ結果を出しなさい。変数名は自由に決めてよい。
	
		double[] heights = new double[] {150.5, 168.2, 183.8, 172.0};
		for(int i = 0; i < heights.length; i++) {
			System.out.println(heights[i]);
		}
	}
}
