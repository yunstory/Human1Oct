package nov13_1;


class Product {
	//제품 종료로는 tv와 computer가 있다. 각 5% 10% 할인 행사 중 
	//tv 속성으로는 인치, computer 속성으로는 ram을 가지고 있다. 
	//최종가격을 리턴하는 getPrice메소드가 있다.

	
	
	//모든 곳에서 활용할 내용들 미리 선언해두기 (공통적이용)
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
		return price - price* (discountRate / 100);
	}	
	
}


class TV extends Product{
	
	public double inch = 0; //inch가 10이상은 배송비 만원 추가 

	public TV(String id, double price, double discountRate, double inch) {
		super(id, price, discountRate);
		this.inch = inch;
	}

	@Override //재정의
	public double getPrice() {
		return inch>10? super.getPrice()+10000 : super.getPrice(); //부모에있는 getPrice실행 될것임
	}
	
}

class Computer extends Product{

	public Computer(String id, double price, double discountRate, double ram) {
		super(id, price, discountRate);
		Ram = ram;
	}
	
	public double Ram = 0; //ram 1기가 당 2만원 추가 
	
	@Override // 재정의
	public double getPrice() {
		return super.getPrice() + Ram * 2; // 부모에있는 getPrice실행 될 것임 
	}

}

class Customer {
	//vip고객은 구매 요금의 2%p 일반 고객은 구매 요금의 1%p 적립 
	//vip고객은 특별히 제품 가격을 5%할인해준다. 포인트는 모든 물건 할인 후 최종 결제 금액으로 포인트 추가 
	//적립포인트, toString 
	
	public String id = "";
	public int point = 0;
	public double pointRate = 0;
	
	public void setPoint(Product p) {
		//p제품에 대한 포인트적립
		this.point = (int)(p.getPrice() * (pointRate/100));
		
	}
	
	public Customer(String id, int point, int pointRate) {
		super();
		this.id = id;
		this.point = point;
		this.pointRate = pointRate;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", point=" + point + ", pointRate=" + pointRate + "]";
	}
	
	
}

class VIPCustomer extends Customer{
	public double priceRate = 0; // vip만의 할인 가격 첨가 

	public VIPCustomer(String id, int point, int pointRate, double priceRate) {
		super(id, point, pointRate);
		this.priceRate = priceRate;
	}
	
	public void setPoint(Product p) {
		//p제품에 대한 포인트적립 / 계산우선순위를 봅시당 ㅎㅅㅎ
		double resultPrice = p.getPrice() - (p.getPrice() * (priceRate/100));
		
		this.point = (int) (resultPrice* (pointRate/100));
	}

	@Override
	public String toString() {
		return "VIPCustomer [priceRate=" + priceRate + ", id=" + id + ", point=" + point + ", pointRate=" + pointRate
				+ "]";
	}

	
	
}


public class test001 {

	public static void main(String[] args) {

		Product p1 = new TV("LG-AD-1011", 10000000, 15, 40);
		Product p2 = new Computer("LG-GRAM-2022", 1000000, 15, 40);
		
		Customer c1 = new Customer("홍길동", 0, 1);
		Customer c2 = new VIPCustomer("홍길똥", 0, 1, 5);
		
		c1.setPoint(p1);
		c1.setPoint(p2);
		
		System.out.println(c1);
		System.out.println(c2);

		

	}

}
