package oct29;

import java.util.Scanner;

public class test002 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		
		int lol = 9;
		while( lol != 3) {
						System.out.println("���̵�� �н����带 �Է����ּ���");
						String id = sc.nextLine();
						int pw = sc.nextInt();
						int input = 9;
						int money = 0;
						
						if(id.equals("ȫ�浿")) {
							
							if(pw==1234) {
								System.out.println("ȸ��" + id+ "���� �α��� �ϼ̽��ϴ�");
								while(input != 4) { //4�� �ƴ� ���� ������ �ݺ�
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
								
							}else {
								System.out.println("��й�ȣ ����");
							}
						}else if(id.equals("admin")){
							if(pw==1234) {
								System.out.println("������" + id+ "���� �α��� �ϼ̽��ϴ�");
								while(input != 4) {
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
							}
							
						}else {
							System.out.println("��ϵ� ���̵� �ƴմϴ�.");
						}
				
			

				
				
				
				
				
				
				
			}
		
		
		
		
		
	}
}
