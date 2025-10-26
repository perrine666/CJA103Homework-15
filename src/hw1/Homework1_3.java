package hw1;

public class Homework1_3 {
	public static void main(String[]args) {
		
		int day=256559/(60*60*24), hour=(256559-day*60*60*24)/(60*60), minute=(256559-day*60*60*24-hour*60*60)/60, second=256559-day*60*60*24-hour*60*60-minute*60;
		System.out.println("256559秒為"+day+"天"+hour+"小時"+minute+"分"+second+"秒");
	}
}
