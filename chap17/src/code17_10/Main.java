package code17_10;

import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("data.txt");){//セミコロンはなくてもよい。区切りを表す。
			fw.write("hello");

		}catch(Exception e){
			System.out.println("何らかの例外が発生しました。");
		}
		/*FileWriter fw = new FileWriter("data.txt");
		fw.write("hello");
		fw.close;*/
	}

}