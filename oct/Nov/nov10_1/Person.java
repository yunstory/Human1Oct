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
		return "이 사람의 나이 : " + age +"\n이 사람의 이름 : " + name + "\n이 사람의 결혼 여부 : " 
				+ married + "\n이 사람의 자녀 수 : " + child;
	}

	
	
}
