package oct29;

import java.util.Scanner;

public class test003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id[] = new String[100];
		String pw[] = new String[100];
		
		int account[] = new int[100]; // ��������� ����Ǿ ������ ���ӵǾ�� �ϴ� �κ�!
		
		
		
		id[0] = null;
		pw[0] = null;
		account[0] = 0;
		int listCount = 0;
		
		String inputID = null;
		String inputPW = null;
		
		int indexCount = 0;
		
		boolean bank = true;
		
		while(bank) { //���̵�� �н�����
			
			//���̵� �ϳ�, �н����� �ϳ� �Է��ϴ� ����
			System.out.println("���̵�� �н����带 �Է����ּ���");
			System.out.print("���̵� : ");
			inputID = sc.nextLine();
			if(inputID.equals("exit")) { //exit�� �Է��ϸ� ���������� ����
				break;
			}
			System.out.print("�н����� : ");
			inputPW = sc.nextLine();
			
			
			if(inputID==null) { // ���̵��� ���� null���� �ƴ��� Ȯ�� .�� ��ԵǸ� ���� �߻�
				
			}else if(inputID.equals("exit")) { //exit�� �Է��ϸ� ���������� ����
				
				break;
			}else if(inputID.equals("admin") && inputPW.equals("admin")) { //������ �α���
			
				boolean isAdminLogin = true;
				
				while(isAdminLogin) {
					System.out.println("������ ����");
					
					System.out.println ("1.�����߰� 2.�������� 3.��� ����� ���� ��ȸ "
										+ "4.id�� Ư�� ����� ���� Ȯ�� 5.����");
					
					
					System.out.print("�޴� ���� : ");
					int selectNum = Integer.parseInt(sc.nextLine());
					
					switch(selectNum) {
					case 1:
						System.out.println(" ���� �߰� ");
						
						System.out.print("���̵� �Է� : ");
						id[listCount] = sc.nextLine();
						System.out.print("�н����� �Է� : ");
						pw[listCount] = sc.nextLine();
						account[listCount] = 0;
						
						listCount++; //������ �߰������� ++
						
						System.out.println("���� �߰� �Ϸ�");
						break;
					case 2:
						System.out.println(" ���� ���� ");
						
						System.out.print("���̵� �Է� : ");
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
						
						System.out.println("��� ����� ���� ��ȸ ");
						
						for(int i=0; i<listCount; i++) {
							System.out.println("--------------------------------------------");
							System.out.println("���̵� : " + id[i] + "\t�н�����  : " + pw[i] + "\taccount : " + account[i]);
							System.out.println("--------------------------------------------");
						}
						if(listCount==0) {
							System.out.println("�����Ͱ� �����ϴ�");
						}
						break;
					case 4:
						System.out.println("ã�� ������ �Է����ּ���");
						System.out.print("���̵� : ");
						String findID = sc.nextLine();
						
						boolean isFind = false;
						
						for(int i=0; i<listCount; i++) {
							if(id[i].equals(findID)) {
								System.out.print("���̵� : " + id[i]);
								System.out.print("�н�����  : " + pw[i]);
								System.out.print("account : " + account[i]);
								isFind = true;
							}
						}
						if(isFind==false) { //or !isFind
							System.out.println("���� ���̵� �Դϴ�");
						}
						//�Ҹ��� ��� �Ǵ� �Ʒ������ �̿� 
//						int i=0;
//						for(i=0; i<listCount; i++) {
//							if(id[i].equals(findID)) {
//								System.out.println("���̵� : " + id[i]);
//								System.out.println("�н�����  : " + pw[i]);
//								System.out.println("account : " + id[i]);
//							}
//						}
//						if(int i == listCount) {
//							System.out.println("���� ���̵� �Դϴ�");
//						}
						
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
				
				
				
				
			}else { //�Ϲݻ���ڷα���
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
					
					System.out.print("1.�Ա� 2.��� 3.Ȯ�� 4.���� : ");
					
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
			
}
		

//		//String loginId = ""; // ó���� ����� ���̴�
//		String logingId=null; //�� ���� ã�� ��� (?)
//		//System.out.println(loginId==null); //equals(null) or equals("null") �� Ʋ�����
//		
//		System.out.println(logingId.toString());

	}

}
