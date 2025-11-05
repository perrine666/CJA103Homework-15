package hw5;

public class Homework5_2 {

	public void randAvg() {
		System.out.println("本次亂數結果：");
		
		int [] random = new int[10];
		int sum = 0;
		
		for(int i = 0; i < random.length; i++) {
			random[i] = (int)(Math.random()*101);
			System.out.print(random[i]+" ");
			sum+=random[i];
		}System.out.println();
		
		int average = sum/10;
		
		System.out.print(average);
	}
	
	public static void main(String[]args) {
		
		Homework5_2 testRandom = new Homework5_2();
		
		testRandom.randAvg();
	}
}
