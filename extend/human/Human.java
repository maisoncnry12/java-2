package extend.human;

public class Human {
	// privateは自分自身からのみアクセス可能
	private String name;
	// protectedはサブクラスからもアクセス可能
	protected int age;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
}