package code15_16;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Main {

	public static void main(String[] args) {
		DateTimeFormatter fmt =DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ldate = LocalDate.parse("2010/09/22", fmt);
		//System.out.println("現在は" + ldate.fmt);


		LocalDate ldatep = ldate.plusDays(100);
		String str = ldatep.format(fmt);
		System.out.println("100日後は" + str);

		LocalDate now = LocalDate.now();

		if(now.isAfter(ldatep)) {
			System.out.println("1000日後は過去日付です");
			ldatep = ldatep.plusDays(1000);
			String str1 = ldatep.format(fmt);
			System.out.println("1000日後は" + str1);
		}


	}


}
