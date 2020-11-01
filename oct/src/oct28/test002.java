package oct28;


import java.util.Arrays;
import java.util.Scanner;

public class test002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		//문제1 )배열 a에 1,2,3 을 넣은 후 배열 내의 모든 값에 2를 더한 값인 
		//3,4,5로 변경한 다음에 배열의 내용을 화면에 출력하는 순서도와 코드를 구현하여 보자.

		
//		int[] arr = {1, 2, 3};
//
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] += 2;
//			System.out.println("arr[" + i + "] = " + arr[i]);
//		}
		
		
		
		
		
		
		
		//문제 2) 배열 a[10]에 3의 배수를 넣은 다음에 배열의 내용을 출력하는 순서도와 의사코드를 만들어 보자.

//		int[] a = new int[10];
//		
//		for(int i=0; i<a.length; i++) {
//			a[i] = 3*(i+1);
//			System.out.println("a[" + i + "]=" + a[i]);
//			
//		}
		
		
		
		
		
		
		
		
		
		//문제 3) 배열 a[100]에 1부터 100까지의 숫자를 순서대로 넣은 다음 배열의 인덱스가 
		//짝수인 배열에 들어 있는 값만 출력하는 코드를 만들어 보자.
		
		
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
		
		
		
		
		
		
		
		//문제 4) 배열 a[]={12,1,5,3,6,8,5,3}를 만든 다음에 
		//	         배열의 모든 내용을 더한 값을 sum에 저장하여 출력하는 코드를 만들어 보자.
			
//		int[] a = {12, 1, 5, 6, 6, 8, 5, 3};
//		int sum=0;
//		for(int i=0; i<a.length; i++) {
//			sum += a[i];
//		}
//		System.out.println("총합: " + sum);
		
//		//쌤풀이 
//		int[] a = {12, 1, 5, 6, 6, 8, 5, 3};
//		int sum = 0;
//		for(int i=0; i<a.length; i++) {
//			sum += a[i];
//		}
//		System.out.println(sum);
//		//for(하나의 데이터 : [배열이나 컬렉션])
//		sum = 0; 
//		for(int i:a) { // a에 있는 내용이 i에 하나씩 복사되면서 반복됨  (only읽기모드)
//			sum += i;
//		}
//		System.out.println(sum);
//		
//		//읽기모드
//		for(int i:a) {
//			i=0;
//		}
//		System.out.println(Arrays.toString(a));
//		
//		//객체의경우
//		Human aH[]= {
//				new Human("홍",1,1),
//				new Human("홍",12,12),
//				new Human("홍",13,13),;
//		}
//		
//		for(Human h:aH) {
//			h.age=100; // 실제 데이터가 변경됨
//			h = new Human("홍1",99,99);//실제 데이터가 변경되지 않음
//		}
//		System.out.println(Arrays.toString(aH));
		
		
		
		
		
		
		
		//문제 5) a[]={12,1,5,3,6,8,5,3}의 a배열에서
		//	      배열 안의 숫자가 짝수인 12,6,8 의 값을 더한 결과 값을 출력하는 프로그램을 작성해 보자.
		
		
//		int[] a = {12, 1, 5, 3, 6, 8, 5, 3};
//		int sum = 0;
//		
//		for(int i=0; i<a.length; i++) {
//			if(a[i]%2==0) {
//				sum += a[i];
//			}
//		}
//		System.out.println("짝수의 총합: " + sum);
		
		
		
		
		
		
		
		
		//문제 6) a[]={12,1,51,3,6,8,5}의 a배열에서 
		//		가장 큰 값과 가장 작은 값을 더하는  프로그램을 작성해 보자.
		
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
//		System.out.println("큰값 " + max + "와 작은 값 " + min + "의 합은 " + sum);
		
		
		
		
	
		//1.배열에 5개의 숫자를 입력받아 넣은 다음 숫자 하나를 입력받아 
		//　  해당 숫자가 몇번째 인덱스에 들어 있는지 출력하는 프로그램을 만들어 보자.

