package code15_12;
import java.util.Calendar;
import java.util.Date;
public class Main {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2019, 8, 22, 1, 23, 45);
		c.set(Calendar.MONTH, 9);//０から始まるので１０月
		Date d = c.getTime();
		System.out.println(d);

		Date now = new Date();
		c.setTime(now);

		int y = c.get(Calendar.YEAR);
		int x = c.get(Calendar.MONTH)+1;//月は0から始まるので+1する
		System.out.println("今は" + y + "年" + x + "月です");

		Calendar a = Calendar.getInstance();
		a.set(Calendar.MONTH,1);
		int z = a.get(Calendar.MONTH) +1;//2月
		System.out.println(z + "月");
	}

}
