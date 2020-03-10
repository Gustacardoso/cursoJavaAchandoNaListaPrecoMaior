package entities;

public class Product implements Comparable<Product> {
    
	private String name;
	private Double price;
	
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	


	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Double getPrice() {
		return price;
	}




	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}




	@Override
	public int compareTo(Product other) {
		/*vamos compara os pre�os, ja que essa � a ordem
		   do exercicio, pegando  o pre�o de um e comparando
		    com o outro
		    */
		return price.compareTo(other.getPrice());
	}

}
