package nov02;

import java.util.Scanner;

public class test001 {

	public static Scanner sc = new Scanner(System.in);
	public static int[] deck = new int[52];
	public static int[] user1 = new int[10];
	public static int[] user2 = new int[10];
	public static int deckIndex = 52;
	public static int user1Index = 0;
	public static int user2Index = 0;
	public static boolean isUser1GEnd=false;
	public static boolean isUser2GEnd=false;
	public static String[] cardShape = {"♠", "◆", "♥", "♣"};
	public static String[] cardNumber = {"A", "2","3","4","5","6","7","8","9","10","J","Q","k"};

	
	
	public static void newCard() {
		//새로운 카드 1벌 세팅하기 
		for(int i=0; i<deck.length; i++) {
			deck[i] = i;
		}
		deckIndex = 52; user1Index =0; user2Index=0;
		isUser1GEnd = isUser2GEnd = false; //초기화
	}

	public static void mixCard() {
		//카드 섞는 방법 
		//카드가 다 만들어졌다면 랜덤하게 인덱스를 뽑아서 0번째 데이터와 교환하면 된다.
		for(int i=0; i<10000; i++) {
			int randomIndex = (int)(Math.random()*52);
			int temp = deck[0];
			deck[0] = deck[randomIndex];
			deck[randomIndex] = temp;
		}
		
	}
	
	public static void displayDeckCard() {
		for(int i=0; i<deckIndex; i++) {
			System.out.println(cardShape[deck[i]/13] + " " + cardNumber[deck[i]%13]);
		}
	}
	
	public static void displayUser1Card() {
		System.out.print("user1Card : ");
		for(int i=0; i<user1Index; i++) {
			System.out.print(cardShape[user1[i]/13] + " " + cardNumber[user1[i]%13] + ",");
		}
		System.out.print("  현재점수 : " + user1Scoure() + "\n");
	}
	
	public static void displayUser2Card() {
		System.out.print("user2Card : ");
		for(int i=0; i<user2Index; i++) {
			System.out.print(cardShape[user2[i]/13] + " " + cardNumber[user2[i]%13] + ",");
		}
		System.out.println("  현재점수 : " + user2Scoure());
	}


	public static void getUser1Card() {
		//deck 배열에서 user1카드로 옮기기
		//deck이 가지고 있는 카드 수 deckIndex
		//user1이 가지고 있는 카드 수 user1Index
		user1[user1Index] = deck[deckIndex-1];
		deckIndex --; 
		user1Index++;
		
	}

	public static void getUser2Card() {
		//deck 배열에서 user2카드로 옮기기
		//deck이 가지고 있는 카드 수 deckIndex
		//user1이 가지고 있는 카드 수 user1Index
		user2[user2Index] = deck[deckIndex-1];
		deckIndex --; 
		user2Index++;
		
		
	}
	
	
	public static int user1Scoure() {
		int returnValue = 0;
		//A 1 or 11 / j q k 10 (11, 12, 13 -> 10) / 나머지는 그대로 
		for(int i=0; i<user1Index; i++) {
			int countNum = user1[i]%13+1;
			if(countNum>10) {
				countNum = 10;
			}
			returnValue += countNum;
		}
		
		for(int i=0; i<user1Index; i++) {
			if(user1[i]%13==0) {//A가 있으면
				if((returnValue + 10) > 21) {//A를 11로 변경 후 21보다 크다면
					
				}else {
					returnValue += 10;
				}
				break;
			}
		}
		
		return returnValue;
	}
	
	public static int user2Scoure() {
		int returnValue = 0;
		//A 1 or 11 / j q k 10 (11, 12, 13 -> 10) / 나머지는 그대로 
		for(int i=0; i<user2Index; i++) {
			int countNum = user2[i]%13+1;
			if(countNum>10) {
				countNum = 10;
			}
			returnValue += countNum;
		}
		
		for(int i=0; i<user2Index; i++) {
			if(user2[i]%13==0) {//A가 있으면
				if((returnValue + 10) > 21) {//A를 11로 변경 후 21보다 크다면
					
				}else {
					returnValue += 10;
				}
				break; //한번만 연산하기위해 넣어준것 빼도 상관없음
			}
		}
		
		return returnValue;
	}
	
	public static void displayGEnd() {
		String result = "";
		displayUser1Card();
		displayUser2Card();
		
		if(user1Scoure() > 21) {
			result = "user2의 승리";
		}else if(user2Scoure() > 21) {
			result = "user1의 승리";
		}else if(user1Scoure() < user2Scoure()) {
			result = "user2의 승리";
		}else if(user1Scoure() == user2Scoure()) {
			result = "무승부";
		}else {
			result = "user1의 승리";
		}
		System.out.println("\n게임 결과 " + result);
		
		
		
		
	}
	
	public static void play() {
		for(int i=0; i<10; i++) {
			//user1 카드받기
			System.out.println(i + 1 + "번째 card-------------");
			if(!isUser1GEnd) { 
				System.out.print("user1 카드 받? 1.y 2.n \t");
				if(1==Integer.parseInt(sc.nextLine())) {//1 게임실행
					getUser1Card();//카드 1장 취득
					if(user1Scoure()>21) {//패배 종료
						break;
					};
				}else {
					isUser1GEnd = true;
				}
			}
			//user2 카드받기
			if(!isUser2GEnd) { 
				System.out.print("user2 카드 받? 1.y 2.n \t");
				if(1==Integer.parseInt(sc.nextLine())) {//1 게임실행
					getUser2Card();//카드 1장 취득
					if(user2Scoure()>21) {//패배 종료
						break;
					};
				}else {
					isUser2GEnd = true;
				}
			}
			//종료
			if(isUser1GEnd && isUser2GEnd) {
				break;
			}
			displayUser1Card();
			displayUser2Card();
		}
		displayGEnd();
		
//		//승패출력
//		displayUser1Card();
//		displayUser2Card();
//		
//		
//		System.out.println(user1Scoure());
//		System.out.println(user2Scoure());

	}
	
	public static void main(String[] args) {

		
		while(true) {
			
			//카드세팅
			newCard();
			//카드섞기
			mixCard();
			//게임실행
			play();
			
			int i = 0; 
			if(i==0) {
				break;
			}
		}
		
		
		
	}

}
