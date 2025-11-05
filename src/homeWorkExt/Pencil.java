package homeWorkExt;

public class Pencil extends Pen{
	private String brand;
	private int price;
	
	
	public void write() {
		System.out.println("削鉛筆再寫");
	}
	
	public Pencil(String brand, int price) {
		super(brand, price);
		this.brand=brand;
		this.price=price;
	}
	
	public double getPrice() {
		return price*0.8;
	}
}
