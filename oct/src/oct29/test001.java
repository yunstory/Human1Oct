package oct29;

public class test001 {

	public static void a() {
		System.out.println("a 시작");
		b();
		System.out.println("a 종료");
	}
	
	public static void b() {
		System.out.println("b 시작");
		System.out.println("b 종료");
	}
	
	public static void c() {
		System.out.println("c 시작");
		System.out.println("c 종료");
	}
	
	public static void d() {
		System.out.println("d 시작");
		System.out.println("d 종료");
	}
	
	public static void main(String[] args) {
		
		a();
		c();
		d();
		
		
		
	}

}
		