//		int[] arr = { 10, 20, 30, 40, 50 };
//		System.out.print("찾을 값(10/20/30/40/50): ");
//		int findArr = sc.nextInt();
//
//		
//		for (int i = 0; i < arr.length; i++) {
//			if (findArr == arr[i]) {
//				System.out.println("arr[" + i + "]에 위치");
//				break;
//			}
//		}
		
		
		
		
		
		//2.배열에 5개의 문자를 입력받아 넣은 다음 문자 하나를 입력받아
		//해당 문자가 몇번째 인덱스에 들어 있는지 출력하는 프로그램을 만들어 보자.
		
		
//		String[] str = {"정말", "하기가", "귀찮다", "컴알못은", "광광웁니다"};
//		
//		System.out.println("\"정말/하기가/귀찮다/컴알못은/광광웁니다\" 택1");
//		String findStr = sc.nextLine();
//		
//		for(int i=0; i<str.length; i++) {
//			if(str[i].equals(findStr)) {
//				System.out.println("str[" + i + "]에 위치");
//			}
//
//		}
		
		
		
		
		
		//3.배열 크기를 입력받아 배열 크기 만큼 1,2,3,1,2,3,1,2,3 … 
		//숫자를 순서대로 배열안에 넣은다음 배열의 내용을 출력해 보자.
			
//		System.out.print("숫자입력");
//		int i = Integer.parseInt(sc.nextLine());
//		
//		int[] num = new int[i];
//		
//		for(int j=0; j<i; j++) {
//			num[j] = j%3+1;
//			System.out.println("numj[" + j + "]=" + num[j]);
//		}
		
		


		
		//4.배열에 들어있는 내용을 정순과 역순으로 저장하는 새로운 배열을 만들어 출력해 보자.
		
		//4-1
//		System.out.print("숫자입력");
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
//		System.out.println("숫자입력");
//		int numNum = sc.nextInt();
//		int[] num = new int[numNum];
//		for(i=0; i<num.length; i++) {
//			int num2 = (int)(Math.random()*99+1);
//			num[i] = num2;
//			System.out.print("랜덤 값 : " + num[i] + "\t");
//		}
//		System.out.println();
//		for(i=num.length-1; i>=0; i--) {
//			System.out.print(num[i] + "\t");
//		}
//		for(i=0; i<num.length; i++) {
//				System.out.print(num[i]+"\t");
//		}
		
		
		
		
		

		//5.배열 1,2,3,4,5,6,7,8,9 에서 이동방향, 이동칸수, 채울수자를 
		//입력 받아 배열의 내용을 변경후 출력해보자.
//		 System.out.print("왼쪽 or 오른쪽 : ");
//		 String move = sc.next();
//		 System.out.print("이동칸수 : ");
//		 int moveCount = sc.nextInt();
//		 System.out.print("빈 공간을 채워 넣을 숫자 : ");
//		 int num = sc.nextInt(); 
//		 int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		 int[] arrArr = new int[arr.length];
//		 int i;
//		 
//		 if(move.equals("왼쪽")) {
//			 for(i=0; i<arr.length; i++) {
//				 if(i<arr.length-moveCount) {
//					 arrArr[i] = arr[i+moveCount];
//				 }else {
//					 arrArr[i] = num;
//				 }
//			 }
//		 }else if(move.equals("오른쪽")){
//			 for(i=0; i<arr.length; i++) {
//				 if(i<moveCount) {
//					 arrArr[i] = num;
//				 }else {
//					 arrArr[i] = arr[i-moveCount];
//				 }
//			 }
//		 }else {
//			 System.out.println("입력오류");
//		 }
//		 System.out.println(Arrays.toString(arrArr));
		

		
 
//		//쌤풀이
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

	
		

		

		
		

//		//6.배열 1,2,3,4,5,6,7,8,9 에서 회전방향과 
//		//회수를 입력받아 배열 내용을 회전시키고 출력해보자.
//		//ex)왼2 = 3,4,5,6,7,8,9,1,2 / 오3 = 7,8,9,1,2,3,4,5,6
		
