package nov23;

public class StringBuilderTest {

	public static void main(String[] args) {
		System.out.print("\n---------StringBuilderTest---------\n");
		String javaStr = new String("Java");
		System.out.println("javaStr ���ڿ� �ּ� : " + System.identityHashCode(javaStr));
		
		StringBuilder buffer1 = new StringBuilder();
		System.out.println("�ʱ� buffer �޸� �ּ� : " + System.identityHashCode(buffer1));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("���� �� buffer �޸� �ּ� : " + System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is NG!!");
		
		System.out.println("���� �� buffer �޸� �ּ� : " + System.identityHashCode(buffer));
		
		javaStr = buffer.toString();
		System.out.println(javaStr); 
		System.out.println("����� yuns ���ڿ� �ּ� : " + System.identityHashCode(javaStr));

	}

}
