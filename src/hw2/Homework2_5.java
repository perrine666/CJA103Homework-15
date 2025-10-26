package hw2;

public class Homework2_5 {
	public static void main(String[]args) {
		
		int num3,num4,count1=0;
		for (num3=0;num3<=4;num3++) {
			for(num4=0;num4<=9;num4++){
				if(num3!=4 &&num4!=4 && (num3+num4!=0)) {
					System.out.print(10*num3+num4+" ");
					count1++;
				}
			}
		}System.out.print("共有"+count1+"個數字");
	}
}
