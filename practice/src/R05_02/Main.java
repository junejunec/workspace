package R05_02;

public class Main {
	public static void main(String[] args) {
		// 以下呼び出しているメソッドをエラーなく呼び出せるよう定義しなさい。
		// 参考 配列データの要素の値の全てに対し+1するメソッド
		int[] array = {1,2,3};
		incArray(array);

		// ① 配列のデータをプリントするメソッド
		printArray(array);

		// ② int型のデータをdouble型に変換してその値を返すメソッド
		double x = changeIntToDouble(120);

		// ③ int配列のデータを全部加算し合計を返すメソッド
		int sum = addArray(array);

		// ④ double配列のデータを全部加算し合計を返すメソッド
		double[] dbarray = {1.5,2.8,3.4};
		double dbsum = addArray(dbarray);

		// ⑤ char型のデータをString型に変換してその値を返すメソッド
		String zodiac = changeCharToStr('辰');

	}
	// 参考メソッド定義
	public static void incArray(int[] array) {
		for(int i = 0;i < array.length;i++) {
			array[i] ++;
		}
	}
			// ①
			public static void printArray(int[] arrays) {
				for(int array:arrays) {
					
				System.out.println(array);
			}

			// ②
			public static double changeIntToDouble(int[] atb){
					return (double) atb;
				}

			// ③
			public static int addArray(int[] arrays) {
				int sum = 0;
				for(int array:arrays) {
					sum += array;
				}
				return sum;
			}
				

			// ④
			public static double addArray(double[] arrays) {
				double sum = 0;
				for(double array:arrays) {
					sum += array;
				}
				return sum;
			}

			// ⑤
			public static String changeCharToStr(char ch) {
				return String.valueOf(ch);
			}

	}

}
