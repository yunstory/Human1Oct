package nov19_2;

import java.util.Scanner;
import nov19.Pikachu;
import nov19.Psyduck;
import nov19.Togepi;
import nov19.Wobbuffet;
import nov19.Character;

public class MakeCharacter {

	public Character selectCharacter() {
		Character returnValue = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("ĳ���� ���� \n 1.��ī�� 2.���ڿ� 3.����� 4.����Ĵ� ");
		String ch = sc.nextLine();
		if(ch.equals("1")) {
			returnValue = new Pikachu();
		}else if(ch.equals("2")){
			returnValue = new Wobbuffet();
		}else if(ch.equals("3")){
			returnValue = new Togepi();
		}else if(ch.equals("4")){
			returnValue = new Psyduck();
		}else {
			System.out.println("error ����");
		}
		return returnValue;

	}
	
}
