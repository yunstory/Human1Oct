package nov11;

class Rectangle{
//�Ʒ��� class�� �ٸ��� extends�� ��� ������ΰŽþ� ��0��..
	
	public double width = 0; 
	public double height = 0;
	
	public double area() {
		return width * height; 
	}
	
	public double around() {
		return width*2 + height*2;
	}
	
	public Rectangle() {} //����� ���� >> = new Rectangle(); ������ �� �� ! :33,, 
	
	public Rectangle(double width, double height) {
//		super(); //�θ��� �����ڸ� ����. ��� class�� objŬ������ ���
		this.width = width;
		this.height = height;
	}
}	
	
class RectanglePillar extends Rectangle{
	
	public double pillar = 0;
	public double volume() {
		return area() * pillar;
	}
	
	public RectanglePillar() {}; //�Ʒ��� ����Ʈ���
	
	public RectanglePillar(double width, double height, double pillar) {
		super(width, height); //�� ù�ٿ� ����� �� :��,,
//		this.width = width;  //super�� �ԷµǸ� ���� this�κ� �� �ᵵ �ȴ��� :<< ,,
//		this.height = height;  
		super.width = width; //�θ� �ִ� width height�� �����Ϸ��� �̷� �ڵ�
		super.height = height; // �θ𿡼� ã��
		
		this.pillar = pillar; //�ڱ� �ڽſ��� ã�� 
		/*
		 super=>�θ� ���� this=>�ڱ��ڽſ� ���� 
		 super�� ������ �� ��ܿ� ����ؾ� ��
		 this�� �� Ŭ���� �ȿ����� ��� ���� ->�������� 
		 �ڱ� �ڽ� �� ����Ϸ��� this.width 
		 �θ� �� ����ϰ� �ʹٸ� super.width
		 */
	}
	
}


public class test001 {

	public static void main(String[] args) {
		Rectangle re = new Rectangle(10, 30);
		System.out.println(re.area());
		System.out.println(re.around());
		System.out.println("\n------------------------\n");
		
		
		//�簢����� ���̸� ���ϴ� ��� �߰��ϱ� 
		
		RectanglePillar rp = new RectanglePillar();
		rp.height = 10; rp.width = 10;
		System.out.println(rp.area());
		System.out.println(rp.around());
		System.out.println("\n------------------------\n");
		
		
		
		RectanglePillar rp1 = new RectanglePillar(12, 34, 56);
		System.out.println(rp1.area());
		System.out.println(rp1.around());
		System.out.println("\n------------------------\n");
	}
	
}
