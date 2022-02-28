package classMethod;

import classMethod.human.Human04;

public class ClassMethod04 {
	public static void main(String[] args) {
//		Human04インスタンスを生成すると、コントラクラ内の処理が実行される
		Human04 yamada = new Human04("山田");

//		静的メンバーは、インスタンス生成せずに直接使用できる
		Human04.staticMethodPrint();

//		staticなクラス定数もインスタンスを生成せずに参照できる
		System.out.println(Human04.GREETING);

//		インスタンスメンバーは直接使用できない（コンパイルエラーになる）
//		Human04.instanceMthodPrint();
//		System.out.println(Human04.name);

//		インスタンスメンバーはインスタンス生成してから使用する
		yamada.instanceMethodPrint();
	}
}
