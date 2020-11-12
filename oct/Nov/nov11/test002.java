package nov11;

class Animal{
	public static void displayName(Animal a) { //�������� �ִ� ��� 
	//������ ���õ� �̸��� ��� �޼ҵ� 140	// �ڵ� ����ȯ ==?
		a.getName();
		a.move();
	}
//	public static void displayName(Human a) { //�������� ������ �̷��� �� �������ߵ� 
//		a.getName();
//		a.move();
//	}
//	public static void displayName(Tiger a) {	
//		a.getName();
//		a.move();
//	}
//	public static void displayName(Eagle a) {	
//		a.getName();
//		a.move();
//	}
	
	
	public String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public void getName() {
		System.out.println(name);
	}
	
	public void eat() {
		System.out.println("�Դ´�.");
	}
	
	public void move() {
		System.out.println("�����δ�.");
	}	
}

class Human extends Animal{
	
	public Human(String name) {
		super(name);		
	}
	@Override //�θ��ִ� �޼ҵ带 '������' �Ⱥٿ��� ����� ������ �������� ���� :) 
	public void move() { //"������ �� �� '������' �ߴ�" �Ѵ� (overide)
		//@ ������̼� Spring������ @���� ���α׷� �� ��.,��,,
		System.out.println("�ȴ´�.");
	}
	
	public void read() {
		System.out.println("å�� �д´�.");
	}
}

class Tiger extends Animal{
	public Tiger(String name) {
		super(name);
	}
	public void move() {
		System.out.println("�׹߷� �پ�ٴ�");
	}
	public void hunting() {
		System.out.println("�����");
	}
}


class Eagle extends Animal{
	public Eagle(String name) {
		super(name);
	}
	public void move() {
		System.out.println("���ƴٴ�");
	}
	
}

public class test002 {

	public static void main(String[] args) {
		
		Animal a = new Animal("ȣ���̴�");
		a.getName();
		a.move();
		a.eat();
//		a.read(); >> �θ� ���� �κ��̶� �ȉ�!
//		a.hunting();

		System.out.println("\n----------------\n");
		Human h = new Human("�ʴ�");
		h.getName();
		h.move();	//�ڽ���
		h.eat();
		h.read();
//		h.hunting(); >> �ȉ�!

		
		System.out.println("\n----------------\n");
		/* ������ : �θ� �ڽ��� ���� �� �ִ�. */
		Animal a0 = new Animal("ȫ�浿0");
		Animal a1 = new Human("ȫ�浿1");
		Animal a2 = new Tiger("ȫ�浿2");
		Animal a3 = new Eagle("ȫ�浿3");
		
		a0.eat();
		a0.getName();
		a0.move();
//		a0.read(); >> �ȉ�
//		((Human)a0).read(); >> �ȉ�

		System.out.println("\n----------------\n");
		a1.eat();
		a1.getName();
		a1.move(); //Animal Ŭ���� ������ Human���� '������' �Ͽ��⿡ '������'�� ���� ��µȴ�.
//		a1.read();�ȉ� >> ������ ���� ������ �θ� ���� ����� �� ����
		((Human)a1).read(); // �̷������� ����ȯ �Ͽ� �����ϸ� ��� ���� 
		
		
		System.out.println("\n----------------\n");
		a2.eat();
		a2.getName();
		a2.move();
		
		System.out.println("\n----------------\n");
		a3.eat();
		a3.getName();
		a3.move();
		
		
		/* overload �޼ҵ� �̸��� ������ �Ű������� �ٸ� �޼ҵ� 
		 	override ����� ���ؼ� �����ǵ� �޼ҵ� 
		 	
		 	�θ�Ŭ������ �ڽ�Ŭ������ ���� �ν��Ͻ� 
		 	�⺻������ �θ��� �޼ҵ峪 �ʵ忡 �����ϳ�,
		 	override�� �޼ҵ�� �ڽ� �޼ҵ尡 ��� �ȴ�. 
		 	
		 	�ڽĿ� �ִ� �޼ҵ�� ����Ұ� 
		 	���� �����Ű�� �ʹٸ� ����ȯ �� �����Ͽ� ��� 
		 	
		 	Human Tiger Eagle �ϳ��� �迭�� �־ ó���ϴ� ��� 
		 	�������� �̿��� ó��.  */
		
		System.out.println("\n----------------\n");
		Animal[] arr = new Animal[4];
		arr[0] = a0; arr[1] = a1; arr[2] = a2; arr[3] = a3;
		
		for(Animal ani: arr) {
			ani.move();
		}
		
		//������ �Ű������� �޾� name ����ϴ� �Լ� 
		System.out.println("\n----------------\n");
		Animal.displayName(a0);
		Animal.displayName(a1);
		Animal.displayName(a2);
		Animal.displayName(a3);
	}

}
