package nov10_1;

public class Singleton {

	public int count = 0;
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {}; //�ܺο����� �����Ұ� ���ٺҰ� 
	
	public static Singleton getInstance() {
		return instance;
	}
	
}
