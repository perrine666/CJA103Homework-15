package hw4;

import java.util.Arrays;

public class Homework4_6 {
	public static void main(String[] args) {
		
		int[][] score = {
							{10, 35, 40, 100, 90, 85, 75, 70},
							{37, 75, 77, 89, 64, 75, 70, 95},
							{100, 70, 79, 90, 75, 70, 79, 90},
							{77, 95, 70, 89, 60, 75, 85, 89},
							{98, 70, 89, 90, 75,90, 85, 89},
							{90, 80, 100, 75, 50, 20, 99, 75}
						};
		int[][] score2 = new int [6][8];
		
		for(int i = 0; i < score2.length; i++) {
			for(int j = 0; j < score2[i].length; j++) {
				score2[i][j] = score[i][j];
			}
		}
		
		for(int i = 0; i<score.length; i++) {
			Arrays.sort(score2[i]);
		}
		
		int[] count = new int[8];
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score2[i].length; j++) {
				if (score2[i][7] == score[i][j]) {
					count[j]++;
				}
			}
		}
		
		for(int i = 1; i <= 8; i++) {
			System.out.println(i+"號同學考最高分的次數為"+count[i-1]+"次");
		}
		
	}
}
