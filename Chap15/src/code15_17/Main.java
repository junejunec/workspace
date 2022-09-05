package code15_17;
import java.time.LocalDate;
import java.time.Period;
public class Main {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2020, 1, 1);
		LocalDate d2 = LocalDate.of(2020, 1, 4);

		Period p1 = Period.ofDays(3);//3日間
		Period p2 = Period.between(d1, d2);//期日→1/1と1/4の差は3日間

		LocalDate d3 = d2.plus(p2);

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("\"" + d3 + "\"");
	}

}
