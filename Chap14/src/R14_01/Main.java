package R14_01;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.accountNumber = "4649 ";//　は含めないので違う口座扱いになる
		a1.balance = 1592;
		Account a2 = new Account();
		a2.accountNumber = " 4649";
		a2.balance = 5000;
		if(a1.equals(a2)) {
			/*System.*/out.println(a1);
			/*System.*/out.println(a2);
			/*System.*/out.println("同じ口座だね");
		}else{
			/*System.*/out.println(a1);
			/*System.*/out.println(a2);
			/*System.*/out.println("違う口座だよ");
		}

	}

}
