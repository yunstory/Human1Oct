package oct29;

import java.util.Scanner;

public class test002 {

	
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		
		
	
			
		//�ִ� 100���� ������ ���� �� �ִ�.
		String id[] = new String[100]; // ȸ�� ���̵�
		int[] pw = new int[100]; // ȸ�� ��й�ȣ 
		int[] save = new int[100]; // ȸ������ ���� 
		
		int addList = 1; // �����߰��� ���� �ʿ��� �ڵ� �����ڴ� 0�� �ε��� ���� ��� 1
		
		id[0] = "admin"; //�����ھ��̵�
		pw[0] = 1234; //������ ��й�ȣ 
			
		
		while(true) {
			
			System.out.print("���̵� �Է����ּ��� : ");
			String idID = sc.next();
			if(idID.equals("exit")) { // exit �Է½� ���α׷��� ����ȴ�.
				break;
			}
			System.out.print("��й�ȣ�� �Է����ּ��� : ");
			int pwPW = sc.nextInt();
			
			
			if(idID.equals("admin") && pwPW==1234) { 
				//������ ���� ���� ��� 
				System.out.println(" ������ " + idID + " ���� �α��� �ϼ̽��ϴ�.\n");
				boolean adminArea = true;
				
				while(adminArea) { // �����ڰ� �α׾ƿ� �ϱ� �� ���� �ݺ��Ǵ� ���� 
					System.out.println ("1.�����߰� 2.�������� 3.��� ����� ���� ��ȸ "
									  + "4.id�� Ư�� ����� ���� Ȯ�� 5.����(�α׾ƿ�)");
					int adminSel = sc.nextInt();
					
					switch(adminSel) {
					
					case 1:
						// ���̵�� ��й�ȣ �׸��� ������ ������ ���� �߰� 
						System.out.print("�����߰� ID : ");
						id[addList] = sc.next();
						System.out.print("�����߰� PW : ");
						pw[addList] = sc.nextInt();
						save[addList] = 0; // ���� ������  �ܾ��� 0������ ����
						
						addList++; // ������ �߰������� �ε��� ++
						
						System.out.println("�����߰� �Ϸ�\n");
						
						break;
					case 2:
						System.out.print("�������� ID : ");
						idID = sc.next();
						
						int find = -1; // �ε����� ��ȣ�� 0 ����
						for(int i=0; i<addList; i++) {
							if(id[i].equals(idID)) { //�Է���ID�� ��Ͽ� �ִ� ID�� ��ġ�ϴ��� ã��
								find = i; // ���°���� ã�Ҵ��� find�� ����
							}
						}
						
						if (find == 0) {
							System.out.println("������ �� ���� �����Դϴ�.\n"); //������ ���̵�� ���� �� �� ����
						}else if(find < 0){
							System.out.println("���� ���� �Դϴ�.\n"); 
						}else {
							for(int i=find; i<id.length-1;) {
								System.out.println("�����ϸ� �ǵ����� �����ϴ�. 1.���� 2.����");
								int del = sc.nextInt();
								if(del==1) {
									//���̵�� ��й�ȣ �׸��� ������ ����� �迭�� ��ĭ�� ���ܿ� �����ϴ� ����
									id[i] = id[ i + 1 ];
									pw[i] = pw[ i + 1 ];
									save[i] = save[ i + 1];
									break;
								}else {
									System.out.println();
									break;
								}
							}
							System.out.println(idID + "���� ������ �����Ǿ����ϴ�.\n");
							addList--; // ������ ���������� �ε��� --
						}						
						
						break;
					case 3:
						for(int i=1; i<addList; i++) { // ~ �ԷµǾ� �ִ� �������� �˻�
							System.out.println("--------------------------------------------");
							System.out.println("���̵� : " + id[i] + "\t�н�����  : " + pw[i] + "\taccount : " + save[i]);
							System.out.println("--------------------------------------------");
						}
						
						if(addList<0) { // �ε��� 0�� ������ �����̹Ƿ� 0���� ������ �Ʒ�
							System.out.println("�����Ͱ� �����ϴ�\n");
						}
						
						break;
					case 4:
						System.out.print("��ȸ�� ������ �Է����ּ��� : ");
						idID = sc.next();
						boolean findID = false; 
						
						for(int i=0; i<addList; i++) {
							if(id[i].equals(idID)) {
								System.out.println("���̵� : " + id[i] + "\t�н�����  : " + pw[i] + "\taccount : " + save[i] + "\n");
								findID = true; //���� ã�� ���
							}
						}
						if(findID == false) { //���� �� ã�� ���
							System.out.println("�������� �ʴ� �����Դϴ�.\n");
						}
						
						break;
					case 5:
						System.out.println("���� �α׾ƿ� �Ϸ�\n");
						adminArea = false; // ������Ȱ�� ����
						idID = null; // ������ ���̵� ����α׾ƿ� (��������(?))
						break;
						
					}
				}
			}else {
				
				for(int i=0; i<id.length; i++) {
					if(id[i].equals(idID) && pw[i] == pwPW) {
						System.out.println("ȸ�� " + idID + " ���� �α��� �ϼ̽��ϴ�.\n");
						addList = i; //ȸ�������� �ҷ����� �ڵ� ( ������ �������� �ܰ迡�� Ȯ�� )
						break;
					}
				}
				
				
				
				
				
				
				
			}
			
			
			
		}
			

		
		
		
	}
}
