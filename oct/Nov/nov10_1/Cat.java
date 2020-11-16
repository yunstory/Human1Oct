package nov10_1;

public class Cat { //문제5번 Dog와 동일한 필드를 가진 Cat

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
		return "고양이 이름은 " + catName + "이고 나이는 " + catAge + " 살 입니다.";
	};
	
	
	
	
}
