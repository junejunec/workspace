package r15_02;

public class Main {

	public static void main(String[] args) {
		System.out.println(catPath("\\c:javadev", "readme.txt"));
		System.out.println(catPath("c:\\user\\", "readme.txt"));
	}


		public static String catPath(String folder, String file) {
			String str = null;//やらなくてもよい//nullをいれておくとnull pointer exceptionoで判別がつきやすい
			str = folder;
			if(!str.endsWith("\\")) {
				str = str + "\\";
			}
			str = str +file;
			return str;
		}
		//  .*
		//A\d{1,2}  [A][0-9]{1, 2}

		//U[A-Z]{3}


}
