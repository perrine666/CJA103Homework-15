package hw2;

public class Homework2_1 {
	public static void main(String[]args) {
		
		int sum=0;
		for(int count=1; count<=1000; count++) {
			if (count%2==0) {
				sum+=count;
			}
		}System.out.println(sum);
	
	}
}
