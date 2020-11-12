package nov12_1;

public class Bank {


	public static int totalCount = 0;
	public String name = "";
	public Account[] account = new Account[10];
	public int accountCount = 0;
	//로그인 X = -1
	public int accountCurrent = -1;
	
	public Bank() {
		totalCount++;
	}
	public Bank(String name) {
		super();
		this.name = name;
	}
	
	public void accountAdd() {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		
		System.out.println("ID입력 : ");
		String id = sc.nextLine();
		
		if(isId(id)) {
			System.out.println("ID 중복 / 재입력 해주세요");
			return;
		}
		
		System.out.println("PW입력 : ");
		String pw = sc.nextLine();
		account[accountCount++] = new Account(id, pw);
	}
	
	private boolean isId(String id) {
		boolean returnValue = false;
		for(int i=0; i<accountCount; i++) {
			if(account[i].id.equals(id)) {
				returnValue = true;
			};
		}
		return returnValue;
	}
	public void logout() {
		accountCurrent = -1;
		System.out.println("로그아웃");
	}
	public boolean login(String id, String pw) {
		boolean returnValue = false;
		for(int i=0; i<accountCount; i++) {
			if(account[i].isLogin(id, pw)) {
				returnValue = true;
				accountCurrent = i;
				break;
			};
		}
		return returnValue;
	}
	
	public void displayAll() {
		System.out.println("은행 수 : " + Bank.totalCount);
		System.out.println("은행 이름 : " + name);
		for(int i=0; i<accountCount; i++) {
			account[i].display();
		}
	}
	public void useAccount() {
		if(accountCurrent != 1) {
			account[accountCurrent].menu();
		}else {
			System.out.println("입력 오류");
		}
	}
	
	public void menu() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		boolean flag = true;
		
		while(flag) {
			System.out.println("1.계정등록 2.모든계정 출력 3.계정로그인 4.로그아웃 5.계정삭제 6.종료");
			String stringInput = sc.nextLine();
			
			switch(stringInput) {
				case "1":
					accountAdd();
					displayAll();
					break;
				case "2": 
					displayAll();
					break;
				case "3": 
					System.out.println("ID : ");
					String id = sc.nextLine();
					System.out.println("PW : ");
					String pw = sc.nextLine();
					
					if(login(id, pw)) {
						System.out.println(id+"님이 로그인 하셨습니다.");
						useAccount();
					}else {
						System.out.println("로그인 실패");
					}
					break;
				case "4": 
					logout();
					break;
				case "5":
					System.out.println("삭제할 ID : ");
					id = sc.nextLine();
					System.out.println("ID의 PW : ");
					pw = sc.nextLine();
							
					delete(id,pw);
					break;
				case "6": 
					System.out.println("종료");
					flag = false;
					break;
				default:
					
			}
		}

	}

	public void delete(String id, String pw) {
		boolean flag = false;
		for(int i=0; i<accountCount; i++) {
			if(account[i].isLogin(id, pw)) {				
				accountCurrent = i;
				flag = true;
				break;
			}
		}
		if(flag) {
			for(int i=accountCurrent; i+1<accountCount; i++) {
				account[i] = account[i+1];
			}
			Account.totalCount--;
			accountCount--;
			accountCurrent--;
			System.out.println("삭제완료");
		}else {
			System.out.println("입력오류 삭제실패");
		}
	}

	
}
