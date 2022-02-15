
public class If01 {
	public static void main(String[] args) {
		int number = 7;
		if (number < 5) {
			System.out.println(number + "は５未満です");
		}
		if (number < 10) {
			System.out.println(number + "は１０未満です");
		}
		if (number < 15) {
			System.out.println(number + "は１５未満です");
		}
	}
}
//if文は上から順に処理される
//"false"の場合にはif文のブロック内の処理は実行されず、後続のプログラムが処理される