package nov10;

import nov10_1.Dog;
import nov10_1.Cat;
import nov10_1.Vvaccination;

public class test004 {

	public static void main(String[] args) {
		
		//문제2 “강아지 이름은 dog1이고 나이는 10살입니다” 출력
		Dog d = new Dog("dog1", 10, false);
		System.out.println(d); 

		//문제3 d.addAge(5);
		System.out.println(d.addAge(5)); 
		System.out.println(d.dogAge); //확인
		System.out.println(d); //확인
		
		//문제5 프로그램 구현
		Vvaccination v =Vvaccination.getInstance(10);
		
		v.vaccination(d);// “dog1님에게 10번째로 예방접종을 하였습니다.” 가출력
		v.vaccination(d);// “dog1님에게 예방접종을 이미 하셨습니다.”가 출력
		v.vaccination(new Dog(“dog2”,3,false));// “dog2님은 대상자가 아님”
		Vaccination v2=Vaccination.getInstance();
		v2.vaccination(c);// “cat1님에게 11번째로 예방접종을 하였습니다.”

	}

}
