package kadai2;

public class Kouza {
	private String no;	//口座番号
	private int zandaka;	// 預金額

	public Kouza() {

	}
	public Kouza(String no,int zandaka) {
		this.no = no;
		this.zandaka = zandaka;
	}
	public String getNo() {
		return no;
	}
	public int getZandaka() {
		return zandaka;
	}
	public void setZandaka(int zandaka) {
		this.zandaka = zandaka;
	}

}
