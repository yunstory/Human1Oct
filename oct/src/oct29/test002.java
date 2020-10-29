package oct29;

import java.util.Scanner;

public class test002 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		
		int lol = 9;
		while( lol != 3) {
						System.out.println("아이디와 패스워드를 입력해주세요");
						String id = sc.nextLine();
						int pw = sc.nextInt();
						int input = 9;
						int money = 0;
						
						if(id.equals("홍길동")) {
							
							if(pw==1234) {
								System.out.println("회원" + id+ "님이 로그인 하셨습니다");
								while(input != 4) { //4가 아닌 값이 들어오면 반복
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
								
							}else {
								System.out.println("비밀번호 오류");
							}
						}else if(id.equals("admin")){
							if(pw==1234) {
								System.out.println("관리자" + id+ "님이 로그인 하셨습니다");
								while(input != 4) {
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
							}
							
						}else {
							System.out.println("등록된 아이디가 아닙니다.");
						}
				
			

				
				
				
				
				
				
				
			}
		
		
		
		
		
	}
}
