package code15_05;

public class Main {

	public static void main(String[] args) {
		String s1 = "Java programming";
		System.out.println(s1.replace("Java", "JavaScript"));
		System.out.println("文字列s1の4文字目は" + s1.charAt(3));
		System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
		System.out.println("文字列s1の4～8文字目は" + s1.substring(3, 8));


		String s2 = s1.toLowerCase();
		if(s2.contains("java")) {
			System.out.println(s2);
			System.out.println("文字列s1は大文字小文字いずれかのjavaという文字を含んでいます");
		}
		String s3 = s1.toUpperCase();
		if(s3.contains("JAVA")) {
			System.out.println(s3);
			System.out.println("文字列s1は大文字小文字いずれかのjavaという文字を含んでいます");
		}
	}//全角空白を除去する際はtrim()を定義する

}
