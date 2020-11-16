package nov13_1;


class Product {
	//��ǰ ����δ� tv�� computer�� �ִ�. �� 5% 10% ���� ��� �� 
	//tv �Ӽ����δ� ��ġ, computer �Ӽ����δ� ram�� ������ �ִ�. 
	//���������� �����ϴ� getPrice�޼ҵ尡 �ִ�.

	
	
	//��� ������ Ȱ���� ����� �̸� �����صα� (�������̿�)
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
	
	public double inch = 0; //inch�� 10�̻��� ��ۺ� ���� �߰� 

	public TV(String id, double price, double discountRate, double inch) {
		super(id, price, discountRate);
		this.inch = inch;
	}

	@Override //������
	public double getPrice() {
		return inch>10? super.getPrice()+10000 : super.getPrice(); //�θ��ִ� getPrice���� �ɰ���
	}
	
}

class Computer extends Product{

	public Computer(String id, double price, double discountRate, double ram) {
		super(id, price, discountRate);
		Ram = ram;
	}
	
	public double Ram = 0; //ram 1�Ⱑ �� 2���� �߰� 
	
	@Override // ������
	public double getPrice() {
		return super.getPrice() + Ram * 2; // �θ��ִ� getPrice���� �� ���� 
	}

}

class Customer {
	//vip���� ���� ����� 2%p �Ϲ� ���� ���� ����� 1%p ���� 
	//vip���� Ư���� ��ǰ ������ 5%�������ش�. ����Ʈ�� ��� ���� ���� �� ���� ���� �ݾ����� ����Ʈ �߰� 
	//��������Ʈ, toString 
	
	public String id = "";
	public int point = 0;
	public double pointRate = 0;
	
	public void setPoint(Product p) {
		//p��ǰ�� ���� ����Ʈ����
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
	public double priceRate = 0; // vip���� ���� ���� ÷�� 

	public VIPCustomer(String id, int point, int pointRate, double priceRate) {
		super(id, point, pointRate);
		this.priceRate = priceRate;
	}
	
	public void setPoint(Product p) {
		//p��ǰ�� ���� ����Ʈ���� / ���켱������ ���ô� ������
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
		
		Customer c1 = new Customer("ȫ�浿", 0, 1);
		Customer c2 = new VIPCustomer("ȫ���", 0, 1, 5);
		
		c1.setPoint(p1);
		c1.setPoint(p2);
		
		System.out.println(c1);
		System.out.println(c2);

		

	}

}
