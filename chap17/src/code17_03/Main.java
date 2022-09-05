package code17_03;
import java.io.FileWriter;
import java.io.IOException;
public class Main {

	public static void main(String[] args) {
		System.out.println("開始");
		test();
		System.out.println("終了");

	}
	public static void test() /*throws IOExceprion*/ {
		FileWriter fw = null;
		try {
			/*FileWriter */fw =new FileWriter("data.txt");
			fw.write("hello!");
			fw.close();
			return;

		}catch (IOException e){
			System.out.println("何らかの例外が発生しました。");
			return;
//		}catch(IOException e) {

		}finally {
			if(fw != null) {
				try {
					fw.close();//そのままかくと例外がキャッチできなくなる（IOExceptionの外にあるのが×
					System.out.println("必ず実行");

				}catch(IOException e) {
				;
				}

			}
		}
	}


}
