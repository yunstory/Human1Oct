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
	public static String[] cardShape = {"��", "��", "��", "��"};
	public static String[] cardNumber = {"A", "2","3","4","5","6","7","8","9","10","J","Q","k"};

	
	
	public static void newCard() {
		//���ο� ī�� 1�� �����ϱ� 
		for(int i=0; i<deck.length; i++) {
			deck[i] = i;
		}
		deckIndex = 52; user1Index =0; user2Index=0;
		isUser1GEnd = isUser2GEnd = false; //�ʱ�ȭ
	}

	public static void mixCard() {
		//ī�� ���� ��� 
		//ī�尡 �� ��������ٸ� �����ϰ� �ε����� �̾Ƽ� 0��° �����Ϳ� ��ȯ�ϸ� �ȴ�.
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
		System.out.print("  �������� : " + user1Scoure() + "\n");
	}
	
	public static void displayUser2Card() {
		System.out.print("user2Card : ");
		for(int i=0; i<user2Index; i++) {
			System.out.print(cardShape[user2[i]/13] + " " + cardNumber[user2[i]%13] + ",");
		}
		System.out.println("  �������� : " + user2Scoure());
	}


	public static void getUser1Card() {
		//deck �迭���� user1ī��� �ű��
		//deck�� ������ �ִ� ī�� �� deckIndex
		//user1�� ������ �ִ� ī�� �� user1Index
		user1[user1Index] = deck[deckIndex-1];
		deckIndex --; 
		user1Index++;
		
	}

	public static void getUser2Card() {
		//deck �迭���� user2ī��� �ű��
		//deck�� ������ �ִ� ī�� �� deckIndex
		//user1�� ������ �ִ� ī�� �� user1Index
		user2[user2Index] = deck[deckIndex-1];
		deckIndex --; 
		user2Index++;
		
		
	}
	
	
	public static int user1Scoure() {
		int returnValue = 0;
		//A 1 or 11 / j q k 10 (11, 12, 13 -> 10) / �������� �״�� 
		for(int i=0; i<user1Index; i++) {
			int countNum = user1[i]%13+1;
			if(countNum>10) {
				countNum = 10;
			}
			returnValue += countNum;
		}
		
		for(int i=0; i<user1Index; i++) {
			if(user1[i]%13==0) {//A�� ������
				if((returnValue + 10) > 21) {//A�� 11�� ���� �� 21���� ũ�ٸ�
					
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
		//A 1 or 11 / j q k 10 (11, 12, 13 -> 10) / �������� �״�� 
		for(int i=0; i<user2Index; i++) {
			int countNum = user2[i]%13+1;
			if(countNum>10) {
				countNum = 10;
			}
			returnValue += countNum;
		}
		
		for(int i=0; i<user2Index; i++) {
			if(user2[i]%13==0) {//A�� ������
				if((returnValue + 10) > 21) {//A�� 11�� ���� �� 21���� ũ�ٸ�
					
				}else {
					returnValue += 10;
				}
				break; //�ѹ��� �����ϱ����� �־��ذ� ���� �������
			}
		}
		
		return returnValue;
	}
	
	public static void displayGEnd() {
		String result = "";
		displayUser1Card();
		displayUser2Card();
		
		if(user1Scoure() > 21) {
			result = "user2�� �¸�";
		}else if(user2Scoure() > 21) {
			result = "user1�� �¸�";
		}else if(user1Scoure() < user2Scoure()) {
			result = "user2�� �¸�";
		}else if(user1Scoure() == user2Scoure()) {
			result = "���º�";
		}else {
			result = "user1�� �¸�";
		}
		System.out.println("\n���� ��� " + result);
		
		
		
		
	}
	
	public static void play() {
		for(int i=0; i<10; i++) {
			//user1 ī��ޱ�
			System.out.println(i + 1 + "��° card-------------");
			if(!isUser1GEnd) { 
				System.out.print("user1 ī�� ��? 1.y 2.n \t");
				if(1==Integer.parseInt(sc.nextLine())) {//1 ���ӽ���
					getUser1Card();//ī�� 1�� ���
					if(user1Scoure()>21) {//�й� ����
						break;
					};
				}else {
					isUser1GEnd = true;
				}
			}
			//user2 ī��ޱ�
			if(!isUser2GEnd) { 
				System.out.print("user2 ī�� ��? 1.y 2.n \t");
				if(1==Integer.parseInt(sc.nextLine())) {//1 ���ӽ���
					getUser2Card();//ī�� 1�� ���
					if(user2Scoure()>21) {//�й� ����
						break;
					};
				}else {
					isUser2GEnd = true;
				}
			}
			//����
			if(isUser1GEnd && isUser2GEnd) {
				break;
			}
			displayUser1Card();
			displayUser2Card();
		}
		displayGEnd();
		
//		//�������
//		displayUser1Card();
//		displayUser2Card();
//		
//		
//		System.out.println(user1Scoure());
//		System.out.println(user2Scoure());

	}
	
	public static void main(String[] args) {

		
		while(true) {
			
			//ī�弼��
			newCard();
			//ī�弯��
			mixCard();
			//���ӽ���
			play();
			
			int i = 0; 
			if(i==0) {
				break;
			}
		}
		
		
		
	}

}
