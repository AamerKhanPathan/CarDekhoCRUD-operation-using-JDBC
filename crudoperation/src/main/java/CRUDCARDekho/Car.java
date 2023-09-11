package CRUDCARDekho;

public class Car {
 
	private int id;
	private String name;
	private String componyName;
	private double price;
	private String color;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setComponyName(String cname) {
		this.componyName=cname;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void setColor(String color) {
		this.color=color;
	}
	
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getComponyName() {
		return this.componyName;
	
	}
	public double getPrice() {
		return this.price;
	}
	
	public String getColor() {
		return this.color;
	}
	
}
