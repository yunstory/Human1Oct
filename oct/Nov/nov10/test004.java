package nov10;

import nov10_1.Dog;
import nov10_1.Cat;
import nov10_1.Vvaccination;

public class test004 {

	public static void main(String[] args) {
		
		//����2 �������� �̸��� dog1�̰� ���̴� 10���Դϴ١� ���
		Dog d = new Dog("dog1", 10, false);
		System.out.println(d); 

		//����3 d.addAge(5);
		System.out.println(d.addAge(5)); 
		System.out.println(d.dogAge); //Ȯ��
		System.out.println(d); //Ȯ��
		
		//����5 ���α׷� ����
		Vvaccination v =Vvaccination.getInstance(10);
		
		v.vaccination(d);// ��dog1�Կ��� 10��°�� ���������� �Ͽ����ϴ�.�� �����
		v.vaccination(d);// ��dog1�Կ��� ���������� �̹� �ϼ̽��ϴ�.���� ���
		v.vaccination(new Dog(��dog2��,3,false));// ��dog2���� ����ڰ� �ƴԡ�
		Vaccination v2=Vaccination.getInstance();
		v2.vaccination(c);// ��cat1�Կ��� 11��°�� ���������� �Ͽ����ϴ�.��

	}

}
