package _28_Java_8_Features;

public class _10_Product {

	private int pid;
	private String name;
	private int qty;
	private int price;

	public _10_Product() {

	}

	public _10_Product(int pid, String name, int qty, int price) {
		super();
		this.pid = pid;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public String getName() {
		return name;
	}

	public int getQty() {
		return qty;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		// class definition only — no members should go here
	}
}