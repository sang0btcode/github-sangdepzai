package Friday;



public class SinhVien {
	protected String id;
	protected String name;
	protected double price;
	protected double tax;

	public double getPriceTax() {
		return this.price * this.tax;
	}

	public void info() {
		System.out.println("run infor");
	}
}
