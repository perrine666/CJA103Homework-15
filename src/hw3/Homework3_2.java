package hw3;

import java.util.Scanner;

public class Homework3_2 {
	public static void main(String[]args) {
		
		int i = (int) (Math.random()*10);
		
		System.out.println("開始猜數字吧!");
		
		while (true) {
			Scanner number = new Scanner(System.in);
			
			if(number.nextInt()!=i) {
				System.out.println("猜錯囉！");
			}else {
				System.out.println("答對了！答案就是"+i);
				break;
			}
			
			
		}
		
		//進階題
		int j = (int)(Math.random()*101);
		System.out.println("開始猜數字吧！");
		
		while (true) {
			Scanner number1 = new Scanner(System.in);
			
			int guessNumber = number1.nextInt();
			
			if (guessNumber>j) {
				System.out.println("大於正確答案");
			}else if (guessNumber<j) {
				System.out.println("小於正確答案");
			}else { 
				System.out.println("答對了！答案就是"+j);
				break;
			}
			
		}

	}
	
}
