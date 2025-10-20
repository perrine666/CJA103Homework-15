package hw1;

public class hw1 {
	public static void main(String[]args) {
		System.out.println("12、6的和為"+(12+6)+"，積為"+12*6);
	
		int dozen=200/12, egg=200%12;
		System.out.println("200顆雞蛋共是"+dozen+"打"+egg+"顆");
		
		int day=256559/(60*60*24), hour=(256559-day*60*60*24)/(60*60), minute=(256559-day*60*60*24-hour*60*60)/60, second=256559-day*60*60*24-hour*60*60-minute*60;
		System.out.println("256559秒為"+day+"天"+hour+"小時"+minute+"分"+second+"秒");
		
		final float PI=3.1415f;
		System.out.println("半徑為5的圓面積為"+(5*5*PI)+"，圓周長為"+(5*2*PI));
		
		int principal=1500000, year=10;
		double interestRate=0.02;
		double finalValue=principal*Math.pow((1+interestRate),year);
		System.out.println("本金加利息共有"+(int)finalValue+"元");
		
		/*5+5：為數字相加，因此結果為10。
		 *5+'5'：'5'的ASCII碼為53，53+5為58。
		 *5+"5"："5"為字串，結果為數字及字串串接。
		 */
		System.out.println((5+5)+" "+(5+'5')+" "+(5+"5"));
		
	}
}
