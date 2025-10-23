package hw3;

import java.util.Scanner;

public class Homework3_2 {
	public static void main(String[]args) {
		
		int i = (int) (Math.random()*10);
		
		System.out.println("開始猜數字吧!");
		
		while (true) {
			Scanner isanswer = new Scanner(System.in);
			
			if(isanswer.nextInt()!=i) {
				System.out.println("猜錯囉！");
			}else {
				System.out.println("答對了！答案就是"+i);
				break;
			}
			
			
		}

	}
	
}
