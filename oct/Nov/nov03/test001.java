package nov03;
class Rectangle{
	public static double unit = 100; // static변수에서는 static 메소드만 쓸 수 있다.개체 생성없이 사용가능
	private double height = 20; //외부값접근불가
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
		this(width,width); // 첫번째에 위치해 줘야됨
//		this.width = width;
//		this.height = width;
	}
	public Rectangle(double height, double width) {
		super(); // 부모에 있는 생성자를 호출 상속 
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
	public double 밑변 = 70;
	public double area() {
		return (밑변 * height) / 2;
	}
	public double periphery(int x, int y, int z) {
		return x + y + z;
	}
	public triangle() {}
	public triangle(double width, double 밑변) {
		super();
		this.width = width;
		this.밑변 = 밑변;
	}
	public triangle(double height, double width, double 밑변) {
		super();
		this.height = height;
		this.width = width;
		this.밑변 = 밑변;
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
		//직사각형 넓이 둘레 구하는 프로그램 만들기 
		//Rectangle r1 = new Rectangle();
		//Rectangle r1 = new Rectangle(10,20);
		Rectangle r1 = new Rectangle(30,40);
		Rectangle r2 = new Rectangle(40,30);
		System.out.println(r1.equals(r2));
		System.out.println(r1);
		
		r1.setHeight(50); r1.setWidth(50);
		System.out.println(r1.getHeight());
		
		
		System.out.println(Rectangle.area(40, 10));
		
		
//		r1.height = 30; r1.width = 40; //private효과로 접근불가
//		System.out.println(r1.periphery());
//		System.out.println(r1.area());
//		
//		r2.height = 40; r2.width = 50;
//		System.out.println(r2.periphery());
//		System.out.println(r2.area());
//		System.out.println("--------------------");
//		
//		//삼각형 
//		triangle t1 = new triangle();
//		System.out.println(t1.area());
//		
//		triangle t2 = new triangle();
//		t2.height = 10; t2.width = 20; t2.밑변 = 30;
//		System.out.println(t2.area());
//		
//		triangle t3 = new triangle();
//		System.out.println(t3.periphery(1,2,3));
//		
//		triangle t4 = new triangle();
//		System.out.println(t4.periphery(20, 30, 40));
//		System.out.println("--------------------");
		
		
		//원
//		circle c1 = new circle();
//		System.out.println(c1.area(6));
//		circle c2 = new circle();
//		System.out.println(c2.periphery(6));
//		System.out.println("--------------------");
		
		
		
	}

}
