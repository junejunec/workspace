package ginko;

public class Print {

	public Print(boolean result) {

		/*
		 * print(boolean result)
　　振込元口座
　　振込先口座
　　振込金額
　　resultがtrueの時
　　　振り込みました。
　　resultがfalseの時
　　　振込できませんでした。

		 */
		if(result == true) {
			System.out.println("振込みました");
		}else
			System.out.println("振込できませんでした");
	}

}
