package nov03;

class Student{
	
	public static int count = 0;
	
	
	private String name = "lee";
	 //필드 정적변수 클래스변수 static변수 
	private int kor = 50;
	private int math = 50;
	private int eng = 60;
	
	public Student() {//set
		//생성? 초기호ㅏ?
		//위와 같은 값을 갖고 있다가 아래값으로 변경됨..?
		this("홍길동", 10, 20, 30);
		
	}

	public Student(String name, int kor, int math, int eng) {
		//생성? 초기호ㅏ? //set
		super();
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		
		Student.count++;
	}

	public int total() {
		return kor + math + eng;
	}
	
	public double avg() {
		return total()/3.;
	}

	@Override //System.out.println(st1); 정상출력을 위해 씀
	public String toString() {
		//아래와 같이 입력하면 main 에서의 주석//1//2//과 같은 값이 출력됨!
		return name + "님의 총점 : " + total() + "\n" + name + "님의 평균 : " + avg();
		//return "Student [name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		//객체비교 이름으로
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	//get으로 얻어와서 set으로 설정
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
		if(kor<0) {
			this.kor = 0;
		}
		if(kor>100) {
			this.kor = 100;
		}
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	
	
	
}

public class test004 {
	
	public static void main(String[] args) {
		Student st1 = new Student("홍길동", 10, 10, 10);
		//1//System.out.println(st1.name +"의 총점 : "+ st1.total());
		//2//2System.out.println(st1.name +"의 평균 : "+ st1.avg());
		System.out.println(st1); //정상출력을 위해 public String toString()
		
		Student st2 = new Student();
		st2.setKor(50); st2.setName("홍길똥2");
		//st2.name = "홍길똥"; st2.kor = 20;
		//1//System.out.println(st2.name +"의 총점 : "+ st2.total());
		//2//System.out.println(st2.name +"의 평균 : "+ st2.avg());
		System.out.println(st2); // 정상출력을 위해 public String toString()
		
		Student st3 = new Student();
		System.out.println(st3);
		
		
		System.out.println("총 학생 수 : " + Student.count);
	}
}
