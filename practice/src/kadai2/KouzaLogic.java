package kadai2;

public class KouzaLogic {
	// 口座情報設定用
	Kouza[] kouzaes;
	public void set(Kouza[] k) {
		this.kouzaes = k;
	}

	public boolean excute(String kouza) {
		for(Kouza k:kouzaes) {
			if(kouza.equals(k.getNo())) {
				return true;
			}
		}
		return false;
	}
	public boolean excute(String motoKouza,String sakiKouza,int kingaku) {
		boolean flag = false;
		for(Kouza k:kouzaes) {
			if(motoKouza.equals(k.getNo())) {
				if(kingaku <= k.getZandaka()) {
					k.setZandaka(k.getZandaka()-kingaku);
					flag = true;
				}
			}
		}
		if(!flag) {
			return false;
		}
		for(Kouza k:kouzaes) {
			if(sakiKouza.equals(k.getNo())) {
				k.setZandaka(k.getZandaka()+kingaku);
				return true;
			}
		}
		return false;
	}

}
