package code15_15;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class Main {

	public static void main(String[] args) {
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 =LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);//2020/01/01/09:05:00:00
		System.out.println(l1);
		System.out.println(l2);

		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));//l2にロンドン時間（タイムゾーン）を追加
		//localは元の情報がないから単に情報を付与するだけでよい
		LocalDateTime l3 = z1.toLocalDateTime();
		System.out.println(z1);
		System.out.println(l3);
		Instant i1 = z1.toInstant();
		ZonedDateTime z2 = i1.atZone(ZoneId.of("Asia/Tokyo"));
		System.out.println(z2);

	}

}
