package oct29;

import java.util.Arrays;
import java.util.Scanner;

public class javaTest002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		

		while(true) {
			
				System.out.println("���̵�� �н����带 �Է����ּ���");
				String id = sc.nextLine();
				int pw = sc.nextInt();
				int input = 9;
				int money = 0;
				
				if(id.equals("ȫ�浿")&&pw==1234) {
					
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
					System.out.println("��ϵ� ���̵� �ƴմϴ�.");
				}
				
			
			
		}
		
		
			
		
		
		
	}
}
