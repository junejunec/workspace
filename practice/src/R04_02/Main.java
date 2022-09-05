package R04_02;

public class Main {

	public static void main(String[] args) {
		double[] heights = new double[] {150.5, 168.2, 183.8, 172.0};
		for(int i = 0;i < heights.length;i++) {
			System.out.println(heights[i]);
		}
		// 上記のfor文を拡張for文に書き換えて同じ結果を出しなさい。変数名は自由に決めてよい。

		double[] height = new double[] {150.5, 168.2, 183.8, 172.0};
		for(double height1 : height) {
			System.out.println(height1);
		}
			
		
	

	}

}
