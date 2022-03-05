package shoppingapp.app;

public class Product {
	private Long id;
	private String name;
	private String category;
	private Double price;
	public Product(Long id, String name, String category, Double price) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}


public void display() 
	{
		System.out.println("Id of product is \n"+id+" \nName of product is \n"+name+" \nCategory of product is\n "+category+" \nPrice of product is \n"+price);
	}
}


