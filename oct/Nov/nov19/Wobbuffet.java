package nov19;


public class Wobbuffet implements Character{

	
	private int exp = 40; 
	private int energy = 50;
	private int level = 1;

	@Override
	public void eat() {
		energy += 25;
		System.out.println("쩝쩝쩝 음식 먹는 중 쩝쩝쩝");
	}

	@Override
	public void sleep() {
		energy += 10;
		System.out.println("쿨쿨쿨 잠 자는 중 쿨쿨쿨");
	}

	@Override
	public void play() {
		exp += 30;
		energy -= 30;
		System.out.println("그러다 노는 중 마자용");

	}

	@Override
	public void train() {
		exp += 20;
		energy -= 20;
		System.out.println("신나게 운동 중 마자용");

	}

	@Override
	public void levelUp() {
		if(exp > 60) {
			System.out.println("☆★☆★☆★☆★☆★☆★☆★");
			exp -= 40;
			level++;
			System.out.println("Level Up" + level +"\n☆★☆★☆★☆★☆★☆★☆★");
		}

	}

	@Override
	public boolean endGame() {
		boolean returnValue = true;
		if(level > 4) {
			System.out.println("마자용이 성장하여 네비게이션이 되었습니다."  );			
			returnValue = false;
		}else if(energy < 0) {
			System.out.println("굶어 죽..");
			returnValue = false;
		}
		return returnValue;
	}

	@Override
	public void printInfo() {
		System.out.println("-------------------------------------\n");
		System.out.println("캐릭터 정보");
		System.out.println("exp : " + exp );
		System.out.println("energy : " + energy);
		System.out.println("LV : " + level);
		System.out.println("\n-------------------------------------");

	}
	
	
	
}
