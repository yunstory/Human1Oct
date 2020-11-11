package nov10_1;

public class Person {

	private String name = "";
	private int age = 40;
	private Boolean married = true;
	private int child = 3;
	
	private static Person instance = new Person();
	
	private Person() {};
	
	public static Person getInstance() {
		return instance;
	}


	@Override
	public String toString() {
		return "�� ����� ���� : " + age +"\n�� ����� �̸� : " + name + "\n�� ����� ��ȥ ���� : " 
				+ married + "\n�� ����� �ڳ� �� : " + child;
	}

	
	
}
