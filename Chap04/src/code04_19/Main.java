package code04_19;

public class Main {

	public static void main(String[] args) {
		int [][][] scores = {{{40, 50, 60}, {80, 60, 70, 50}}};
/*		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[0][2]);
		System.out.println(scores[1].length);
		scores[0] = new int[] {100, 120, 180 , 250};
		System.out.println(scores[0].length);
		System.out.println(scores[0][2]);
*/


		for(int[] score:scores) {
			for(int view: score) {
				System.out.println(view);
			}
		}
		int[][] scores1 = {{},{},{}};
		scores1[0] = scores[0];
		scores1[1] = scores[1];
		scores1[2] = new int[] {10, 20, 80, 50, 40};
		System.out.println(scores1.length);
		for(int[] score:scores1) {
			for(int view: score) {
				System.out.println(view);

			}
		}
	}

}
