package binary.desafio;

public class Produto {
	
	final String name;
	final double price;
	final double discount;
	
	public Produto(String name, double price, double discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Produto [name=" + name + ", price=" + price + ", discount=" + discount + "]";
	}
	
	
	
}
