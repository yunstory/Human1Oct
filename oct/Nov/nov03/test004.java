package nov03;

class Student{
	
	public static int count = 0;
	
	
	private String name = "lee";
	 //�ʵ� �������� Ŭ�������� static���� 
	private int kor = 50;
	private int math = 50;
	private int eng = 60;
	
	public Student() {//set
		//����? �ʱ�ȣ��?
		//���� ���� ���� ���� �ִٰ� �Ʒ������� �����..?
		this("ȫ�浿", 10, 20, 30);
		
	}

	public Student(String name, int kor, int math, int eng) {
		//����? �ʱ�ȣ��? //set
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

	@Override //System.out.println(st1); ��������� ���� ��
	public String toString() {
		//�Ʒ��� ���� �Է��ϸ� main ������ �ּ�//1//2//�� ���� ���� ��µ�!
		return name + "���� ���� : " + total() + "\n" + name + "���� ��� : " + avg();
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
		//��ü�� �̸�����
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
	
	//get���� ���ͼ� set���� ����
	
	

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
		Student st1 = new Student("ȫ�浿", 10, 10, 10);
		//1//System.out.println(st1.name +"�� ���� : "+ st1.total());
		//2//2System.out.println(st1.name +"�� ��� : "+ st1.avg());
		System.out.println(st1); //��������� ���� public String toString()
		
		Student st2 = new Student();
		st2.setKor(50); st2.setName("ȫ���2");
		//st2.name = "ȫ���"; st2.kor = 20;
		//1//System.out.println(st2.name +"�� ���� : "+ st2.total());
		//2//System.out.println(st2.name +"�� ��� : "+ st2.avg());
		System.out.println(st2); // ��������� ���� public String toString()
		
		Student st3 = new Student();
		System.out.println(st3);
		
		
		System.out.println("�� �л� �� : " + Student.count);
	}
}
