package code17_01;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
		    FileWriter fw = new FileWriter("data.txt");// try catchしてないのでエラー
		    fw.close();
		    int[] array = new int[3];
		    array[4] = 10;
		}catch(IOException |NullPointerException e) {
			System.out.println("エラーが発生しました");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("スタックトレース表示\n");//syserrででる
			e.printStackTrace();
		}
	}

}
