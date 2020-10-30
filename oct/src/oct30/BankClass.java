package oct30;


import java.util.Scanner;


	class Bank{
		public Scanner sc = new Scanner(System.in);
		public int listCount = 1;
		public String id[] = new String[100];
		public String pw[] = new String[100];
		public int account[] = new int[100];
		public String inputID = null;
		public String inputPW = null;
		public int indexCount = 0;
		
		public Bank() {
			init();
		}
		public void init() {
			
			id[0] = "ȫ�浿";
			pw[0] = "1234";
			account[0] = 0;
		}
		public void userMenu() {
			//�Ϲݻ���ڷα���
			//�����ϴ� ���̵����� Ȯ���ϱ� 
			boolean isLogin = false;
			
			for(int i=0; i<id.length; i++) {//���̵� �迭���� Ȯ�� ����
				if(id[i]!=null && id[i].equals(inputID)
						&& pw[i].equals(inputPW)) {//���̸� �ȵǰ� �����ϴ� ���̵��̸� true
			//if(id[i].equals(inputID) && id[i]!=null) /�߸��� �ڵ� �����߻���
					isLogin = true;
					indexCount = i;
					break;
				}
			}
			
			//System.out.println(indexCount + " : " + inputID + id[indexCount]); //�߰�Ȯ���ڵ�
			
			
			if(isLogin) {
				//System.out.println("�α��μ���");
				System.out.println(inputID + "���� �α��� �Ͽ����ϴ�.");
				
				
				while(isLogin) { //�۾��ݺ�
				
				System.out.println("1.�Ա� 2.��� 3.Ȯ�� 4.����");
				
				int selectNum = Integer.parseInt(sc.nextLine());
				
				switch(selectNum) {
				case 1:
					System.out.println("�Ա� / �Ա��� �ݾ��� �Է����ּ���");
					account[indexCount] += Integer.parseInt(sc.nextLine());
					System.out.println(inputID + "���� �ܾ� : " + account[indexCount]);
					break;
				case 2:
					System.out.println("��� / ����� �ݾ��� �Է����ּ���");
					account[indexCount] -= Integer.parseInt(sc.nextLine());
					System.out.println(inputID + "���� �ܾ� : " + account[indexCount]);
					break;
				case 3:
					System.out.println(inputID + "���� �ܾ� : " + account[indexCount]);
					break;
				case 4:
					System.out.println("�α׾ƿ�");
					inputID = null; // �Է��ߴ� ���̵� �����ֱ� �α׾ƿ� ���� �Է¹ޱ⿡ �Ƚ��൵ ũ�� ������ ����
					isLogin = false; // ���������� �ڵ�
					break;
				default:
					System.out.println("�Է¿���");
					
				}
			}
				
				
				
			}else {
				//System.out.println("�α��ν���");
				inputID = null;
			}
			
			// �� ���̵� (indexCount)�� ���°�� �����ϴ��� Ȯ���ϱ�
		}
		public void adminMenu() {
			

			boolean isAdminLogin = true;
			
			while(isAdminLogin) {
				System.out.println("������ ����");
				
				System.out.println ("1.�����߰� 2.�������� 3.��� ����� ���� ��ȸ "
									+ "4.id�� Ư�� ����� ���� Ȯ�� 5.����");
				
				
				System.out.println("�޴� ����");
				int selectNum = Integer.parseInt(sc.nextLine());
				
				switch(selectNum) {
				case 1:
					System.out.println(" ���� �߰� ");
					
					System.out.println("���̵� �Է� : ");
					id[listCount] = sc.nextLine();
					System.out.println("�н����� �Է� : ");
					pw[listCount] = sc.nextLine();
					account[listCount] = 0;
					
					listCount++; //������ �߰������� ++
					
					System.out.println("���� �߰� �Ϸ�");
					break;
				case 2:
					System.out.println(" ���� ���� ");
					
					System.out.println("���̵� �Է� : ");
					String deleteID = sc.nextLine();
					
					int findIndex = -1;
					
					for(int i=0; i<listCount; i++) {
						if(id[i].equals(deleteID)) {
							findIndex = i;
							break;
						}
					}					
					
					if(findIndex<0) {
						System.out.println("���� ���̵� �Դϴ�.");
					}else {
						//�迭�� ����� �ϳ��� ���ܿ��� ����
						for(int i=findIndex; i<id.length-1; i++) {
							id[i] = id[i + 1];
							pw[i] = pw[i + 1];
							account[i] = account[i + 1];
						}
						listCount --;
						System.out.println("�����Ǿ����ϴ�");
					}
					
					break;
				case 3:
					
					System.out.println("��� ����� ���� ��ȸ : ");
					
					for(int i=0; i<listCount; i++) {
						System.out.println("---------------------" + i);
						System.out.println("���̵� : " + id[i]);
						System.out.println("�н�����  : " + pw[i]);
						System.out.println("account : " + account[i]);
					}
					if(listCount==0) {
						System.out.println("�����Ͱ� �����ϴ�");
					}
					break;
				case 4:
					System.out.println("ã�� ������ �Է����ּ���");
					System.out.println("���̵� : ");
					String findID = sc.nextLine();
					
					boolean isFind = false;
					
					for(int i=0; i<listCount; i++) {
						if(id[i].equals(findID)) {
							System.out.println("���̵� : " + id[i]);
							System.out.println("�н�����  : " + pw[i]);
							System.out.println("account : " + account[i]);
							isFind = true;
						}
					}
					if(isFind==false) { //or !isFind
						System.out.println("���� ���̵� �Դϴ�");
					}
					//�Ҹ��� ��� �Ǵ� �Ʒ������ �̿� 
//					int i=0;
//					for(i=0; i<listCount; i++) {
//						if(id[i].equals(findID)) {
//							System.out.println("���̵� : " + id[i]);
//							System.out.println("�н�����  : " + pw[i]);
//							System.out.println("account : " + id[i]);
//						}
//					}
//					if(int i == listCount) {
//						System.out.println("���� ���̵� �Դϴ�");
//					}
					
					break;
				case 5:
					isAdminLogin = false;
					inputID = null;
					break;
				default:
					System.out.println("�Է� ����");
				}
			}				
			/*�迭�߰� ���
			 List(���ӵ� ������) �����͸� ����� �� �ڸ��� �ؿ� �κ��� �ö�ͼ� ä���� 
			 �迭 :: �����͸� ����� �� ������ ������� 
			 listCount �߰� 0�̸� 0�κκп� �߰��ؼ� 1�� �����
			 */

			
		}
		public void mainMenu() {

			//���̵� �ϳ�, �н����� �ϳ� �Է��ϴ� ����
			System.out.println("���̵�� �н����带 �Է����ּ���");
			System.out.println("���̵� : ");
			inputID = sc.nextLine();
			if(inputID.equals("exit")) { //exit�� �Է��ϸ� ���������� ����
				return;
			}
			System.out.println("�н����� : ");
			inputPW = sc.nextLine();
		}
		
		public void play() {
			while(true) { //���̵�� �н�����
				
				mainMenu();

				if(inputID==null) { // ���̵��� ���� null���� �ƴ��� Ȯ�� .�� ��ԵǸ� ���� �߻�
					
				}else if(inputID.equals("exit")) { //exit�� �Է��ϸ� ���������� ����
					
					break;
				}else if(inputID.equals("admin") && inputPW.equals("admin")) { //������ �α���
				
					adminMenu();

				}else { 
					userMenu();
				}
	}
		}

		
	}

public class BankClass {
	
	public static void main(String[] args) {
		Bank b1=new Bank();
		b1.play();
	

}
}
