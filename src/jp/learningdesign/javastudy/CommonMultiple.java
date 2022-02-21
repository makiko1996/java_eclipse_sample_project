package jp.learningdesign.javastudy;

public class CommonMultiple {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//２と３の公倍数を表示するプログラム（論理積）
		int i = 1;
		while (i < 100) {
			if ((i % 2 == 0) && (i % 3 == 0)) {
				System.out.println(i);
			}
			i++;
		}
	
	}

}
