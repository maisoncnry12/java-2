package capsule.human;

public class HumanCapsule {
	// privateのアクセス修飾子を設定して外部から隠蔽
	private String name;
	private int age;

	public HumanCapsule(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// nameのgetterメソッド
	public String getName() {
		return this.name;
	}
	// getterメソッド
	// public 戻り値の型(フィールドの型) getフィールド名() {
	// return this.フィールド名
	// }

	// nemaのsetterメソッド
	public void setName(String name) {
		this.name = name;
	}
	// setterメソッド
	// public void setフィールド名（フィールドの方の引数) {
	// this.フィールド名 = フィールドの方の引数;
	// }

	// ageのgetterメソッド
	// ageは外部から変更禁止なので、setterメソッドは作成しない
	public int getAge() {
		return this.age;
	}
}