//		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//		int[] arrArr = new int[arr.length];
//		
//		System.out.println("숫자입력");
//		int num = sc.nextInt();
//		System.out.println("왼쪽 or 오른쪽");
//		String str = sc.next();
//		int count = 0;
//		
//		
//		if(str.equals("왼쪽")) {
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
			
		
		
		
		//쌤풀이
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
		
		

		
		
		//7.배열을 100개 선언하여 0~99까지 넣은 다음 i=2 부터 50까지
		//i를 제외한 i의 배수와 같은 인덱스에 0를 넣은 다음 배열에 0이 아닌 수를 출력해 보자. 
		
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
		
		
//		//쌤풀이
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
		
		
		
		//8.컴퓨터에서 주사위던지는 프로그램을 구현하였을때 던져서
		//나온수의 빈도(회수)를 구하는 프로그램을 작성해 보자.
		
		
//		int diceCount = 0;
//		int one = 0;
//		int two = 0;
//		int three = 0;
//		int four = 0;
//		int five = 0;
//		int six = 0;
//		System.out.print("주사위 던질 횟수 입력 :");
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
//		System.out.println(diceCount+ "번의 게임 중 \n"
//							+ " \n주사위 1 : " + one + " 회 확률 : "+(one%diceCount) + "%"
//							+ " \n주사위 2 : " + two + " 회 확률 : "+(two%diceCount)+ "%"
//					  		+ " \n주사위 3 : " + three + " 회 확률 : "+(three%diceCount)+ "%"
//					  		+ " \n주사위 4 : " + four + " 회 확률 : "+(four%diceCount)+ "%"
//					  		+ " \n주사위 5 : " + five + " 회 확률 : "+(five%diceCount)+ "%"
//					  		+ " \n주사위 6 : " + six + " 회 확률 : "+(six%diceCount)+ "%");
		
		
		//쌤풀이
//		int arr[] = {0, 0, 0, 0, 0, 0};
//		
//		for(int i=0; i<2000; i++) {
//			int rNum = (int)(Math.random()*6);
//			arr[rNum]++;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		//알파벳 빈도수 'a'-'a'==0 'b'-'a'=1 
		
		
		
		
		
		
		
		//9.50명의 학생의 출석 사항을  저장하는 아래와 같은 메뉴를 가진 프로그램을 만들어 보자. 
		//메뉴: 1.전체 출석사항 2.결석자 추가 3.출석자 추가 4.조퇴자 추가 5.지각자 추가 6.프로그램 종료
		
		int[] check = new int[50];
		int[] student = {0, 0, 0, 0};
		int sum = 0;
		
		End:
		for(int i=0; i<check.length; i++) {
			System.out.println("\n1.전체 출석사항 2.결석자 추가 3.출석자 추가 4.조퇴자 추가 5.지각자 추가 6.프로그램 종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("전체 출석 사항 : " + sum + "명 중 \n"
						+ "결석자 : "+ student[0] + "명 /출석 : " + student[1] + "명 /조퇴 : " + student[2] + "명 /지각 : " + student[3] + "명");
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
			System.out.println("전체 출석 사항 : " + sum + "명 중 \n"
					+ "결석자 : "+ student[0] + "명 /출석 : " + student[1] + "명 /조퇴 : " + student[2] + "명 /지각 : " + student[3] + "명");

			
		}

		
		
//		End:
//		while(true) {
//			System.out.println("1.전체 출석사항 2.결석자 추가 3.출석자 추가 4.조퇴자 추가 5.지각자 추가 6.프로그램 종료");
//			int select = sc.nextInt();
//		
//			switch(select) {
//			case 1:
//				System.out.println("전체 출석사항");
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
//				System.out.println("전체 출석 사항 : " + student + "명 중");
//				break End;
//			}
//			if(student==50) {
//				System.out.println("전체 출석체크 완료");
//				System.out.println("결석자 : " + absence + " 출석자 : " + attendance + " 조퇴자 : " + early + " 지각자 : " + late);
//				break End;
//			}
//			
//		}
//		
//		System.out.println("결석자 : " + absence + " 출석자 : " + attendance + " 조퇴자 : " + early + " 지각자 : " + late);
//		
		
		
		
	}

}
