package nov10_1;

public class Cat { //����5�� Dog�� ������ �ʵ带 ���� Cat

	public int catAge = 0;
	public String catName = "";
	public Boolean Vaccination = false;
	
	public Cat (){}

	public Cat(String catName, int catAge, Boolean vaccination) {
		super();
		this.catAge = catAge;
		this.catName = catName;
		Vaccination = vaccination;
	}
	
	public int addAge(int x) {
		return catAge += x;
	}
	
	public Boolean isVaccination() {
		if(catAge>5 && Vaccination == false) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "����� �̸��� " + catName + "�̰� ���̴� " + catAge + " �� �Դϴ�.";
	};
	
	
	
	
}
