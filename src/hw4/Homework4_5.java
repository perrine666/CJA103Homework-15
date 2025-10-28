package hw4;

import java.util.Scanner;

public class Homework4_5 {
	public static void main(String[]args) {
		
		Scanner day = new Scanner(System.in);
		
		int[] date = new int [3];
		
		for(int i = 0; i < date.length; i++) {
			date[i] = day.nextInt();
		}
		
		int days = 0,count = 0;
		
		for(int j = 1; j < date[1]; j++) {
			if(j == 2)
				days = 28;
			else if(j <= 7 && j%2 == 0)
				days = 30;
			else if(j > 7 && j%2 != 0)
				days = 30;
			else
				days = 31;
			count += days;
		}
		
		count = count + date[2];
		
		if(date[1] > 2) {
			if(date[0]%400 == 0 || (date[0]%4 == 0 && date[0]%100 != 0))
				count = count+1;
		}
		
		System.out.println("輸入的日期為該年的第"+count+"天");
	}
}
