package exception;

public class Exception03 {

	public static void main(String[] args) {
		try {
			// "division"メソッドを呼び出し
			Exception03.division(100, 0);
			// "ArtithmenticException"クラスの例外が発生した場合の例外処理
		} catch (ArithmeticException e) {
			// 例外クラスが一致しないので、例外処理が実行されない
			System.out.println("ArithmeticException例外が発生");
			// "IllegalArgumentException"クラスの例外が発生した場合の例外処理
		} catch (IllegalArgumentException e) {
			// 例外処理が実行される
			System.out.println("IllegaArgumentException例外が発生");
			// キャッチした例外インスタンスをスロー
			throw e;
		}
		// "finally"ブロックでないので処理が実行されない
		System.out.println("プログラムが終了");
	}

	public static void division(int a, int b) {
		System.out.println(a + " / " + b + " は？ ");
		if (b == 0) {
			// 割り算で例外が発生するので、意図的に"IllegalArgumentException"例外をスロー
			throw new IllegalArgumentException("引数が不正です");
		}
		int result = a / b;
		System.out.println("計算結果" + result);
	}
}

//<throw文>・・・意図的に例外を発生させたい場合に使用

//<"throw"の基本構文>------------
//例外インスタンスをスロー
// 「throw 例外インスタンス;」
//例外インスタンスを生成してスロー
// 「throw new 例外クラス;」
//-----------------------------
