package extend.animal;

//abstract修飾子を設定して、抽象クラスとして宣言
public abstract class Animal {
	protected String name;

	// 共通メソッドを記述
	public void eat() {
		System.out.println(name + "が食事をしました！");
	}

	// サブクラスごとに違う処理は、抽象メソッドにしてサブクラスに実装させる
	public abstract void cry();
}