package oct28;


import java.util.Arrays;
import java.util.Scanner;

public class test002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		//����1 )�迭 a�� 1,2,3 �� ���� �� �迭 ���� ��� ���� 2�� ���� ���� 
		//3,4,5�� ������ ������ �迭�� ������ ȭ�鿡 ����ϴ� �������� �ڵ带 �����Ͽ� ����.

		
//		int[] arr = {1, 2, 3};
//
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] += 2;
//			System.out.println("arr[" + i + "] = " + arr[i]);
//		}
		
		
		
		
		
		
		
		//���� 2) �迭 a[10]�� 3�� ����� ���� ������ �迭�� ������ ����ϴ� �������� �ǻ��ڵ带 ����� ����.

//		int[] a = new int[10];
//		
//		for(int i=0; i<a.length; i++) {
//			a[i] = 3*(i+1);
//			System.out.println("a[" + i + "]=" + a[i]);
//			
//		}
		
		
		
		
		
		
		
		
		
		//���� 3) �迭 a[100]�� 1���� 100������ ���ڸ� ������� ���� ���� �迭�� �ε����� 
		//¦���� �迭�� ��� �ִ� ���� ����ϴ� �ڵ带 ����� ����.
		
		
//		int[] a = new int[100];
//		
//		for(int i=0; i<a.length; i++) {
//			a[i] = i+1;
//			if(a[i]%2==0) {
//				System.out.println("a[" + i + "]=" +a[i]);
//			}
//		}
//
//		for(int i=0; i<a.length; i++) {
//			a[i] = i+1;
//			if(i%2==0) {
//				System.out.println("a[" + i + "]=" +a[i]);
//			}
//		}
		
		
		
		
		
		
		
		//���� 4) �迭 a[]={12,1,5,3,6,8,5,3}�� ���� ������ 
		//	         �迭�� ��� ������ ���� ���� sum�� �����Ͽ� ����ϴ� �ڵ带 ����� ����.
			
//		int[] a = {12, 1, 5, 6, 6, 8, 5, 3};
//		int sum=0;
//		for(int i=0; i<a.length; i++) {
//			sum += a[i];
//		}
//		System.out.println("����: " + sum);
		
//		//��Ǯ�� 
//		int[] a = {12, 1, 5, 6, 6, 8, 5, 3};
//		int sum = 0;
//		for(int i=0; i<a.length; i++) {
//			sum += a[i];
//		}
//		System.out.println(sum);
//		//for(�ϳ��� ������ : [�迭�̳� �÷���])
//		sum = 0; 
//		for(int i:a) { // a�� �ִ� ������ i�� �ϳ��� ����Ǹ鼭 �ݺ���  (only�б���)
//			sum += i;
//		}
//		System.out.println(sum);
//		
//		//�б���
//		for(int i:a) {
//			i=0;
//		}
//		System.out.println(Arrays.toString(a));
//		
//		//��ü�ǰ��
//		Human aH[]= {
//				new Human("ȫ",1,1),
//				new Human("ȫ",12,12),
//				new Human("ȫ",13,13),;
//		}
//		
//		for(Human h:aH) {
//			h.age=100; // ���� �����Ͱ� �����
//			h = new Human("ȫ1",99,99);//���� �����Ͱ� ������� ����
//		}
//		System.out.println(Arrays.toString(aH));
		
		
		
		
		
		
		
		//���� 5) a[]={12,1,5,3,6,8,5,3}�� a�迭����
		//	      �迭 ���� ���ڰ� ¦���� 12,6,8 �� ���� ���� ��� ���� ����ϴ� ���α׷��� �ۼ��� ����.
		
		
//		int[] a = {12, 1, 5, 3, 6, 8, 5, 3};
//		int sum = 0;
//		
//		for(int i=0; i<a.length; i++) {
//			if(a[i]%2==0) {
//				sum += a[i];
//			}
//		}
//		System.out.println("¦���� ����: " + sum);
		
		
		
		
		
		
		
		
		//���� 6) a[]={12,1,51,3,6,8,5}�� a�迭���� 
		//		���� ū ���� ���� ���� ���� ���ϴ�  ���α׷��� �ۼ��� ����.
		
