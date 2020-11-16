package nov10_1;

public class Vaccination {

	public static int VaccinationNum;
	
	private static Vaccination instance = new Vaccination();
	
	
	public Vaccination () {};
	
	public static Vaccination getInstance (int x) {
		VaccinationNum = x;
		return instance;
	}
	
	public static Vaccination getInstance() {
		return instance;
	}
	
	public void vaccination(Dog dog) {
		if(dog.dogAge > 5) {
			if(dog.Vaccination == false) {
				System.out.println(dog.dogName + "님에게" + Vaccination.VaccinationNum + "번째로 예방 접종을 하였습니다");
				dog.Vaccination = true;
				VaccinationNum++;
			}else {
				System.out.println(dog.dogName  + "님에게 예방접종을 이미 하셨습니다");
			}
		}else {
			System.out.println(dog.dogName + "님은 대상자가 아님");
		}
	}
	
	public void vaccination(Cat cat) {
		if(cat.catAge > 5) {
			if(cat.Vaccination == false) {
				System.out.println(cat.catName + "님에게" + Vaccination.VaccinationNum + "번째로 예방 접종을 하였습니다");
				cat.Vaccination = true;
				VaccinationNum++;
			}else {
				System.out.println(cat.catName  + "님에게 예방접종을 이미 하셨습니다");
			}
		}else {
			System.out.println(cat.catName + "님은 대상자가 아님");
		}
	}
	
}
