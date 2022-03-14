package extend.human;

//Humanクラスを継承したStudentクラス
public class Student extends Human {
	// サブクラスで追加したフィールド
	private int score;

	public Student(String name, int age, int score) {
		// スーパークラスのコンストラクタを呼び出し
		super(name, age);
		this.score = score;
	}

	// サブクラスで追加したメソッド
	public String getStudentProfile() {
		// 親インスタンスのフィールドをsuper変数で参照
		String profile = "年齢は" + super.age + "です。";
		profile += "学生で、テストの点数は" + this.score + "点です。";
		return profile;
	}
}

//＜基本構文＞----------------------------------
//修飾子 class クラス名 extends スーパークラス名 {
//	サブクラスの処理
//}
//--------------------------------------------
