package R15_04;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Main {

	public static void main(String[] args) {
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DAY_OF_MONTH, day + 100);//100日後
		Date after100Days = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日 HH:mm:ss");
		System.out.println(f.format(after100Days));

	}

}
