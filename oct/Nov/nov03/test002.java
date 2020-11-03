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
		
		
		// 직사각형 넓이 둘레 구하기 
		Rrectangle re1 = new Rrectangle();
		System.out.println("직사각형의 넓이 : " + re1.area(10, 10));
		System.out.println("직사각형의 둘레 : " + re1.periphery(10, 10));

		// 삼각형의 넓이 둘레 구하기 
		Ttrriangle tr1 = new Ttrriangle();
		System.out.println("삼각형의 넓이 : " + tr1.area(10, 10));
		System.out.println("삼각형의 둘레 : " + tr1.periphery(10, 10, 10));
		
		// 원의 넓이 둘레 구하기
		Ccircle ci1 = new Ccircle();
		System.out.println("원의 넓이 : " + ci1.area(10));
		System.out.println("원의 둘레 : " + ci1.periphery(10));
	}

}
