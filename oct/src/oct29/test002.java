package oct29;

import java.util.Scanner;

public class test002 {

	
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		
		
		while(true) {
			
			//�ִ� 100���� ������ ���� �� �� �ִ�.
			String id[] = new String[100]; // ȸ�� ���̵�
			int[] pw = new int[100]; // ȸ�� ��й�ȣ 
			int[] save = new int[100]; // ȸ������ ���� 
			
			id[0] = "ȫ�浿";
			pw[0] = 1234;
			
			
			
						System.out.println("���̵�� �н����带 �Է����ּ���");
						String ID = sc.nextLine();
						if(ID.equals("exit")){
							System.out.println("����");
							break;
						}
						int PW = sc.nextInt();
						int money = 0;
						
						if(ID.equals(id[0])) {
							
							if(ID.equals(id[0]) && PW==pw[0]) {
								System.out.println("ȸ�� " + id[0]+ " ���� �α��� �ϼ̽��ϴ�");
								while(true) { //4�� �ƴ� ���� ������ �ݺ�
									System.out.println("1.�Ա� 2.��� 3.��ȸ 4.����");
									int go = sc.nextInt();
										if (go == 1) {
											System.out.println("�Ա��� �ݾ�");
											int deposit = sc.nextInt();
											money += deposit;
										}else if (go == 2) {
											System.out.println("����� �ݾ�");
											int withdraw = sc.nextInt();
											money -= withdraw;
											if(money<withdraw) {
												System.out.println("���� �ܰ� Ȯ���� �ּ���");
											}
										}else if (go == 3) {
											System.out.println("�����ܰ�" + money);
										}else {
											break;
										}
								}
								
							}
						}else if(ID.equals("admin")){
							if(PW==pw[0]) {
								System.out.println("������ " + ID + " ���� �α��� �ϼ̽��ϴ�");
								while(true) {
									System.out.println("1.���� �߰� 2.���� ���� 3.��� ����� ���� Ȯ�� 4.id�� Ư�� ����� ���� Ȯ�� 5.����");
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
								System.out.println("��ϵ� ���̵� �ƴմϴ�.");
							}
							
						}else if(ID.equals("exit")){
							System.out.println("����");
							break;
						}else {
							System.out.println("��ϵ� ���̵� �ƴմϴ�.");
						}

				
				
				
				
				
				
				
			}
		
		
		
		
		
	}
}
