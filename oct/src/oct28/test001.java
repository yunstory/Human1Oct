package oct28;

import java.util.Scanner;

public class test001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		for(int count=0;count<1000;count++) {
//			if(f369(count)) {//박수치는 함수
//			System.out.print(count);//숫자찍는 부분
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
//			//369 returnValue 박수안치면 true
//			boolean isReturnFlag=true;
//			while(count!=0) {
//			if(count%10%3==0&&count%10!=0) {
//			System.out.print("짝");
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
			
		System.out.println("1.대인\t2.청소년\t3.소인/경로\t4.계산");
		age = Integer.parseInt(sc.nextLine());
		if(age==4) {
			System.out.println("대인: " + totalP1 + "인" + "청소년: " + totalP2 + "인" + "소인/경로: " + totalP3 + "인" + "결제금액: " + sum + "원");
			break;
		}
		System.out.println("인원 수 입력");
		int people = Integer.parseInt(sc.nextLine());
		System.out.println("1.주간권(1일) \t 2.오후권(15시~) \t 3.윈터야간권(17시~) \t 4.2일권");
		int ticket = Integer.parseInt(sc.nextLine());	
			
			
		switch(age) {
		case 1:
			if(ticket==1) {
				sum += people*46000;
				System.out.println("대인 / 주간권 선택 / 인원수" + people + "/ 총 금액 = " + sum);
			}else if(ticket==2){
				sum += people*38000;
				System.out.println("대인 / 오후권 선택 / 인원수" + people + "/ 총 금액 = " + sum);
			}else if(ticket==3){
				sum += people*20000;
				System.out.println("대인 / 윈터야간권 선택 / 인원수" + people + "/ 총 금액 = " + sum);
			}else {
				sum += people*74000;
				System.out.println("대인 / 2일권 선택 / 인원수" + people + "/ 총 금액 = " + sum);
			}
			totalP1 += people;
			
			break ;
		case 2:
			if(ticket==1) {
				sum += people*39000;
				System.out.println("청소년 / 주간권 선택 / 인원수" + people + "/ 총 금액 = " + sum);
			}else if(ticket==2) {
				
				sum += people*32000;
				System.out.println("청소년 / 오후권 선택 / 인원수" + people + "/ 총 금액 = " + sum);
			}else if(ticket==3) {
				sum += people*17000;
				System.out.println("청소년 / 윈터야간권 선택 / 인원수" + people + "/ 총 금액 = " + sum);
			}else {
				sum += people*62000;
				System.out.println("청소년 / 2일권 선택 / 인원수" + people + "/ 총 금액 = " + sum);
			}
			totalP2 += people;
			break ;
		case 3:
			if(ticket==1) {
				sum += people*36000;
				System.out.println("소인/경로 / 주간권 선택 / 인원수" + people + "/ 총 금액 = " + sum);
			}else if(ticket==2) {
				sum += people*29000;
				System.out.println("소인/경로 / 오후권 선택 / 인원수" + people + "/ 총 금액 = " + sum);
			}else if(ticket==3) {
				sum += people*16000;
				System.out.println("소인/경로 / 윈터야간권 선택 / 인원수" + people + "/ 총 금액 = " + sum);
			}else {
				sum += people*58000;
				System.out.println("소인/경로 / 2일권 선택 / 인원수" + people + "/ 총 금액 = " + sum);
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
//			System.out.print("숫자입력 : ");
//			int i = Integer.parseInt(sc.nextLine());
//			
//			if(i==num) {
//				o++;
//				System.out.println("정답입니다  \n");
//				break;
//			}else {
//				System.out.print("오답입니다 ::");
//				x++;
//				if(i>num) {
//					System.out.println("보다 작은 수를 입력해주세요\n");
//				}else {
//					System.out.println("보다 큰 수를 입력해주세요\n");
//				}
//			}
//		}
//		System.out.println("게임 총" + (o+x) + "회 번째에 맞춤");
		
		
}
}

		

	


