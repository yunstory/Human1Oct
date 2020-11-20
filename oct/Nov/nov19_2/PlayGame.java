package nov19_2;

import java.util.Scanner;

import nov19.Character;
import nov19.Pikachu;

public class PlayGame {

	private Character character;
	private boolean flag = true;
	public void play(Character c) {
		character = c;
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			character.printInfo();
			System.out.print("1.����̱� 2.������ 3.����ֱ� 4.��ϱ� 5.�����ϱ� \n �Է� >> ");
			String select = sc.nextLine();
			
			switch(select) {
			
			case "1":
				character.eat();
				break;
			case "2":
				character.sleep();
				break;
			case "3":
				character.play();
				break;
			case "4":
				character.train();
				break;
			case "5":
				flag = false;
				break;
			default:
			}
			character.levelUp();
			if(flag) {			
				flag = character.endGame();
			}
		}

	}
}
