package hw4;

import java.util.Arrays;

public class Homework4_1 {
	public static void main(String[] args) {
		
		int [] x = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		
		int sum = 0, average;
		
		for(int i=0; i<x.length; i++) {
			sum += x[i];
		}
		
		average = sum/x.length;
		
		System.out.println(average);
		System.out.println();
		
		Arrays.sort(x);
		
		for(int i=0; i<x.length; i++) {
			if(x[i] < average) {
				System.out.print(x[i]+" ");
			}
		}


	}

}
