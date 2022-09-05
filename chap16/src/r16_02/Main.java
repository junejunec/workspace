package r16_02;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
public class Main {
//16-2
	public static void main(String[] args) {
		ArrayList<String>  hero = new ArrayList<String>();
		Hero h1 = new Hero("斉藤");
		Hero h2 = new Hero("鈴木");
		hero.add(h1.getName());
		hero.add(h2.getName());
		List<Hero> array = new ArrayList<Hero>();
		//拡張for
		for(Hero h : array) {
			System.out.println(h.getName());
		}
		//for文(
		for(int i = 0; i<array.size(); i++) {
			System.out.println(array.get(i).getName());
		}


		Iterator<String> it = hero.iterator();
		while (it.hasNext()) {
			String e = it.next();
			System.out.println(e);
			//Hero h = it.next();
			//sysout (h)

		}



//16-3
		Map<Hero, Integer> hero1 = new LinkedHashMap<Hero, Integer>();
		hero1.put(h1/*.getName()*/, 3);
		hero1.put(h2/*.getName()*/, 7);
		for(Hero h : hero1.keySet()) { //h→key
			int value = hero1.get(h);
			System.out.println(h.getName() + "が倒した敵=" + value);

		}




	}

}
