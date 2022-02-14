
public class Chapter06 {
	public static void main(String[] args) {
		int val = 2 + 5;
		System.out.println(val);
//		変数"val"を算術演算子の"+"で計算した結果を初期化
		
		val++;
		System.out.println(val);
//		変数"val"をインクリメント（後置）→前置でインクリメントしても同様
		
		val *= 5;
		System.out.println(val);
//		代入演算子"*="を使用し変数"val"に"5"をかけた値を代入
		
		boolean bool = (val == 50);
		System.out.println(bool);
//		"bool"変数に、関係演算子の"=="を使用し"valは50と等しい"の結果を代入
		
		bool = (val < 50) && (val % 10 == 0);
		System.out.println(bool);
//		"bool"変数に論理演算子の"&&"を使用し結果を代入
//		関係（比較）演算子の"<"を使用し、余りの計算は算術演算子"%"を使用
	}
}
