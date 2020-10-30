package oct29;

import java.util.Scanner;

public class test003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id[] = new String[100];
		String pw[] = new String[100];
		
		int account[] = new int[100]; // 은행업무가 종료되어도 정보는 지속되어야 하는 부분!
		
		
		
		id[0] = null;
		pw[0] = null;
		account[0] = 0;
		int listCount = 0;
		
		String inputID = null;
		String inputPW = null;
		
		int indexCount = 0;
		
		boolean bank = true;
		
		while(bank) { //아이디와 패스워드
			
			//아이디 하나, 패스워드 하나 입력하는 과정
			System.out.println("아이디와 패스워드를 입력해주세요");
			System.out.print("아이디 : ");
			inputID = sc.nextLine();
			if(inputID.equals("exit")) { //exit를 입력하면 빠져나가는 과정
				break;
			}
			System.out.print("패스워드 : ");
			inputPW = sc.nextLine();
			
			
			if(inputID==null) { // 아이디의 값이 null인지 아닌지 확인 .을 찍게되면 에러 발생
				
			}else if(inputID.equals("exit")) { //exit를 입력하면 빠져나가는 과정
				
				break;
			}else if(inputID.equals("admin") && inputPW.equals("admin")) { //관리자 로그인
			
				boolean isAdminLogin = true;
				
				while(isAdminLogin) {
					System.out.println("관리자 계정");
					
					System.out.println ("1.계정추가 2.계정삭제 3.모든 사용자 정보 조회 "
										+ "4.id로 특정 사용자 정보 확인 5.종료");
					
					
					System.out.print("메뉴 선택 : ");
					int selectNum = Integer.parseInt(sc.nextLine());
					
					switch(selectNum) {
					case 1:
						System.out.println(" 계정 추가 ");
						
						System.out.print("아이디 입력 : ");
						id[listCount] = sc.nextLine();
						System.out.print("패스워드 입력 : ");
						pw[listCount] = sc.nextLine();
						account[listCount] = 0;
						
						listCount++; //계정을 추가했으니 ++
						
						System.out.println("계정 추가 완료");
						break;
					case 2:
						System.out.println(" 계정 삭제 ");
						
						System.out.print("아이디 입력 : ");
						String deleteID = sc.nextLine();
						
						int findIndex = -1;
						
						for(int i=0; i<listCount; i++) {
							if(id[i].equals(deleteID)) {
								findIndex = i;
								break;
							}
						}					
						
						if(findIndex<0) {
							System.out.println("없는 아이디 입니다.");
						}else {
							//배열을 지우고 하나씩 땡겨오는 과정
							for(int i=findIndex; i<id.length-1; i++) {
								id[i] = id[i + 1];
								pw[i] = pw[i + 1];
								account[i] = account[i + 1];
							}
							listCount --;
							System.out.println("삭제되었습니다");
						}
						
						break;
					case 3:
						
						System.out.println("모든 사용자 정보 조회 ");
						
						for(int i=0; i<listCount; i++) {
							System.out.println("--------------------------------------------");
							System.out.println("아이디 : " + id[i] + "\t패스워드  : " + pw[i] + "\taccount : " + account[i]);
							System.out.println("--------------------------------------------");
						}
						if(listCount==0) {
							System.out.println("데이터가 없습니다");
						}
						break;
					case 4:
						System.out.println("찾을 계정을 입력해주세요");
						System.out.print("아이디 : ");
						String findID = sc.nextLine();
						
						boolean isFind = false;
						
						for(int i=0; i<listCount; i++) {
							if(id[i].equals(findID)) {
								System.out.print("아이디 : " + id[i]);
								System.out.print("패스워드  : " + pw[i]);
								System.out.print("account : " + account[i]);
								isFind = true;
							}
						}
						if(isFind==false) { //or !isFind
							System.out.println("없는 아이디 입니다");
						}
						//불리언 방식 또는 아래방식을 이용 
//						int i=0;
//						for(i=0; i<listCount; i++) {
//							if(id[i].equals(findID)) {
//								System.out.println("아이디 : " + id[i]);
//								System.out.println("패스워드  : " + pw[i]);
//								System.out.println("account : " + id[i]);
//							}
//						}
//						if(int i == listCount) {
//							System.out.println("없는 아이디 입니다");
//						}
						
						break;
					case 5:
						isAdminLogin = false;
						inputID = null;
						break;
					default:
						System.out.println("입력 오류");
					}
				}				
				/*배열추가 방법
				 List(연속된 데이터) 데이터를 지우면 그 자리를 밑에 부분이 올라와서 채워줌 
				 배열 :: 데이터를 지우면 그 공간은 비어있음 
				 listCount 추가 0이면 0인부분에 추가해서 1로 변경됨
				 */
				
				
				
				
			}else { //일반사용자로그인
				//존재하는 아이디인지 확인하기 
				boolean isLogin = false;
				
				for(int i=0; i<id.length; i++) {//아이디 배열에서 확인 가능
					if(id[i]!=null && id[i].equals(inputID)
							&& pw[i].equals(inputPW)) {//널이면 안되고 존재하는 아이디이면 true
				//if(id[i].equals(inputID) && id[i]!=null) /잘못된 코드 오류발생함
						isLogin = true;
						indexCount = i;
						break;
					}
				}
				
				//System.out.println(indexCount + " : " + inputID + id[indexCount]); //중간확인코드
				
				
				if(isLogin) {
					//System.out.println("로그인성공");
					System.out.println(inputID + "님이 로그인 하였습니다.");
					
					
					while(isLogin) { //작업반복
					
					System.out.print("1.입금 2.출금 3.확인 4.종료 : ");
					
					int selectNum = Integer.parseInt(sc.nextLine());
					
					switch(selectNum) {
					case 1:
						System.out.println("입금 / 입금할 금액을 입력해주세요");
						account[indexCount] += Integer.parseInt(sc.nextLine());
						System.out.println(inputID + "님의 잔액 : " + account[indexCount]);
						break;
					case 2:
						System.out.println("출금 / 출금할 금액을 입력해주세요");
						account[indexCount] -= Integer.parseInt(sc.nextLine());
						System.out.println(inputID + "님의 잔액 : " + account[indexCount]);
						break;
					case 3:
						System.out.println(inputID + "님의 잔액 : " + account[indexCount]);
						break;
					case 4:
						System.out.println("로그아웃");
						inputID = null; // 입력했던 아이디 지워주기 로그아웃 새로 입력받기에 안써줘도 크게 문제는 없음
						isLogin = false; // 빠져나가는 코드
						break;
					default:
						System.out.println("입력오류");
						
					}
				}
					
					
					
				}else {
					//System.out.println("로그인실패");
					inputID = null;
				}
				
				// 그 아이디 (indexCount)는 몇번째에 존재하는지 확인하기

			}
			
}
		

//		//String loginId = ""; // 처음은 비워둔 예이다
//		String logingId=null; //널 값을 찾는 방법 (?)
//		//System.out.println(loginId==null); //equals(null) or equals("null") 은 틀린방식
//		
//		System.out.println(logingId.toString());

	}

}