//		int[] a = { 12, 1, 51, 3, 6, 8, 5};
//		
//		int max = 12;
//		int min = 12;
//		
//		for(int i=0; i<a.length; i++) {
//			if(min>a[i]) {
//				int temp = min; 
//				min = a[i];
//				a[i] = temp;
//			}
//			if(max<a[i]) {
//				int temp = max;
//				max = a[i];
//				a[i]= temp;
//			}
//		}
//		int sum = max + min;
//		System.out.println("ū�� " + max + "�� ���� �� " + min + "�� ���� " + sum);
		
		
		
		
	
		//1.�迭�� 5���� ���ڸ� �Է¹޾� ���� ���� ���� �ϳ��� �Է¹޾� 
		//��  �ش� ���ڰ� ���° �ε����� ��� �ִ��� ����ϴ� ���α׷��� ����� ����.

//		int[] arr = { 10, 20, 30, 40, 50 };
//		System.out.print("ã�� ��(10/20/30/40/50): ");
//		int findArr = sc.nextInt();
//
//		
//		for (int i = 0; i < arr.length; i++) {
//			if (findArr == arr[i]) {
//				System.out.println("arr[" + i + "]�� ��ġ");
//				break;
//			}
//		}
		
		
		
		
		
		//2.�迭�� 5���� ���ڸ� �Է¹޾� ���� ���� ���� �ϳ��� �Է¹޾�
		//�ش� ���ڰ� ���° �ε����� ��� �ִ��� ����ϴ� ���α׷��� ����� ����.
		
		
//		String[] str = {"����", "�ϱⰡ", "������", "�ľ˸���", "������ϴ�"};
//		
//		System.out.println("\"����/�ϱⰡ/������/�ľ˸���/������ϴ�\" ��1");
//		String findStr = sc.nextLine();
//		
//		for(int i=0; i<str.length; i++) {
//			if(str[i].equals(findStr)) {
//				System.out.println("str[" + i + "]�� ��ġ");
//			}
//
//		}
		
		
		
		
		
		//3.�迭 ũ�⸦ �Է¹޾� �迭 ũ�� ��ŭ 1,2,3,1,2,3,1,2,3 �� 
		//���ڸ� ������� �迭�ȿ� �������� �迭�� ������ ����� ����.
			
//		System.out.print("�����Է�");
//		int i = Integer.parseInt(sc.nextLine());
//		
//		int[] num = new int[i];
//		
//		for(int j=0; j<i; j++) {
//			num[j] = j%3+1;
//			System.out.println("numj[" + j + "]=" + num[j]);
//		}
		
		


		
		//4.�迭�� ����ִ� ������ ������ �������� �����ϴ� ���ο� �迭�� ����� ����� ����.
		
		//4-1
//		System.out.print("�����Է�");
//		int i = Integer.parseInt(sc.nextLine());
//		int[] num = new int[i];
//		int count = 0;
//		
//		for(int j=0; j<i; j++) {
//			num[j] = ++count;
//			System.out.print(num[j] + "\t");
//			}
//		for(int j=i-1; j>=0; j--) {
//			System.out.print(num[j] + "\t");
//		}
		
		//4-2
//		int i;
//		System.out.println("�����Է�");
//		int numNum = sc.nextInt();
//		int[] num = new int[numNum];
//		for(i=0; i<num.length; i++) {
//			int num2 = (int)(Math.random()*99+1);
//			num[i] = num2;
//			System.out.print("���� �� : " + num[i] + "\t");
//		}
//		System.out.println();
//		for(i=num.length-1; i>=0; i--) {
//			System.out.print(num[i] + "\t");
//		}
//		for(i=0; i<num.length; i++) {
//				System.out.print(num[i]+"\t");
//		}
		
		
		
		
		

		//5.�迭 1,2,3,4,5,6,7,8,9 ���� �̵�����, �̵�ĭ��, ä����ڸ� 
		//�Է� �޾� �迭�� ������ ������ ����غ���.
//		 System.out.print("���� or ������ : ");
//		 String move = sc.next();
//		 System.out.print("�̵�ĭ�� : ");
//		 int moveCount = sc.nextInt();
//		 System.out.print("�� ������ ä�� ���� ���� : ");
//		 int num = sc.nextInt(); 
//		 int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		 int[] arrArr = new int[arr.length];
//		 int i;
//		 
//		 if(move.equals("����")) {
//			 for(i=0; i<arr.length; i++) {
//				 if(i<arr.length-moveCount) {
//					 arrArr[i] = arr[i+moveCount];
//				 }else {
//					 arrArr[i] = num;
//				 }
//			 }
//		 }else if(move.equals("������")){
//			 for(i=0; i<arr.length; i++) {
//				 if(i<moveCount) {
//					 arrArr[i] = num;
//				 }else {
//					 arrArr[i] = arr[i-moveCount];
//				 }
//			 }
//		 }else {
//			 System.out.println("�Է¿���");
//		 }
//		 System.out.println(Arrays.toString(arrArr));
		

		
 
