package nov10_1;

public class Shopping {
	
	private String num = "201803120001";
	private String ID = "abc123";
	private String date = "2018년 03월 12일";
	private String name = "홍길순";
	private String product = "PD0345-12";
	private String address = "서울시 영등포구 여의도동 20번지";
	
	private static Shopping instance = new Shopping();
	
	private Shopping() {};
	
	
	public static Shopping getInstance () {
		return instance;
	}

	
	
	public String getNum() {
		return num;
	}
	
	public void setNum(String num) {
		this.num = num;
	}

	public String getID() {
		return ID;
	}
	
	public void setID(String iD) {
		ID = iD;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void setInstance(Shopping instance) {
		Shopping.instance = instance;
	}

	@Override
	public String toString() {
		return "주문번호 : " + num + "\n주문자 아이디 : " + ID + "\n주문날짜 : " + date 
				+ "\n주문자 이름 : " + name + "\n주문 상품 번호 : " + product + "\n배송 주소 : " + address;
	}


	
	
	
	
	
	
}
