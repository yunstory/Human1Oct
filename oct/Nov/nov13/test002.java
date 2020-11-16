package nov13;

class Product {
		public String id = "";
		public double price = 0;
		public double discountRate = 0;
		
		public Product(String id, double price, double discountRate) {
			super();
			this.id = id;
			this.price = price;
			this.discountRate = discountRate;
		}
		
		public double getPrice() {
			return price - price * (discountRate/100);
		}
	}
	
class TV extends Product{
		public double inch = 0; 
		
		public TV(String id, double price, double discountRate, double inch) {
			super(id, price, discountRate);
			this.inch = inch;
		}
		
		@Override
		public double getPrice() {
			return inch>10? super.getPrice() + 10000 : super.getPrice();
		}
	}

class Computer extends Product{
	
	public Computer(String id, double price, double discountRate, double ram) {
		super(id, price, discountRate);
		Ram = ram;
	}
	
	public double Ram = 0;
	
	@Override
	public double getPrice() {
		return super.getPrice() + Ram*2;
	}
}

class Customer{
	public String id = "";
	public int point = 0;
	public double pointRate = 0;
	
	public void setPoint(Product p) {
		this.point = (int)(p.getPrice()*(pointRate/100));
	}
	
	public Customer(String id, int point, double pointRate) {
		super();
		this.id = id;
		this.point = point;
		this.pointRate = pointRate;
	}
	
	@Override
	public String toString() {
		return "Customer [id =" + id + ", point = " + point + ", pointRate = " + pointRate +"]";
	}
}


class VIPCustomer extends Customer{
	
	public double priceRate = 0;
	
	public VIPCustomer(String id, int point, double pointRate, double priceRate) {
		super(id, point, pointRate);
		this.priceRate = priceRate;
	}
	
	public void setPoint(Product p) {
		double resultPrice = p.getPrice() - (p.getPrice() * (priceRate/100));
		this.point = (int)(resultPrice*(pointRate/100));
	}
	
	@Override
	public String toString() {
		return "VIPCustomer [priceRate=" + priceRate + ", id = " + id + ", point = " + point + ", pointRate = " + pointRate + "]";
	}
}
public class test002 {
	
	public static void main(String[] args) {
		
		Product p1 = new TV("ld3123" , 100000, 15, 40);
		Product p2 = new Computer("ld" , 1000, 15, 40);
		
		Customer c1 = new Customer("g", 0, 1);
		Customer c2 = new VIPCustomer("g", 0, 1,5);
		
		c1.setPoint(p1);
		c2.setPoint(p2);
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
