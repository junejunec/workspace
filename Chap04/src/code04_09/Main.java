package code04_09;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80, 60};
		for(int a = 0; a < scores.length-1; a++) {//要素が増えても変更がいらない
			for(int i =1; i < scores.length; i++)//java.utilarrays.sort()scores;
				if(scores[i-1] > scores[i]) {
				int temp = scores[i-1];
				scores[i-1] = scores[i];
				scores[i]
				}
				System.out.println(scores[i]);
		}

	}

}
