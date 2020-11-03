package nov03;
class Rectangle{
	public static double unit = 100; // static���������� static �޼ҵ常 �� �� �ִ�.��ü �������� ��밡��
	private double height = 20; //�ܺΰ����ٺҰ�
	private double width = 40;
	
	public double periphery() {
		return 2*height + 2*width;
	}
	
	public static double area(double height, double width) {
		return height * width * unit;

	}
	
	public double area() {

		return height * width;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height < 0) {
			height = 0;
		}
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	
	
	
	public Rectangle() {}
	
	public Rectangle(double width) {
		this(width,width); // ù��°�� ��ġ�� ��ߵ�
//		this.width = width;
//		this.height = width;
	}
	public Rectangle(double height, double width) {
		super(); // �θ� �ִ� �����ڸ� ȣ�� ��� 
		this.height = height;
		this.width = width;
	}
	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]" + this.area ();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area());
		result = prime * result + (int) (temp ^ (temp >>> 32));
//		temp = Double.doubleToLongBits(width);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if(this.area() != other.area()) {
			return false;
		}
//		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
//			return false;
//		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
//			return false;
		return true;
	}
	
	
}
class triangle{
	public double height = 50;
	public double width = 60;
	public double �غ� = 70;
	public double area() {
		return (�غ� * height) / 2;
	}
	public double periphery(int x, int y, int z) {
		return x + y + z;
	}
	public triangle() {}
	public triangle(double width, double �غ�) {
		super();
		this.width = width;
		this.�غ� = �غ�;
	}
	public triangle(double height, double width, double �غ�) {
		super();
		this.height = height;
		this.width = width;
		this.�غ� = �غ�;
	}
	
}

class circle{
	public double pie = 3.14;
	public double area(int x) {
		return (x*x) * pie;
	}
	public double periphery(int x) {
		return 2*pie*x;
	}

}

public class test001 {
	
	public static void main(String[] args) {
		//���簢�� ���� �ѷ� ���ϴ� ���α׷� ����� 
		//Rectangle r1 = new Rectangle();
		//Rectangle r1 = new Rectangle(10,20);
		Rectangle r1 = new Rectangle(30,40);
		Rectangle r2 = new Rectangle(40,30);
		System.out.println(r1.equals(r2));
		System.out.println(r1);
		
		r1.setHeight(50); r1.setWidth(50);
		System.out.println(r1.getHeight());
		
		
		System.out.println(Rectangle.area(40, 10));
		
		
//		r1.height = 30; r1.width = 40; //privateȿ���� ���ٺҰ�
//		System.out.println(r1.periphery());
//		System.out.println(r1.area());
//		
//		r2.height = 40; r2.width = 50;
//		System.out.println(r2.periphery());
//		System.out.println(r2.area());
//		System.out.println("--------------------");
//		
//		//�ﰢ�� 
//		triangle t1 = new triangle();
//		System.out.println(t1.area());
//		
//		triangle t2 = new triangle();
//		t2.height = 10; t2.width = 20; t2.�غ� = 30;
//		System.out.println(t2.area());
//		
//		triangle t3 = new triangle();
//		System.out.println(t3.periphery(1,2,3));
//		
//		triangle t4 = new triangle();
//		System.out.println(t4.periphery(20, 30, 40));
//		System.out.println("--------------------");
		
		
		//��
//		circle c1 = new circle();
//		System.out.println(c1.area(6));
//		circle c2 = new circle();
//		System.out.println(c2.periphery(6));
//		System.out.println("--------------------");
		
		
		
	}

}
