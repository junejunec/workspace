package code15_051;

public class Main {

	public static void main(String[] args) {
		String s = "Java";
		System.out.println(s.matches("Java"));
		System.out.println(s.matches("JavaJava"));
		System.out.println(s.matches("java"));
		System.out.println("J + va".matches("J.va"));
		System.out.println("Jaaa".matches("Ja*"));

		if(isValidPlayerName("MINATO01")) {
			System.out.println("ok");
		}else {
			System.out.println("記述が違います");
		}

	}
	public static boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
/*
			if(name.length() != 8) {
				return false;
			}
			char first = name.charAt(0);
			if(!(first >= 'Z')) {
				return false;
			}
			for (int i = 1; i < 8; i++) {
				char c = name.charAt(i);
				if(!((c >= 'A' && c <= 'z') || (c >= '0' && c <= '9'))) {
					return false;
				}
			}
			return true;
		}*/
	}
}


