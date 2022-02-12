
public class Chapter05 {
	public static void main(String[] args) {
//		プリミティブ型は変数を初期化して出力
		long l = 10000000000L;
		System.out.println(l);
//		最後に”L＂をつけた整数値で初期化
		double d = 3.14;
		System.out.println(d);
//		小数値で初期化
		boolean b = true;
		System.out.println(b);
//		trueで初期化

//		ラッパークラスはオートボクシングで初期化して出力
		Integer i = 100;
		System.out.println(i);
//		"int"の値で初期化
		Float f = 1.4142f;
		System.out.println(f);
//		"f"がついた"float"の値で初期化
		Character c = 'う';
		System.out.println(c);
//		「''」で囲まれた１文字で初期化

		int[] array = { 0, 10, 20, 30, 40 };
		System.out.println(array[3]);
//		"int"型の配列を初期化して、インデックス番号３の値を出力
	}
}
