package nov19_1;
import nov19.Character;
import nov19_2.MakeCharacter;
import nov19_2.PlayGame;


public class StartGame {

	public static void main(String[] args) {
		
		PlayGame pg = new PlayGame();
		MakeCharacter mc = new MakeCharacter();
		Character selectCharacter = mc.selectCharacter();
		pg.play(selectCharacter);

	}

}
