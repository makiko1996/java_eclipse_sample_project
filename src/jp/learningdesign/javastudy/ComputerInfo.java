package jp.learningdesign.javastudy;

class Computer {
	public String os;
	public int memory;
	public int strage;
}

public class ComputerInfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Computer desktop = new Computer();
		desktop.os = "Windows10";
		desktop.memory = 4;
		desktop.strage = 256;
		
		System.out.println("OS:" + desktop.os);
		System.out.println("Memory:" + desktop.memory + "GB");
		System.out.println("Strage:" + desktop.strage + "GB");
		
		Computer desktop2 = desktop;
		
		desktop2.os = "Ubuntu";
		
		System.out.println("OS:" + desktop2.os);
		System.out.println("Memory:" + desktop2.memory + "GB");
		System.out.println("Strage:" + desktop2.strage + "GB");
		
		System.out.println("OS:" + desktop.os);
		System.out.println("Memory:" + desktop.memory + "GB");
		System.out.println("Strage:" + desktop.strage + "GB");		

	}

}
