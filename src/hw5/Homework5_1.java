package hw5;

import java.util.Scanner;

public class Homework5_1 {
	
	public void starSquare(int width, int height) {
		
		for (int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("請輸入寬與高");
		Scanner rectangular = new Scanner (System.in);
		
		int width = rectangular.nextInt();
		int height = rectangular.nextInt();
		
		Homework5_1 square = new Homework5_1();
		
		square.starSquare(width, height);
		
	}
	
	
}
