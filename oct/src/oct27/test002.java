package oct27;

import java.util.Scanner;

public class test002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		
		for(int i=1; i<=100; i++) {
			if(i/10==3||i/10==6||i/10==9) {
				System.out.println("¦¦");
			}else if(i%10==3||i%10==6||i%10==9) {
				System.out.println("¦");
			}else {
			System.out.println(i);
			}
		}
		
		
		
		
		
//		int num = (int)(Math.random()*9+1);
//		int o = 0; 
//		int x = 0;
//		
//
//		while(true) {
//			System.out.print("�����Է� : ");
//			int i = Integer.parseInt(sc.nextLine());
//			
//			if(i==num) {
//				o++;
//				System.out.println("�����Դϴ�  \n");
//				break;
//			}else {
//				System.out.print("�����Դϴ� ::");
//				x++;
//				if(i>num) {
//					System.out.println("���� ���� ���� �Է����ּ���\n");
//				}else {
//					System.out.println("���� ū ���� �Է����ּ���\n");
//				}
//			}
//		}
//		System.out.println("���� ��" + (o+x) + "ȸ ��°�� ����");
		
		

		
	}

}
