package nov03;

public class test003 {
	public static String name = "lee";
	 //필드 정적변수 클래스변수 static변수 
	public static int kor = 50;
	public static int math = 50;
	public static int eng = 60;
	
	public static int total() {
		return kor + math + eng;
	}
	
	public static double avg() {
		return total()/3.;
	}
	
	public static void main(String[] args) {
	
		System.out.println(name +"의 총점 : "+ total());
		System.out.println(name +"의 평균 : "+ avg());
		
	}
}
