package nov23;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder(); //��ü ���� 
		
		sb.append("Java "); 
		sb.append("Program Study"); // append ���ڿ� ���� ���� 
		System.out.println(sb.toString());
		
		sb.insert(4, "script"); //���ϴ� ��ġ�� �� ����
		System.out.println(sb.toString());
		
		sb.setCharAt(4, 'S'); //���ϴ� ��ġ ���� ����
		System.out.println(sb.toString());
		
		sb.replace(11, 18, "Programming"); //�ܾ����
		System.out.println(sb.toString());
		
		sb.delete(4, 10);
		System.out.println(sb.toString()); //�ܾ����
		
		int length = sb.length(); // ���� �� ��� 
		System.out.println("�� ���� �� : " + length + "��");
		
		String result = sb.toString();
		System.out.println(result); // ���ۿ� �ִ� ���� stringŸ������ ����
		
		

	}

}
