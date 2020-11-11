package nov11;

class Rectangle{
	
	public double width = 0; 
	public double height = 0;
	
	public double area() {
		return width * height; 
	}
	
	public double around() {
		return width*2 + height*2;
	}
	
	public Rectangle() {} //만드는 이유 >> = new Rectangle(); 같은거 못 씀 ! :33,, 
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
}


public class test001 {

	public static void main(String[] args) {
		Rectangle re = new Rectangle(10, 30);
		System.out.println(re.area());
		System.out.println(re.around());
		
		
		
		
		
	}
	
}
