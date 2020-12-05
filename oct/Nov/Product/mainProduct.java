package Product;

//물건정보 생성
class Product{
	public static int totalCount = 0;
	public String name;
	public int count = 0;
	//입고
	public void add(int count) {
		this.count += count;
	}
	//출고 
	public void min(int count) {
		this.count -= count;
	}
	//출력 
	public void display() {
		System.out.println("전체 상품 종류 수 : " + Product.totalCount);
		System.out.println("상품 이름: " + this.name);
		System.out.println("상품 수량 : " + this.count);
	}
	//생성자
	public Product() {
		Product.totalCount++; //상품개수
	}
	public Product(String name) {
		this(name, 0); // 아래  this 자기 자신의 생성자를 호출
		
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
		Product p1 = new Product("새우깡", 100);
		registProduct(p1);
		Product p2 = new Product("수수깡", 100);
		registProduct(p2);
		Product p3 = new Product("고구마깡", 100);
		registProduct(p3);
		Product p4 = new Product("감자깡", 90);
		registProduct(p4);
		Product p5 = new Product("바리깡", 70);
		registProduct(p5);
	}
	public void registProduct(Product p) {
		//arrProduct[Product.totalCount-1] = p;
		arrProduct[arrIndex++] = p;
	}
	public void registProduct() {
		System.out.println("상품명 등록 페이지");
		System.out.println("상품명 >> ");
		String name = sc.nextLine();
		System.out.println("등록개수>>");
		int count = Integer.parseInt(sc.nextLine());
		arrProduct[arrIndex++] = new Product(name, count);
	}


	public void inputProduct() {
		System.out.print("입고할 상품 : ");
		String name = sc.nextLine();
		System.out.print("입고할 수량 : ");
		int count = Integer.parseInt(sc.nextLine());
		
		Product p = searchProduct(name);
		if(p == null) {
			System.out.println("없는 상품입니다.");
		}else {
			p.count += count;
		}
		p.display();
	}
	
	public void outputProduct() {
		System.out.print("출고할 상품 : ");
		String name = sc.nextLine();
		System.out.print("출고할 수량 : ");
		int count = Integer.parseInt(sc.nextLine());
		
		Product p = searchProduct(name);
		if(p == null) {
			System.out.println("없는 상품입니다.");
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
		System.out.println("<상품관리 프로그램>");
		boolean a= true;
		while(a) {
			System.out.println("1.상품등록 2.입고 3.출고 4.상품검색 5.상품재고확인 6.종료");
			String inNum=sc.nextLine();
			if(inNum.equals("1")) {
				registProduct();
			}else if(inNum.equals("2")) {
				inputProduct();
			}else if(inNum.equals("3")) {
				outputProduct();
			}else if(inNum.equals("4")) {
				System.out.println("검색 할 상품을 입력하세요>>");
				searchProduct(sc.nextLine());
			}else if(inNum.equals("5")) {
				displayProduct();
			}else if(inNum.equals("6")) {
				System.out.println("시스템을 종료합니다.");
			a= false;
			}
		}
	}
}

public class mainProduct {

	/* 재품 하나에 대한 정보를 담는 클래스 
	Product 클래스  // 한개의 물건에 대한 정보를 저장하는 클래스 
	등록한 상품개수 저장 //데이터공유 static
	상품명 // 공유 x instance
	재고 수량 // 공유x instance
	-----------필드 △  메소드▽
	재고 추가 //재고 수량++
	재고 사용 
	재고 내용 
	ProductManager클래스 상품들을 관리하는 프로그램
	*/
	
	public static void main(String[] args) {

		ProductManager pm=new ProductManager();
		pm.play();
		
		
	}

}
