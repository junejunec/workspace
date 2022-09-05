package R14_01;

public class Account {
	String accountNumber;
	int balance;

	//オーバーライド
	public String toString() {
		return "残高: \\" + this.balance + " 口座番号: " + this.accountNumber;
	}

	//オーバーライド
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof Account) {//オブジェクトがアカウントクラスと同じかを調べてキャスト
			Account a = (Account)o;
			String a1 = this.accountNumber.trim();//空白を削除（含めない）して値を返す
			String a2 = a.accountNumber.trim();
			if(a1.equals(a2)) {



				return true;
			}
		}
		return false;
	}
}
