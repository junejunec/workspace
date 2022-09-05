package kadai2;

public class FurikomiYoushi {
	private String motoKouza;
	private String sakiKouza;
	private int kingaku;

	public FurikomiYoushi() {

	}
	public FurikomiYoushi(String motoKouza,String sakiKouza,int kingaku){
		this.motoKouza = motoKouza;
		this.sakiKouza = sakiKouza;
		this.kingaku = kingaku;
	}
	public String getMotoKouza() {
		return motoKouza;
	}
	public String getSakiKouza() {
		return sakiKouza;
	}
	public int getKingaku() {
		return kingaku;
	}

}
