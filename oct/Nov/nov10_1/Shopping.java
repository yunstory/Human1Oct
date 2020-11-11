package nov10_1;

public class Shopping {
	
	private String num = "201803120001";
	private String ID = "abc123";
	private String date = "2018�� 03�� 12��";
	private String name = "ȫ���";
	private String product = "PD0345-12";
	private String address = "����� �������� ���ǵ��� 20����";
	
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
		return "�ֹ���ȣ : " + num + "\n�ֹ��� ���̵� : " + ID + "\n�ֹ���¥ : " + date 
				+ "\n�ֹ��� �̸� : " + name + "\n�ֹ� ��ǰ ��ȣ : " + product + "\n��� �ּ� : " + address;
	}


	
	
	
	
	
	
}
