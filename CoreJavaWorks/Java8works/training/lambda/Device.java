package training.lambda;

public class Device {
	private int dId;
	private String name;
	private double price;
	private String category;
	public Device() {
	}
	public Device(int dId, String name, double price, String category) {
		super();
		this.dId = dId;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	@Override
	public String toString() {
		return "Device [dId=" + dId + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
