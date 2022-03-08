package capsule.human;

public class HumanNoCapsule {
	// publicのアクセス修飾子のため外部から参照が可能
	public String name;
	public int age;

	public HumanNoCapsule(String name, int age) {
		this.name = name;
		this.age = age;
	}
}