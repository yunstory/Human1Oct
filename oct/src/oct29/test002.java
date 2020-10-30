package oct29;

import java.util.Scanner;

public class test002 {

	
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		
		
		while(true) {
			
			//최대 100명의 통장을 개설 할 수 있다.
			String id[] = new String[100]; // 회원 아이디
			int[] pw = new int[100]; // 회원 비밀번호 
			int[] save = new int[100]; // 회원정보 저장 
			
			id[0] = "홍길동";
			pw[0] = 1234;
			
			
			
						System.out.println("아이디와 패스워드를 입력해주세요");
						String ID = sc.nextLine();
						if(ID.equals("exit")){
							System.out.println("종료");
							break;
						}
						int PW = sc.nextInt();
						int money = 0;
						
						if(ID.equals(id[0])) {
							
							if(ID.equals(id[0]) && PW==pw[0]) {
								System.out.println("회원 " + id[0]+ " 님이 로그인 하셨습니다");
								while(true) { //4가 아닌 값이 들어오면 반복
									System.out.println("1.입금 2.출금 3.조회 4.종료");
									int go = sc.nextInt();
										if (go == 1) {
											System.out.println("입금할 금액");
											int deposit = sc.nextInt();
											money += deposit;
										}else if (go == 2) {
											System.out.println("출금할 금액");
											int withdraw = sc.nextInt();
											money -= withdraw;
											if(money<withdraw) {
												System.out.println("통장 잔고를 확인해 주세요");
											}
										}else if (go == 3) {
											System.out.println("통장잔고" + money);
										}else {
											break;
										}
								}
								
							}
						}else if(ID.equals("admin")){
							if(PW==pw[0]) {
								System.out.println("관리자 " + ID + " 님이 로그인 하셨습니다");
								while(true) {
									System.out.println("1.계정 추가 2.계정 삭제 3.모든 사용자 정보 확인 4.id로 특정 사용자 정보 확인 5.종료");
									int go = sc.nextInt();
									
									if(go==1) {
										
									}else if(go==2) {
										
									}else if(go==3) {
										
									}else if(go==4) {
										
									}else {
										break;
									}
								}
							}else {
								System.out.println("등록된 아이디가 아닙니다.");
							}
							
						}else if(ID.equals("exit")){
							System.out.println("종료");
							break;
						}else {
							System.out.println("등록된 아이디가 아닙니다.");
						}

				
				
				
				
				
				
				
			}
		
		
		
		
		
	}
}
