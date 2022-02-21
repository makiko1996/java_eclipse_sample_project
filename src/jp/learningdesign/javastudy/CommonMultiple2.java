package jp.learningdesign.javastudy;

public class CommonMultiple2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// ２または３の倍数を１から５０未満の範囲で表示するプログラム（論理和）
		int i = 1;
		while (i < 50) {
			if ((i % 2 == 0) || (i % 3 == 0)) {
				System.out.println(i);
			}
			i++;
		}

	}

}
