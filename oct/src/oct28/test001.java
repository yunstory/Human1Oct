package oct28;

import java.util.Scanner;

public class test001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		for(int count=0;count<1000;count++) {
//			if(f369(count)) {//�ڼ�ġ�� �Լ�
//			System.out.print(count);//������� �κ�
//			}
//			System.out.print("\t");
//			if((count+1)%10==0){
//			System.out.println();
//			}
//
//			}
//
//
//			}
//
//			public static boolean f369(int count) {
//			//369 returnValue �ڼ���ġ�� true
//			boolean isReturnFlag=true;
//			while(count!=0) {
//			if(count%10%3==0&&count%10!=0) {
//			System.out.print("¦");
//			isReturnFlag=false;
//			}
//			count=count/10;
//			}
//			return isReturnFlag;
//			}
		
		
		
		
		int age = 10;
		int sum = 0;
		int totalP1 = 0;
		int totalP2 = 0;
		int totalP3 = 0;
		
		while ( age != 4) {
			
		System.out.println("1.����\t2.û�ҳ�\t3.����/���\t4.���");
		age = Integer.parseInt(sc.nextLine());
		if(age==4) {
			System.out.println("����: " + totalP1 + "��" + "û�ҳ�: " + totalP2 + "��" + "����/���: " + totalP3 + "��" + "�����ݾ�: " + sum + "��");
			break;
		}
		System.out.println("�ο� �� �Է�");
		int people = Integer.parseInt(sc.nextLine());
		System.out.println("1.�ְ���(1��) \t 2.���ı�(15��~) \t 3.���;߰���(17��~) \t 4.2�ϱ�");
		int ticket = Integer.parseInt(sc.nextLine());	
			
			
		switch(age) {
		case 1:
			if(ticket==1) {
				sum += people*46000;
				System.out.println("���� / �ְ��� ���� / �ο���" + people + "/ �� �ݾ� = " + sum);
			}else if(ticket==2){
				sum += people*38000;
				System.out.println("���� / ���ı� ���� / �ο���" + people + "/ �� �ݾ� = " + sum);
			}else if(ticket==3){
				sum += people*20000;
				System.out.println("���� / ���;߰��� ���� / �ο���" + people + "/ �� �ݾ� = " + sum);
			}else {
				sum += people*74000;
				System.out.println("���� / 2�ϱ� ���� / �ο���" + people + "/ �� �ݾ� = " + sum);
			}
			totalP1 += people;
			
			break ;
		case 2:
			if(ticket==1) {
				sum += people*39000;
				System.out.println("û�ҳ� / �ְ��� ���� / �ο���" + people + "/ �� �ݾ� = " + sum);
			}else if(ticket==2) {
				
				sum += people*32000;
				System.out.println("û�ҳ� / ���ı� ���� / �ο���" + people + "/ �� �ݾ� = " + sum);
			}else if(ticket==3) {
				sum += people*17000;
				System.out.println("û�ҳ� / ���;߰��� ���� / �ο���" + people + "/ �� �ݾ� = " + sum);
			}else {
				sum += people*62000;
				System.out.println("û�ҳ� / 2�ϱ� ���� / �ο���" + people + "/ �� �ݾ� = " + sum);
			}
			totalP2 += people;
			break ;
		case 3:
			if(ticket==1) {
				sum += people*36000;
				System.out.println("����/��� / �ְ��� ���� / �ο���" + people + "/ �� �ݾ� = " + sum);
			}else if(ticket==2) {
				sum += people*29000;
				System.out.println("����/��� / ���ı� ���� / �ο���" + people + "/ �� �ݾ� = " + sum);
			}else if(ticket==3) {
				sum += people*16000;
				System.out.println("����/��� / ���;߰��� ���� / �ο���" + people + "/ �� �ݾ� = " + sum);
			}else {
				sum += people*58000;
				System.out.println("����/��� / 2�ϱ� ���� / �ο���" + people + "/ �� �ݾ� = " + sum);
			}
			totalP3 += people;
			break;
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

		

	


