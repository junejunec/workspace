package code02_05;

public class Main {

	public static void main(String[] args) {
		float f =3; //float型にint型を代入
		double d =f;//double型にfloat型を代入
		System.out.println(f);
		System.out.println(d);
		
		//

		byte b = 1;  //ok
		short a = 2; //ok
		int c = 3;
		b +=c;       //エラーにならない
		
		char ch = 48;
		char ch2 = '0';
				
		System.out.println(ch);
		System.out.println(ch2);
 
	}

}
