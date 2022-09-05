package code15_14;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class Main {

	public static void main(String[] args) {
		final String FORMAT = "%-8s %-13s %8,6d";
		Instant i1 = Instant.now();
		System.out.println(i1);

		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		System.out.println(i2);

		long l = i2.toEpochMilli();


		ZonedDateTime z1 = ZonedDateTime.now();//now
		System.out.println(z1);
		ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));

		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
		System.out.println(z3);

		System.out.println();
		//Tは記号を区切るため


		System.out.println("東京：" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println(z2);
		System.out.println("ロンドン："+ z3.getYear() + z3.getMonth() + z3.getDayOfMonth() );
		System.out.println(z3);
		if(z2.isEqual(z3)) {//
			System.out.println("これらは同じ瞬間をさしています");//同じ瞬間のため同一として扱う

		}
	}

}
