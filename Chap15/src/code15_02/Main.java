package code15_02;

public class Main {

	public static void main(String[] args) {
		String s1 = "Java and JavaScript";

		if(s1.contains("Java")) {
			System.out.println("文字列s1はJavaを含んでいます");
		}
		if(s1.startsWith("Java")) {
			System.out.println("文字列s1はJavaが先頭にあります");
		}

		System.out.println("文字列s1が最初にJavaが登場する位置は" + s1.indexOf("Java"));
		System.out.println("文字列s1が最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
	}


}
