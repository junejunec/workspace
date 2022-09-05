package code16_06;
import java.util.LinkedHashMap;
import java.util.Map;
public class Main {

	public static void main(String[] args) {
		Map<String, Integer> prefs = new LinkedHashMap<String, Integer>();
		prefs.put("京都府", 255);//削除
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);//上書き
		int tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は, " + tokyo);
		prefs.remove("京都府");//削除
		prefs.put("熊本県", 182);//値の上書き
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口は, " + kumamoto);
		System.out.println("熊本県と東京都の人口は足せない, " + kumamoto + tokyo);
		prefs.put("京都府", 255);
		for (String key : prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key + "の人口は, " + value);
		}
	}

}
