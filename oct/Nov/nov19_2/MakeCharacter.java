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
		System.out.println("캐릭터 선택 \n 1.삐카츄 2.마자용 3.토게피 4.고라파덕 ");
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
			System.out.println("error 종료");
		}
		return returnValue;

	}
	
}
