package homeWorkExt;

public class InkBrush extends Pen{
	private String brand;
	private int price;
	
	public void write() {
		System.out.println("沾墨汁再寫");
	}
	
	public InkBrush(String brand, int price) {
		super(brand,price);
		this.brand=brand;
		this.price=price;
	}
	
	public double getPrice() {
		return price*0.9;
	}
}
