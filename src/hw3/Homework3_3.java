package hw3;

import java.util.Scanner;

public class Homework3_3 {
	
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("阿文，請輸入你討厭哪個數字？");
		int num1 = number.nextInt();
		
		int count=0;
		for (int i=0 ; i<=4; i++) {
			for (int j=0; j<=9; j++) {
				if(i!=num1 && j!=num1 && i+j!=0) {
					System.out.print(10*i+j+"\t");
					count++;
					if (count%6==0)
						System.out.println();
				}
			}
		}System.out.println("共有"+count+"個數字可選");
	}
}
