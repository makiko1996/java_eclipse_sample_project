package jp.learningdesign.javastudy;

class Staff {
	String name ;
	int staffid;
	String email;
}

public class Staffinfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Staff yamada = new Staff();
		yamada.name = "Taro Yamada";
		yamada.staffid = 1;
		yamada.email = "yamada@taro.com";
		
		System.out.println(yamada.email);

	}

}
