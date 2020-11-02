package nov01;

import java.util.Scanner;

public class yuns_bank {


		
		public static void main(String[] args) {

			
			Scanner sc = new Scanner(System.in);


				
			//최대 100명의 통장을 만들 수 있다.
			String id[] = new String[100]; // 회원 아이디
			int[] pw = new int[100]; // 회원 비밀번호 
			int[] save = new int[100]; // 회원 통장
			
			int addList = 1; // 계정추가를 위해 필요한 코드 관리자는 0번 인덱스 고정 고로 1부터 시작
			
			id[0] = "admin"; //관리자아이디
			pw[0] = 1234; //관리자 비밀번호 
			save[0] = 999; //관리자 통장
				

			boolean yunsBank = true;
			
			while(yunsBank) {
				System.out.print("\n아이디를 입력해주세요 : ");
				String idID = sc.next();
				if(idID.equals("exit")) { // exit 입력시 프로그램은 종료된다.
					break;
				}
				System.out.print("비밀번호를 입력해주세요 : ");
				int pwPW = sc.nextInt();
				
			if(id[0].equals(idID) && pw[0] == pwPW) { 
					//관리자 권한 실행 모드 
					System.out.println(" 관리자 " + idID + " 님이 로그인 하셨습니다.\n");
					boolean adminArea = true;
					
					while(adminArea) { // 관리자가 로그아웃 하기 전 까지 반복되는 공간 
						System.out.println ("1.계정추가 2.계정삭제 3.모든 사용자 정보 조회 "
										  + "4.id로 특정 사용자 정보 확인 5.종료(로그아웃)");
						int adminSel = sc.nextInt();
						
						switch(adminSel) {
						
						case 1:
							// 새로운 아이디/비밀번호/통장 저장할 공간 추가 
							System.out.print("계정추가 ID : ");
							id[addList] = sc.next();
							System.out.print("계정추가 PW : ");
							pw[addList] = sc.nextInt();
							save[addList] = 0; // 통장 개설시  잔액은 0원으로 시작
							
							addList++; // 회원번호
							
							System.out.println("계정추가 완료\n");
							
							break;
						case 2:
							System.out.print("계정삭제 ID : ");
							idID = sc.next();
							
							int find = -1; // 인덱스의 번호는 0 부터
							for(int i=0; i<addList; i++) {
								if(id[i].equals(idID)) { //입력한ID가 목록에 있는 ID와 일치하는지 찾기
									find = i; // 몇번째에서 찾았는지 find에 저장
								}
							}
							
							if (find == 0) {
								System.out.println("삭제할 수 없는 계정입니다.\n"); //관리자 아이디는 삭제 할 수 없다
							}else if(find < 0){
								System.out.println("없는 계정 입니다.\n"); 
							}else {
								for(int i=find; i<id.length-1;) {
									System.out.println("삭제하면 되돌릴수 없습니다. 1.삭제 2.종료");
									int del = sc.nextInt();
									if(del==1) {
										//아이디와 비밀번호 그리고 내역을 지우고 배열을 한칸씩 땡겨와 저장하는 과정
										id[i] = id[ i + 1 ];
										pw[i] = pw[ i + 1 ];
										save[i] = save[ i + 1];
										System.out.println(idID + "님의 계정이 삭제되었습니다.\n");
										break;
									}else {
										System.out.println();
										break;
									}
								}
								
								addList--; // 계정을 삭제했으니 인덱스 --
							}						
							
							break;
						case 3:
							for(int i=1; i<addList; i++) { // ~ 입력되어 있는 계정까지 검색
								System.out.println("--------------------------------------------");
								System.out.println("아이디 : " + id[i] + "\t패스워드  : " + pw[i] + "\taccount : " + save[i]);
								System.out.println("--------------------------------------------");
							}
							
							if(addList<0) { // 인덱스 0은 관리자 계정이므로 0보다 작으면 아래
								System.out.println("데이터가 없습니다\n");
							}
							
							break;
						case 4:
							System.out.print("조회할 계정을 입력해주세요 : ");
							idID = sc.next();
							boolean findID = false; 
							
							for(int i=0; i<addList; i++) {
								if(id[i].equals(idID)) {
									System.out.println("아이디 : " + id[i] + "\t패스워드  : " + pw[i] + "\taccount : " + save[i] + "\n");
									findID = true; //값을 찾은 경우
								}
							}
							if(findID == false) { //값을 못 찾은 경우
								System.out.println("존재하지 않는 계정입니다.\n");
							}
							
							break;
						case 5:
							System.out.println("정상 로그아웃 완료\n");
							adminArea = false; // 관리자활동 종료
							idID = null; // 관리자 아이디 정상로그아웃 (기록지우기(?))
							break;
							
						}
					}
				}else {
					
					Esc:
					for(int i=0; i<id.length; i++) {
						
						if(id[i]!=null && id[i].equals(idID) && pw[i] == pwPW  ) {
							//아이디에 널 값이 들어가면 false
							System.out.println("회원 " + idID + " 님이 로그인 하셨습니다.\n");
							addList = i; //회원정보를 불러오는 코드 ( 관리자 계정생성 단계에서 확인 )
							
							while(true) { // 회원이 로그아웃하기 전까지 반복구간 
								
								System.out.print("\n1.입금 2.출금 3.조회 0.종료(로그아웃)");
								int sel = sc.nextInt();
								
								switch(sel) { //선택번호에 맞게 메뉴로 이동
								
								case 1:
									System.out.print("입금할 금액 : ");
									save[addList] += sc.nextInt(); // 저장된 회원의 통장save을 addList회원코드에 맞게 입금
									break;
								case 2:
									System.out.print("출금할 금액 : ");
									save[addList] -= sc.nextInt(); //  save회원의 통장 addList회원정보코드
									break;
								case 3:
									System.out.print( idID + "님의 통장 잔액 :  " + save[addList] + " 원 \n");
									break;
								default:
									System.out.print( idID +" 님이 로그아웃 하셨습니다.\n");
									idID = null; // 정상 로그아웃 (아이디 저장안함 이랄까)
									break Esc;
								}
							}
						}
					}
				}
			}
		
		
		

	}

}
