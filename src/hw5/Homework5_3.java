package hw5;

public class Homework5_3 {
	public static int maxElement(int[][]x) {
		
		int data = x[0][0];
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				if(x[i][j]>data )
					data = x[i][j];
				else
					data=data;
			}
		}return data;
	}
		
	public static double maxElement(double[][]x) {
			
		double data = x[0][0];
		for(int i = 0; i < x.length; i++) {
				for(int j = 0; j < x[i].length; j++) {
					if(x[i][j]>data )
						data = x[i][j];
					else
						data=data;
				}
			}return data;
		 
	}
	
	public static void main(String[]args) {
		int [][] intArray = {
							{1,6,3},
							{9,5,2}
		};
		
		System.out.println(maxElement(intArray));
		
		double [][] doubleArray = {
									{1.2, 3.5, 2.2},
									{7.4, 2.1, 8.2}
		
				};
		System.out.println(maxElement(doubleArray));
		
	}
		
}