package nov23;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder(); //객체 생성 
		
		sb.append("Java "); 
		sb.append("Program Study"); // append 문자열 끝에 삽입 
		System.out.println(sb.toString());
		
		sb.insert(4, "script"); //원하는 위치에 값 삽입
		System.out.println(sb.toString());
		
		sb.setCharAt(4, 'S'); //원하는 위치 문자 변경
		System.out.println(sb.toString());
		
		sb.replace(11, 18, "Programming"); //단어수정
		System.out.println(sb.toString());
		
		sb.delete(4, 10);
		System.out.println(sb.toString()); //단어삭제
		
		int length = sb.length(); // 글자 수 얻기 
		System.out.println("총 글자 수 : " + length + "자");
		
		String result = sb.toString();
		System.out.println(result); // 버퍼에 있는 것을 string타입으로 리턴
		
		

	}

}
