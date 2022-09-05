package code03_06;

public class Main {
//break文がない処理。確率を変えられる
	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch (fortune) {
		case 1:
		case 2:
			System.out.println("いいね！");//　1～2　　40％
			break;
		case 3:
			System.out.println("普通です");//　3　　　20％
			break;
		case 4:
		case 5:
			System.out.println("うーん…");//　4～5　　40％
		}

	}

}
