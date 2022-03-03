package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception04 {
	public static void main(String[] args) {
		try {
			//			readFileメソッドを呼び出し
			Exception04.readFile("exception.txt");
			//		呼び出し元も例外処理を記述しないとコンパイルエラーになる
		} catch (FileNotFoundException e) {
			//			例外処理が実行される
			System.out.println("FileNotException例外が発生");
		}
		//		catch文で例外処理されるので、処理が実行される
		System.out.println("プログラム終了");
	}

	//	検査例外のFileNotFOundException例外をスロー
	public static void readFile(String fileName) throws FileNotFoundException {
		System.out.println("ファイルの読み込み開始");
		//		ファイルが存在しないため例外が発生
		FileReader fr = new FileReader(fileName);
		System.out.println(fileName + "の読み込み完了");
	}
}

//<"throws"の基本構文>--------------------------------------
//修飾子　戻り値の型　メソッド名（引数）　throws　例外クラスの型 {
//	return 戻り値;
//}
//---------------------------------------------------------
