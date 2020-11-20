package nov19;


public class Wobbuffet implements Character{

	
	private int exp = 40; 
	private int energy = 50;
	private int level = 1;

	@Override
	public void eat() {
		energy += 25;
		System.out.println("������ ���� �Դ� �� ������");
	}

	@Override
	public void sleep() {
		energy += 10;
		System.out.println("������ �� �ڴ� �� ������");
	}

	@Override
	public void play() {
		exp += 30;
		energy -= 30;
		System.out.println("�׷��� ��� �� ���ڿ�");

	}

	@Override
	public void train() {
		exp += 20;
		energy -= 20;
		System.out.println("�ų��� � �� ���ڿ�");

	}

	@Override
	public void levelUp() {
		if(exp > 60) {
			System.out.println("�١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�");
			exp -= 40;
			level++;
			System.out.println("Level Up" + level +"\n�١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�");
		}

	}

	@Override
	public boolean endGame() {
		boolean returnValue = true;
		if(level > 4) {
			System.out.println("���ڿ��� �����Ͽ� �׺���̼��� �Ǿ����ϴ�."  );			
			returnValue = false;
		}else if(energy < 0) {
			System.out.println("���� ��..");
			returnValue = false;
		}
		return returnValue;
	}

	@Override
	public void printInfo() {
		System.out.println("-------------------------------------\n");
		System.out.println("ĳ���� ����");
		System.out.println("exp : " + exp );
		System.out.println("energy : " + energy);
		System.out.println("LV : " + level);
		System.out.println("\n-------------------------------------");

	}
	
	
	
}
