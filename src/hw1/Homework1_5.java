package hw1;

public class Homework1_5 {
	public static void main(String[]args) {
		
		int principal=1500000, year=10;
		double interestRate=0.02;
		double finalValue=principal*Math.pow((1+interestRate),year);
		System.out.println("本金加利息共有"+(int)finalValue+"元");
	}
}
