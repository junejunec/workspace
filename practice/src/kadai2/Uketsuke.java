package kadai2;

public class Uketsuke {

	public Uketsuke() {
	}
	public boolean furikomi(FurikomiYoushi f,Kouza[] k) {
		KouzaLogic kl = new KouzaLogic();
		kl.set(k);
		if(kl.excute(f.getMotoKouza())) {
			if(kl.excute(f.getSakiKouza())) {
				if(kl.excute(f.getMotoKouza(),f.getSakiKouza(),f.getKingaku())) {
					return true;
				}

			}

		}
		return false;
	}

}