//		//��Ǯ��
//		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		String direction = "";
//		int moveCount = 0;
//		int changeNum = 0;
//		
//		moveFunc(a, direction,moveCount,changeNum);
//	
//		System.out.println(Arrays.toString(a));
//	}
//
//	private static void moveFunc(int[] a, String direction, int moveCount, int changeNum) {
//		 for(int j=0; j<moveCount;j++) {
//		 int temp = a[a.length-1];
//		 if(changeNum>=0) {
//			 temp = changeNum;
//		 }
//		 for(int i=a.length-2; i>=0;i--) {
//			 a[i+1]=a[i];
//		 }
//		 a[0]=temp;
//	 }

	
		

		

		
		

//		//6.�迭 1,2,3,4,5,6,7,8,9 ���� ȸ������� 
//		//ȸ���� �Է¹޾� �迭 ������ ȸ����Ű�� ����غ���.
//		//ex)��2 = 3,4,5,6,7,8,9,1,2 / ��3 = 7,8,9,1,2,3,4,5,6
		
//		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//		int[] arrArr = new int[arr.length];
//		
//		System.out.println("�����Է�");
//		int num = sc.nextInt();
//		System.out.println("���� or ������");
//		String str = sc.next();
//		int count = 0;
//		
//		
//		if(str.equals("����")) {
//			for(int j=0; j<arr.length-num; j++) {
//				arr[j] = arr[j+num];
//			}
//			for(int j=arr.length-num; j<arr.length; j++) {
//				arr[j] = ++count;
//			}
//			System.out.println(Arrays.toString(arr));
//		}else {
//				
//			for(int j=0; j<num; j++) {
//				arr[j] = arr[arr.length-num+j];
//			}
//			for(int j=num; j<arr.length; j++) {
//				arr[j] = ++count;
//			}
//			System.out.println(Arrays.toString(arr));
//		}
			
		
		
		
		//��Ǯ��
//		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		String direction = "";
//		int moveCount = 0;
//		int changeNum = 0;
//		
//		moveFunc(a, direction,moveCount,changeNum);
//	
//		System.out.println(Arrays.toString(a));
//}
//
//	private static void moveFunc(int[] a, String direction, int moveCount, int changeNum) {
//		 for(int j=0; j<moveCount;j++) {
//		 int temp = a[a.length-1];
//		 if(changeNum>=0) {
//			 temp = changeNum;
//		 }
//		 for(int i=a.length-2; i>=0;i--) {
//			 a[i+1]=a[i];
//		 }
//		 a[0]=temp;
//	 }
		
		

		
		
		//7.�迭�� 100�� �����Ͽ� 0~99���� ���� ���� i=2 ���� 50����
		//i�� ������ i�� ����� ���� �ε����� 0�� ���� ���� �迭�� 0�� �ƴ� ���� ����� ����. 
		
//		int[] arr = new int[100];
//		
//		for(int j=0; j<arr.length; j++) {
//			arr[j] = j;
//		}
//		
//		for(int i=2; i<50; i++) {
//			if((i+i)%2==0) 
//				arr[i+i] = 0;
//		}
//		
//		for(int i:arr) {
//			if(i != 0) {
//				System.out.print(i+",");
//			}
//		}
//
//		System.out.println(Arrays.toString(arr));
		
		
//		//��Ǯ��
//		int arr[] = new int[100];
//		for(int k=0; k<100; k++) {
//			arr[k] = k;
//		}
//		
////		int i=3;
//		for(int i=2; i<50; i++) {
//			for(int j=i+i; j<=99; j += i) {
//				arr[j]=0;
//			}
//		}
////		for(int i:arr) {
////			if(i != 0) {
////				System.out.print(i+"\t");
////			}
////		}
//		System.out.println(Arrays.toString(arr));
		
		
		
		//8.��ǻ�Ϳ��� �ֻ��������� ���α׷��� �����Ͽ����� ������
		//���¼��� ��(ȸ��)�� ���ϴ� ���α׷��� �ۼ��� ����.
		
		
