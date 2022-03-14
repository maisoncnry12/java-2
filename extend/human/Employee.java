package extend.human;

//Humanクラスを継承したEmployeeクラス
public class Employee extends Human {
	// サブクラスで追加したフィールド
	private String department;

	public Employee(String name, int age, String department) {
		// スーパークラスのコンストラクタを呼び出し
		super(name, age);
		this.department = department;
	}

	// サブクラスで追加したメソッド
	public String getEmployeeProfile() {
		// 親インスタンスのフィールドをthis変数で参照
		String profile = "年齢は" + this.age + "です。";
		profile += "サラリーマンで、部署は" + this.department + "です。";
		return profile;
	}
}