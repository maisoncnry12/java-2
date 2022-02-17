
public class Continue01 {
	public static void main(String[] args) {
		for (int count = 0; count < 5; count++) {
			if (count == 2) {
				// countが２の場合、この後の処理をスキップ
				continue;
			}
			System.out.println("continue01 = " + count);
		}
	}
}