//		int diceCount = 0;
//		int one = 0;
//		int two = 0;
//		int three = 0;
//		int four = 0;
//		int five = 0;
//		int six = 0;
//		System.out.print("�ֻ��� ���� Ƚ�� �Է� :");
//		int game = sc.nextInt();
//		
//		for(int i=1; i<=game; i++) {
//			int dice = (int)(Math.random()*6+1);
//			if(dice==1) {
//				one++;
//				diceCount++;
//			}else if(dice==2) {
//				two++;
//				diceCount++;
//			}else if(dice==3) {
//				three++;
//				diceCount++;
//			}else if(dice==4) {
//				four++;
//				diceCount++;
//			}else if(dice==5) {
//				five++;
//				diceCount++;
//			}else if(dice==6) {
//				six++;
//				diceCount++;
//			}
//		}
//		
//		System.out.println(diceCount+ "���� ���� �� \n"
//							+ " \n�ֻ��� 1 : " + one + " ȸ Ȯ�� : "+(one%diceCount) + "%"
//							+ " \n�ֻ��� 2 : " + two + " ȸ Ȯ�� : "+(two%diceCount)+ "%"
//					  		+ " \n�ֻ��� 3 : " + three + " ȸ Ȯ�� : "+(three%diceCount)+ "%"
//					  		+ " \n�ֻ��� 4 : " + four + " ȸ Ȯ�� : "+(four%diceCount)+ "%"
//					  		+ " \n�ֻ��� 5 : " + five + " ȸ Ȯ�� : "+(five%diceCount)+ "%"
//					  		+ " \n�ֻ��� 6 : " + six + " ȸ Ȯ�� : "+(six%diceCount)+ "%");
		
		
		//��Ǯ��
//		int arr[] = {0, 0, 0, 0, 0, 0};
//		
//		for(int i=0; i<2000; i++) {
//			int rNum = (int)(Math.random()*6);
//			arr[rNum]++;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		//���ĺ� �󵵼� 'a'-'a'==0 'b'-'a'=1 
		
		
		
		
		
		
		
		//9.50���� �л��� �⼮ ������  �����ϴ� �Ʒ��� ���� �޴��� ���� ���α׷��� ����� ����. 
		//�޴�: 1.��ü �⼮���� 2.�Ἦ�� �߰� 3.�⼮�� �߰� 4.������ �߰� 5.������ �߰� 6.���α׷� ����
		
		int[] check = new int[50];
		int[] student = {0, 0, 0, 0};
		int sum = 0;
		
		End:
		for(int i=0; i<check.length; i++) {
			System.out.println("\n1.��ü �⼮���� 2.�Ἦ�� �߰� 3.�⼮�� �߰� 4.������ �߰� 5.������ �߰� 6.���α׷� ����");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("��ü �⼮ ���� : " + sum + "�� �� \n"
						+ "�Ἦ�� : "+ student[0] + "�� /�⼮ : " + student[1] + "�� /���� : " + student[2] + "�� /���� : " + student[3] + "��");
				break;
			case 2:
				student[0] ++;
				sum++;
				break;
			case 3:
				student[1] ++;
				sum++;
				break;
			case 4:
				student[2] ++;
				sum++;
				break;
			case 5:
				student[3] ++;
				sum++;
				break;
			default:
				break End;
				
			}
			System.out.println("��ü �⼮ ���� : " + sum + "�� �� \n"
					+ "�Ἦ�� : "+ student[0] + "�� /�⼮ : " + student[1] + "�� /���� : " + student[2] + "�� /���� : " + student[3] + "��");

			
		}

		
		
//		End:
//		while(true) {
//			System.out.println("1.��ü �⼮���� 2.�Ἦ�� �߰� 3.�⼮�� �߰� 4.������ �߰� 5.������ �߰� 6.���α׷� ����");
//			int select = sc.nextInt();
//		
//			switch(select) {
//			case 1:
//				System.out.println("��ü �⼮����");
//				break;
//			case 2:
//				absence++;
//				student++;
//				break;
//			case 3:
//				attendance++;
//				student++;
//				break;
//			case 4:
//				early++;
//				student++;
//				break;
//			case 5:
//				late++;
//				student++;
//				break;
//			case 6:
//				System.out.println("��ü �⼮ ���� : " + student + "�� ��");
//				break End;
//			}
//			if(student==50) {
//				System.out.println("��ü �⼮üũ �Ϸ�");
//				System.out.println("�Ἦ�� : " + absence + " �⼮�� : " + attendance + " ������ : " + early + " ������ : " + late);
//				break End;
//			}
//			
//		}
//		
//		System.out.println("�Ἦ�� : " + absence + " �⼮�� : " + attendance + " ������ : " + early + " ������ : " + late);
//		
		
		
		
	}

}
