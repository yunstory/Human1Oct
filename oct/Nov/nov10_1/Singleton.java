package nov10_1;

public class Singleton {

	public int count = 0;
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {}; //외부에서는 생성불가 접근불가 
	
	public static Singleton getInstance() {
		return instance;
	}
	
}
