package kadai2;

public class Main {

	public static void main(String[] args) {
		Kouza[] k = new Kouza[2];
		k[0] = new Kouza("123-45678",100000);
		k[1] = new Kouza("456-78901",50000);
		System.out.println(k[0].getNo() +":"+ k[0].getZandaka());
		System.out.println(k[1].getNo() +":"+ k[1].getZandaka());
		Uketsuke u = new Uketsuke();
		FurikomiYoushi fy = new FurikomiYoushi("123-45678","456-78901",150000);

		System.out.println(fy.getMotoKouza());
		System.out.println(fy.getSakiKouza());
		System.out.println(fy.getKingaku());
		if(u.furikomi(fy,k)) {
			System.out.println("振込しました");
			System.out.println(k[0].getNo() +":"+ k[0].getZandaka());
			System.out.println(k[1].getNo() +":"+ k[1].getZandaka());
		}else {
			System.out.println("振込できませんでした");
		}


	}

}
