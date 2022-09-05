package r15_03;

public class Main {

	public static void main(String[] args) {
		String s = "A11";
		if(s.matches(".*")) {
			System.out.println("1条件を満たしています");
		}

		if(s.matches("A[0-9]{1,2}")) {
			System.out.println("2条件を満たしています");
		}
		s  = "UABC";

		if(s.matches("U[A-Z]{3}")) {
			System.out.println("3条件を満たしています");
		}

	}

}
