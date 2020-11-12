package nov11;

class Rectangle{
//아래와 class와 다르게 extends가 없어도 상속중인거시야 ㅇ0ㅇ..
	
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
//		super(); //부모의 생성자를 말함. 모든 class는 obj클래스를 상속
		this.width = width;
		this.height = height;
	}
}	
	
class RectanglePillar extends Rectangle{
	
	public double pillar = 0;
	public double volume() {
		return area() * pillar;
	}
	
	public RectanglePillar() {}; //아래와 ㅅㅔ트라규
	
	public RectanglePillar(double width, double height, double pillar) {
		super(width, height); //맨 첫줄에 써줘야 됨 :ㅣ,,
//		this.width = width;  //super가 입력되면 굳이 this부분 안 써도 된다함 :<< ,,
//		this.height = height;  
		super.width = width; //부모에 있는 width height에 접근하려면 이런 코드
		super.height = height; // 부모에서 찾음
		
		this.pillar = pillar; //자기 자신에서 찾음 
		/*
		 super=>부모에 접근 this=>자기자신에 접근 
		 super는 생성자 맨 상단에 기술해야 함
		 this는 그 클래스 안에서만 사용 가능 ->지역변수 
		 자기 자신 걸 출력하려면 this.width 
		 부모 걸 출력하고 싶다면 super.width
		 */
	}
	
}


public class test001 {

	public static void main(String[] args) {
		Rectangle re = new Rectangle(10, 30);
		System.out.println(re.area());
		System.out.println(re.around());
		System.out.println("\n------------------------\n");
		
		
		//사각기둥의 넓이를 구하는 기능 추가하기 
		
		RectanglePillar rp = new RectanglePillar();
		rp.height = 10; rp.width = 10;
		System.out.println(rp.area());
		System.out.println(rp.around());
		System.out.println("\n------------------------\n");
		
		
		
		RectanglePillar rp1 = new RectanglePillar(12, 34, 56);
		System.out.println(rp1.area());
		System.out.println(rp1.around());
		System.out.println("\n------------------------\n");
	}
	
}
