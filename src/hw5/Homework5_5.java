package hw5;

public class Homework5_5 {
	//A~Z ASCII 65~90 a~z 97~122 0~9 48~57 二維陣列 隨機從哪個陣列去隨機選一個值
	public void genAuthCode() {
		char[][] Code = new char[3][];
		
		Code[0] = new char [10];
		Code[1] = new char [26];
		Code[2] = new char [26];
		
		int number=48, upperCase = 65, lowerCase = 97;
		
		for(int i=0; i<Code[0].length; i++) {
			Code[0][i] = (char)number;
			number++;
		}
		for(int i=0; i<Code[1].length;i++) {
			Code[1][i] = (char)upperCase;
			Code[2][i] = (char)lowerCase;
			upperCase++;
			lowerCase++;
		}
		char [] AuthCode = new char [8];
		int count0=0, count1=0, count2=0;
		while(true) {
			for(int count=0;count<=7; count++) {
				int j = (int) (Math.random()*3);
				int k;
				switch (j) {
				case 0:
					k = (int)(Math.random()*10);
					count0++;
					break;
				case 1:
					k = (int)(Math.random()*26);
					count1++;
					break;
				default:
					k = (int)(Math.random()*26);
					count2++;
				}
				AuthCode[count] = Code[j][k];
				
			}
			if(count0>0 && count1>0 && count2>0)
				break;
		}System.out.print(AuthCode);
	}	
		
	
	public static void main(String[] args) {
			Homework5_5 a1 = new Homework5_5();
			System.out.println("本次隨機產生驗證碼為：");
			a1.genAuthCode();
		}
			
}
