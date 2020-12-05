package nov23;

public class StringBuilderTest {

	public static void main(String[] args) {
		System.out.print("\n---------StringBuilderTest---------\n");
		String javaStr = new String("Java");
		System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
		
		StringBuilder buffer1 = new StringBuilder();
		System.out.println("초기 buffer 메모리 주소 : " + System.identityHashCode(buffer1));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is NG!!");
		
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		
		javaStr = buffer.toString();
		System.out.println(javaStr); 
		System.out.println("연결된 yuns 문자열 주소 : " + System.identityHashCode(javaStr));

	}

}
