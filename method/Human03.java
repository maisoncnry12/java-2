package classMethod.human;

public class Human03 {
	public String name;
	public int age;
	public String profession;

	public Human03() {
		this.name = "山田";
		this.age = 20;
		this.profession = "プログラマー";
	}

	public String getProfile() {
		return "年齢は" + this.age + "、職業は" + this.profession;
	}

	public void greet(String friend) {
		if (friend == null) {
			System.out.println("挨拶する友達がわかりません！");
			return;
		}
		System.out.println(friend + "さん、こんにちは！");
	}
}

//・String型の戻り値を返す"getProfile"メソッドを定義する
//・戻り値を返さない、String型の引数を１つとるgreetメソッドを定義する
//・上記メソッドないでString型の引数としてnullが渡される可能性があるためnullチェックを行う
//　（nullをそのまま扱うと、NUllProinterExceptionを始めさまざまなエラーのもととなるためチェックする）