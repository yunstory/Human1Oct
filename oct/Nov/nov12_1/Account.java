package nov12_1;

import java.util.Scanner;

//�������� Ŭ���� 
public class Account {

	public static int totalCount = 0; //��� �ֵ��� ���� �� �� �ֵ��� (������ ����) static�� ����
	public int money = 0;  //���ݾ�
	public String id = null; // ���̵�
	public String pw = null; // ��й�ȣ
	
	
	public Account () { //���� ���� �� ���� �ϳ��� ���� 
		totalCount++;
	};
	
	
	public Account(String id, String pw) {
//		super();
		this(); // ������ ȣ�� 
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
		System.out.println("�� ������ �� : " + Account.totalCount  + "\n"); //static
		System.out.println("������ ID : " + id + "\t������ PW: " + pw +"\t\t�ܾ�: " + money);
		System.out.println("--------------------------------------------");

		
		
	}
	
	public void add(int money) { //�Ա�
		this.money += money;
	}
	
	public void min(int money) { //���
		this.money -= money;
	}
	
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		String inputString = null;
		
		
			
		boolean banking = true;
		
		while(banking) {
			System.out.println("1. �Ա� 2.��� 3.����");
			inputString = sc.nextLine();
				
			switch(inputString) {
				case "1":
					display();
					System.out.println("�Աݾ� >> ");
					int money = Integer.parseInt(sc.nextLine()); //�ڵ�����ȯ
					add(money);
					display();
					break;
					
				case "2":
					System.out.println("��ݾ� >> ");
					money = Integer.parseInt(sc.nextLine());
					min(money);
					display();
					break;
					
				case "3":
					System.out.println("���� ����");
					banking = false;
					break;
					
				default:
					System.out.println("�Է� ����");
				}
		}
	}

	

}
