package hw4;

import java.util.Scanner;

public class Homework4_4 {
	public static void main(String[] args) {
		
		int [][] coworker = {
								{25,2500},
								{32, 800},
								{8, 500},
								{19, 1000},
								{27, 1200}
							};
		
		Scanner money = new Scanner(System.in);
		int borrowMoney = money.nextInt();
		System.out.print("有錢可借的員工編號：");
		
		int count = 0;
		
		for(int i = 0; i < coworker.length; i++) {
			if (coworker[i][1] >= borrowMoney) {
				System.out.print(coworker[i][0]+" ");
				count++;
			}
		}System.out.print("共"+count+"個人!");
	}
}
