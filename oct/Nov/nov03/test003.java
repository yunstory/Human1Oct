package nov03;

public class test003 {
	public static String name = "lee";
	 //�ʵ� �������� Ŭ�������� static���� 
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
	
		System.out.println(name +"�� ���� : "+ total());
		System.out.println(name +"�� ��� : "+ avg());
		
	}
}
