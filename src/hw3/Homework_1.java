package hw3;

import java.util.Scanner;

public class Homework_1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數：");
		
		int data1 = sc.nextInt();
		int data2 = sc.nextInt();
		int data3 = sc.nextInt();
		
		if (data1==0 && data2==0 && data3==0) {
			System.out.println("不是三角形");
		}else if (data1 == data2 && data2 == data3) {
			System.out.println("正三角形");
		}else if((data1==data2) || (data2==data3) || (data1==data3)) {
			System.out.println("等腰三角形");
		}else {
			System.out.println("其他三角形");
		}
	}
}
