
public class DoWhile01 {
	public static void main(String[] args) {
		int number = 100;
//		do-while文：ループ開始
		do {
//			ブロック：
//			"number"に"number * 2"を代入して、"number" を出力
			number *= 2;
			System.out.println("DoWhile01 = " + number);
//			do-while文：
//			numberが50未満の場合、ブロック処理をループ実行する
		} while (number < 50);
	}
}

//ーーーーーーーーーーーーーーー
//＜do-while文の基本構文＞
//do {
//    ブロック（繰り返し処理）
//} while (条件式);
//ーーーーーーーーーーーーーーー

