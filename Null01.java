
public class Null01 {
	public static void main(String[] args) {
		String string1;
		string1 = "あいう";
		System.out.println(string1 + "の文字数：" + string1.length());
		string1 = "";
		System.out.println(string1 + "の文字数：" + string1.length());
		string1 = null;
		System.out.println(string1 + "の文字数：" + string1.length());
	}
}
