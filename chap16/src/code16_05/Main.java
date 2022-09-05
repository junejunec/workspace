package code16_05;
import java.util.Set;
import java.util.TreeSet;
public class Main {

	public static void main(String[] args) {
//		Set<String> words = new LinkedHashSet<String>(); //入力順
		Set<String> words = new TreeSet<String>(); //abc順
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		words.add("sugarglider");
		words.add("aligator");
		words.add("lion");
		words.add("bear");
		words.add("elephant");
		words.add("giraff");
		words.add("koala");
		words.add("fox");

		for(String s : words) {
			System.out.print(s + "→");
		}
	}

}
