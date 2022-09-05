package R15_05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate after = now.plusDays(100);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");


		System.out.println(after.format(fmt));
	}

}
