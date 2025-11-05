package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		try {
			System.out.print("請輸入x的值: ");
			Scanner sc = new Scanner(System.in);
			int num1=sc.nextInt();
			System.out.print("請輸入y的值：");
			int num2 = sc.nextInt();
			
			Calculator c1 = new Calculator(num1, num2);
			System.out.println(num1+"的"+num2+"次方為"+c1.powerXY());
		}catch(CalException e) {
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("輸入格式不正確");
		}
	}
}
