package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3_1 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數：");
		
		int [] data = new int [3];
		
		for (int i = 0; i<data.length; i++ ) {
			data[i] = sc.nextInt();
		}
		
		Arrays.sort(data);
		
		if (data[0]==0) {
			System.out.println("不是三角形");
		}else if (data[0] == data[1] && data[1] == data[2]) {
			System.out.println("正三角形");
		}else if (Math.pow(data[2],2) == (Math.pow(data[0], 2) + Math.pow(data[1], 2)) ) {
			System.out.println("直角三角形");
		}else if (data[0]==data[1] || data[1] == data[2] ) {
			System.out.println("等腰三角形");
		}else {
			System.out.println("其他三角形");
		}
	}
}