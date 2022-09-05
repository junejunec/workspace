package code16_03;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Main {

	public static void main(String[] args) {
		Set<String> colours = new HashSet<String>();
		colours.add("赤");
		colours.add("青");
		colours.add("黄");
		colours.add("赤");
		colours.add("黄");
		System.out.println("色は" + colours.size() + "種類");//追加しても無視される
		for(String s : colours) {
			System.out.print(s + "→");
			System.out.print(s);
			System.out.print("←" + s);
			System.out.println();

		}
		System.out.println("\niterator");
		Iterator<String> it = colours.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "→");

		}
	}

}
