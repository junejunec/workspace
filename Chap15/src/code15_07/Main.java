package code15_07;

public class Main {

	public static void main(String[] args) {
		String s = "\\a:b;c,d-e,f\\g_h>i";
		String[] words = s.split("[,;:.<>_\\\\-%]");
		for(String w : words) {
			System.out.print(w + "->");//分割
		}
		System.out.println();
		String s1 = "abc,def:ghi_jkl";
		String w1 = s1.replaceAll("[behk]","X");
		System.out.println(w1);//置換

	}

}
