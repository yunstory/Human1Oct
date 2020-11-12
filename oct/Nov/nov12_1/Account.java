package nov12_1;

import java.util.Scanner;

//통장정보 클래스 
public class Account {

	public static int totalCount = 0; //모든 애들이 접근 할 수 있도록 (데이터 공유) static을 써줌
	public int money = 0;  //예금액
	public String id = null; // 아이디
	public String pw = null; // 비밀번호
	
	
	public Account () { //계정 만들 때 마다 하나씩 증가 
		totalCount++;
	};
	
	
	public Account(String id, String pw) {
//		super();
		this(); // 생성자 호출 
		this.id = id;
		this.pw = pw;
	}




	public boolean isLogin(String id, String pw) {
		boolean returnValue = false;
		
		if(this.id.equals(id) && this.pw.equals(pw)) {
			returnValue = true;
		}
		return returnValue;
	}
	
	
	public void display() { 
		System.out.println("--------------------------------------------");
		System.out.println("총 가입자 수 : " + Account.totalCount  + "\n"); //static
		System.out.println("가입자 ID : " + id + "\t가입자 PW: " + pw +"\t\t잔액: " + money);
		System.out.println("--------------------------------------------");

		
		
	}
	
	public void add(int money) { //입금
		this.money += money;
	}
	
	public void min(int money) { //출금
		this.money -= money;
	}
	
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		String inputString = null;
		
		
			
		boolean banking = true;
		
		while(banking) {
			System.out.println("1. 입금 2.출금 3.종료");
			inputString = sc.nextLine();
				
			switch(inputString) {
				case "1":
					display();
					System.out.println("입금액 >> ");
					int money = Integer.parseInt(sc.nextLine()); //자동형변환
					add(money);
					display();
					break;
					
				case "2":
					System.out.println("출금액 >> ");
					money = Integer.parseInt(sc.nextLine());
					min(money);
					display();
					break;
					
				case "3":
					System.out.println("업무 종료");
					banking = false;
					break;
					
				default:
					System.out.println("입력 오류");
				}
		}
	}

	

}
