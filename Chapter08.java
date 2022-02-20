
public class Chapter08 {
	public static void main(String[] args) {
		// 1.while文
		int num = 1;
		while (num < 5) {
			System.out.println(num * num);
			num++;
		}
		
		
	}
}

//＜問題＞
//1.「while」文
//・１以上５未満の数の２乗を出力
//2. 通常「for」文
//・要素数が4の「int」配列を初期化
//・配列のサイズ分ループして、要素を出力
//　※ 配列のサイズは「変数名.length」で取得が可能
//3. 拡張「for」文
//・「2.」の配列をループ
//・要素の値が偶数の場合は、continue文で処理をスキップ、奇数の場合は出力