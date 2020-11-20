package nov19;

public class Togepi implements Character{

	
	private int exp = 40; 
	private int energy = 50;
	private int level = 1;

	@Override
	public void eat() {
		energy += 25;
		System.out.println("ÂÁÂÁÂÁ À½½Ä ¸Ô´Â Áß ÂÁÂÁÂÁ");
	}

	@Override
	public void sleep() {
		energy += 10;
		System.out.println("ÄğÄğÄğ Àá ÀÚ´Â Áß ÄğÄğÄğ");
	}

	@Override
	public void play() {
		exp += 30;
		energy -= 30;
		System.out.println("¢İ ¢Ü ³ë´Â Áß ¢Ü ¢İ");

	}

	@Override
	public void train() {
		exp += 20;
		energy -= 20;
		System.out.println("Çà¿î »ı¼º Áß");

	}

	@Override
	public void levelUp() {
		if(exp > 60) {
			System.out.println("¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú");
			exp -= 40;
			level++;
			System.out.println("Level Up" + level +"\n¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú");
		}

	}

	@Override
	public boolean endGame() {
		boolean returnValue = true;
		if(level > 4) {
			System.out.println("Åä°ÔÇÇ°¡ ¼ºÀåÇÏ¿© Åä°ÔÆ½ÀÌ µÇ¾ú½À´Ï´Ù"  );			
			returnValue = false;
		}else if(energy < 0) {
			System.out.println("±¾¾î Á×..");
			returnValue = false;
		}
		return returnValue;
	}

	@Override
	public void printInfo() {
		System.out.println("-------------------------------------\n");
		System.out.println("Ä³¸¯ÅÍ Á¤º¸");
		System.out.println("exp : " + exp );
		System.out.println("energy : " + energy);
		System.out.println("LV : " + level);
		System.out.println("\n-------------------------------------");

	}
	
	
}
