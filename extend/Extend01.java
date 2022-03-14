package extend;

import extend.human.Employee;
import extend.human.Human;
import extend.human.Student;

public class Extend01 {
	public static void main(String[] args) {
		// Humanクラスのインスタンスを生成
		Human sugimoto = new Human("杉本", 16);
		System.out.println("Humanクラスのメソッド：名前は、" + sugimoto.getName());

		// Studentクラスのインスタンスを生成
		Student sato = new Student("佐藤", 17, 70);
		// サブクラスのインスタンスからスーパークラスを生成
		System.out.println("Humanクラスのメソッド：名前は、" + sato.getName());
		// Studentクラスに追加したgetStudentProfileメソッドを呼び出し
		System.out.println("Studentクラスのメソッド：プロフィールを紹介します。" + sato.getStudentProfile());

		// Employeeクラスのインスタンスを生成して、アップキャストでHumanクラスの変数に代入
		Human human = new Employee("田中", 28, "システム部");
		// スーパークラス(Humanクラス)のメソッドを呼び出し
		System.out.println("Humanクラスのメソッド：名前は、" + human.getName());

		// Humanクラスには、getEmployeeProfileメソッドがないのでアクセスするとコンパイルエラー
		// System.out.println("Employeeクラスのメソッド：" + human.getEmployeeProfile());
		// Employeeクラスの変数にダウンキャスト
		Employee tanaka = (Employee) human;
		// Employeeクラスの変数なので、Employeeクラスに追加したgetEmployeeProfileメソッドの呼び出しができる
		System.out.println("Employeeクラスのメソッド：プロフィールを紹介します。" + tanaka.getEmployeeProfile());

		// printNameメソッドを呼び出して、名前を表示
		Extend01.printName(sugimoto);
		// Humanクラスのサブクラスの変数を引数にして呼び出し
		Extend01.printName(sato);
		Extend01.printName(tanaka);
	}

	// 引数がHumanクラスなので、Humanクラスか、そのサブクラスなら呼び出しできる
	public static void printName(Human human) {
		System.out.println("Humanクラスのメソッド：名前は、" + human.getName());
	}
}