
public class If02 {
	public static void main(String[] args) {
		int number = 7;
		if (number < 5) {
			System.out.println(number + " は5未満です");
		} else if (number < 10) {
			System.out.println(number + " は5以上、10未満です");
		} else if (number < 15) {
			System.out.println(number + "  は10以上、15未満です");
		} else {
			System.out.println(number + " は15未満でないです");
		}
	}
}
//ーーーーーーーーーーーーーーーーー
//＜else-if,else文の基本構文＞
//if (条件式) {
//    ブロック(処理文);
//} else if (条件式) {
//    ブロック(処理文);
//} else if (条件式) {
//    ブロック(処理文);
//} else {
//    ブロック(処理文)
//}
//ーーーーーーーーーーーーーーーーー

//＊if,else-if,else,は、条件式の評価結果が"true"になったブロックだけを実行