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
	public static String[] cardShape = {"�����̵�", "���̾�", "��Ʈ", "Ŭ�ι�"};
	public static String[] cardNumber = {"A", "2","3","4","5","6","7","8","9","10","J","Q","k"};
	
	
	
	public static void newCard() {
		//���ο� ī�� 1�� �����ϱ� 
		for(int i=0; i<deck.length; i++) {
			deck[i] = i;
		}
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
		System.out.println("-------User1-------");
		for(int i=0; i<user1Index; i++) {
			System.out.println(cardShape[user1[i]/13] + " " + cardNumber[user1[i]%13]);
		}
		
		
	}
	
	public static void displayUser2Card() {
		System.out.println("-------User2-------");
		for(int i=0; i<user2Index; i++) {
			System.out.println(cardShape[user2[i]/13] + " " + cardNumber[user2[i]%13]);
		}
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
	
	
	public static void user1Flag(){
		System.out.println("ī�带 �����ðڽ��ϱ�? 0=n 1=y");
		int c = sc.nextInt();
		if(c==1) {
			getUser1Card();

		}else if(user1Scoure()>21) {
			System.out.println("��");
			return;
		}
		
	}
	public static void user2Flag(){
		System.out.println("ī�带 �����ðڽ��ϱ�? 0=n 1=y");
		int c = sc.nextInt();
		if(c==1) {
			getUser2Card();
		}else {
			
		}
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
				if(returnValue + 10 > 21) {//A�� 11�� ���� �� 21���� ũ�ٸ�
					
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
				if(returnValue + 10 > 21) {//A�� 11�� ���� �� 21���� ũ�ٸ�
					
				}else {
					returnValue += 10;
				}
				break; //�ѹ��� �����ϱ����� �־��ذ� ���� �������
			}
		}
		
		return returnValue;
	}
	
	
	public static void main(String[] args) {
		
		newCard(); //ī�� ����
		mixCard();//ī�� ����
		//displayDeckCard();//ī�� ����

		user1Flag();
		user2Flag();
			

		displayUser1Card();
		displayUser2Card();
		
		user1Scoure();
		user2Scoure();
		
		System.out.println(user1Scoure());
		System.out.println(user2Scoure());
		
		
	}


}
