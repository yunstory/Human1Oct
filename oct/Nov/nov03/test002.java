package nov03;

class Rrectangle{
	public double area(int height, int width) {
		return height * width;
	}
	public double periphery(int height, int width) {
		return 2*height + 2*width;
	}
}

class Ttrriangle{
	public double area(int height, int base) {
		return (height * base)/2;
	}
	public double periphery(int x, int y, int base) {
		return x + y + base;
	}
}

class Ccircle{
	public double area(int radius) {
		return (radius * radius) * Math.PI;
	}
	public double periphery(int radius) {
		return 2 * radius * Math.PI;
	}
}



public class test002 {
	public static void main(String[] args) {
		
		
		// ���簢�� ���� �ѷ� ���ϱ� 
		Rrectangle re1 = new Rrectangle();
		System.out.println("���簢���� ���� : " + re1.area(10, 10));
		System.out.println("���簢���� �ѷ� : " + re1.periphery(10, 10));

		// �ﰢ���� ���� �ѷ� ���ϱ� 
		Ttrriangle tr1 = new Ttrriangle();
		System.out.println("�ﰢ���� ���� : " + tr1.area(10, 10));
		System.out.println("�ﰢ���� �ѷ� : " + tr1.periphery(10, 10, 10));
		
		// ���� ���� �ѷ� ���ϱ�
		Ccircle ci1 = new Ccircle();
		System.out.println("���� ���� : " + ci1.area(10));
		System.out.println("���� �ѷ� : " + ci1.periphery(10));
	}

}
