package code16_02;
import java.util.Iterator;
import java.util.LinkedList;
public class Main {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		names.add("湊");
		names.add("朝香");
		names.add("菅原");
		Iterator<String> it = names.iterator();//trueだったらwhileを始める
		while(it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
		System.out.println("通常のfor文.");
		for(int i = 0; i<names.size(); i++) {//iは配列番号
			System.out.println(names.get(i));

		}
		System.out.println("拡張for文.");
		for(String i : names) {
			System.out.println(i);

		}
	}

}
