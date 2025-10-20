package hw2;

public class Homework2 {
	public static void main(String[]args) {
		
		int sum=0;
		for(int count=1; count<=1000; count++) {
			if (count%2==0) {
				sum+=count;
			}
		}System.out.println(sum);
		System.out.println();
		
		
		int m=1;
		for (int n=1; n<=10; n++) {
			m*=n;
		}System.out.println(m);
		System.out.println();
		
		
		int i=1;
		int j=1;
		while(i<=10) {
			j*=i;
			i++;
		}System.out.println(j);
		System.out.println();
		
		
		for(int num1=1; num1<=10; num1++) {
			int num2=1;
			num2=num1*num1;
			System.out.print(num2+" ");
		}
		System.out.println();
		System.out.println();
		
		
		int num3,num4,count1=0;
		for (num3=0;num3<=4;num3++) {
			for(num4=0;num4<=9;num4++){
				if(num3!=4 &&num4!=4 && (num3+num4!=0)) {
					System.out.print(10*num3+num4+" ");
					count1++;
				}
			}
		}System.out.print("共有"+count1+"個數字");
		System.out.println();
		System.out.println();
		
		
		int a,b;
		for (a=10;a>=1;a--) {
			for (b=1;b<=a;b++) {
				System.out.print(b+" ");
			}
			System.out.println();
		}System.out.println();
		
		
		char c=65;
		for (int e=1; e<=6;e++) {
			for (int f=1; f<=e; f++) {
				System.out.print(c);
			}
			System.out.println();
			c++;
		}
	}
}
