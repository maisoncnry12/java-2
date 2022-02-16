
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

//＜do-while文の基本構文＞ーーーー
//do {
//    ブロック（繰り返し処理）
//} while (条件式);
//ーーーーーーーーーーーーーーーーー

//＜while文とdo-while文の違い＞ーーーーーーーーーーーーーーーー
//条件式をブロックの実行前に評価するか、後に評価するかの違い
//「ループ開始」時点
//　・条件が"false"の場合
// 　　→"while文"　＝　ブロック実行されない
//　　 →"do-while文"　＝　ブロック実行
//ーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーー