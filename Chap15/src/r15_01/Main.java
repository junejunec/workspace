package r15_01;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		System.out.println(sb);
		for(int i = 1; i < 100; i++) {
			//sb.append(i + ",");
			sb.append(i).append(", ");

		}

	String s = sb.toString();

	System.out.println(s);
	String[] a = s.split(",");
		for(String i:a) {
			System.out.print(i);
		}
	}


}
