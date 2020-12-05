package Product;

//�������� ����
class Product{
	public static int totalCount = 0;
	public String name;
	public int count = 0;
	//�԰�
	public void add(int count) {
		this.count += count;
	}
	//��� 
	public void min(int count) {
		this.count -= count;
	}
	//��� 
	public void display() {
		System.out.println("��ü ��ǰ ���� �� : " + Product.totalCount);
		System.out.println("��ǰ �̸�: " + this.name);
		System.out.println("��ǰ ���� : " + this.count);
	}
	//������
	public Product() {
		Product.totalCount++; //��ǰ����
	}
	public Product(String name) {
		this(name, 0); // �Ʒ�  this �ڱ� �ڽ��� �����ڸ� ȣ��
		
	}
	public Product(String name, int count) {
		this();
		this.name = name;
		this.count = count;
	}
}

class ProductManager{
	public static java.util.Scanner sc = new java.util.Scanner(System.in);
	public int arrIndex = 0;
	public Product [] arrProduct = new Product[10];
	
	public ProductManager() {}
	
	public void registTestData() {
		Product p1 = new Product("�����", 100);
		registProduct(p1);
		Product p2 = new Product("������", 100);
		registProduct(p2);
		Product p3 = new Product("������", 100);
		registProduct(p3);
		Product p4 = new Product("���ڱ�", 90);
		registProduct(p4);
		Product p5 = new Product("�ٸ���", 70);
		registProduct(p5);
	}
	public void registProduct(Product p) {
		//arrProduct[Product.totalCount-1] = p;
		arrProduct[arrIndex++] = p;
	}
	public void registProduct() {
		System.out.println("��ǰ�� ��� ������");
		System.out.println("��ǰ�� >> ");
		String name = sc.nextLine();
		System.out.println("��ϰ���>>");
		int count = Integer.parseInt(sc.nextLine());
		arrProduct[arrIndex++] = new Product(name, count);
	}


	public void inputProduct() {
		System.out.print("�԰��� ��ǰ : ");
		String name = sc.nextLine();
		System.out.print("�԰��� ���� : ");
		int count = Integer.parseInt(sc.nextLine());
		
		Product p = searchProduct(name);
		if(p == null) {
			System.out.println("���� ��ǰ�Դϴ�.");
		}else {
			p.count += count;
		}
		p.display();
	}
	
	public void outputProduct() {
		System.out.print("����� ��ǰ : ");
		String name = sc.nextLine();
		System.out.print("����� ���� : ");
		int count = Integer.parseInt(sc.nextLine());
		
		Product p = searchProduct(name);
		if(p == null) {
			System.out.println("���� ��ǰ�Դϴ�.");
		}else {
			p.count += count;
		}
		p.display();
	}
	
	public Product searchProduct(String name) {
		Product returnValue = null;
		for(int i=0; i<arrIndex; i++) {
			if(arrProduct[i].name.equals(name)) {
				returnValue = arrProduct[i];
				break;
			};
		}
		return returnValue;
	}

	public void displayProduct() {
		for(int i=0; i<Product.totalCount; i++) {
			arrProduct[i].display();
		}
	}
	
	public void play() {
		System.out.println("<��ǰ���� ���α׷�>");
		boolean a= true;
		while(a) {
			System.out.println("1.��ǰ��� 2.�԰� 3.��� 4.��ǰ�˻� 5.��ǰ���Ȯ�� 6.����");
			String inNum=sc.nextLine();
			if(inNum.equals("1")) {
				registProduct();
			}else if(inNum.equals("2")) {
				inputProduct();
			}else if(inNum.equals("3")) {
				outputProduct();
			}else if(inNum.equals("4")) {
				System.out.println("�˻� �� ��ǰ�� �Է��ϼ���>>");
				searchProduct(sc.nextLine());
			}else if(inNum.equals("5")) {
				displayProduct();
			}else if(inNum.equals("6")) {
				System.out.println("�ý����� �����մϴ�.");
			a= false;
			}
		}
	}
}

public class mainProduct {

	/* ��ǰ �ϳ��� ���� ������ ��� Ŭ���� 
	Product Ŭ����  // �Ѱ��� ���ǿ� ���� ������ �����ϴ� Ŭ���� 
	����� ��ǰ���� ���� //�����Ͱ��� static
	��ǰ�� // ���� x instance
	��� ���� // ����x instance
	-----------�ʵ� ��  �޼ҵ��
	��� �߰� //��� ����++
	��� ��� 
	��� ���� 
	ProductManagerŬ���� ��ǰ���� �����ϴ� ���α׷�
	*/
	
	public static void main(String[] args) {

		ProductManager pm=new ProductManager();
		pm.play();
		
		
	}

}
