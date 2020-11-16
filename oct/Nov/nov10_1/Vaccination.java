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
				System.out.println(dog.dogName + "�Կ���" + Vaccination.VaccinationNum + "��°�� ���� ������ �Ͽ����ϴ�");
				dog.Vaccination = true;
				VaccinationNum++;
			}else {
				System.out.println(dog.dogName  + "�Կ��� ���������� �̹� �ϼ̽��ϴ�");
			}
		}else {
			System.out.println(dog.dogName + "���� ����ڰ� �ƴ�");
		}
	}
	
	public void vaccination(Cat cat) {
		if(cat.catAge > 5) {
			if(cat.Vaccination == false) {
				System.out.println(cat.catName + "�Կ���" + Vaccination.VaccinationNum + "��°�� ���� ������ �Ͽ����ϴ�");
				cat.Vaccination = true;
				VaccinationNum++;
			}else {
				System.out.println(cat.catName  + "�Կ��� ���������� �̹� �ϼ̽��ϴ�");
			}
		}else {
			System.out.println(cat.catName + "���� ����ڰ� �ƴ�");
		}
	}
	
}
