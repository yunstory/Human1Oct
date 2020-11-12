package nov11;

class Animal{
	public static void displayName(Animal a) { //다형성이 있는 경우 
	//동물과 관련된 이름을 찍는 메소드 140	// 자동 형변환 ==?
		a.getName();
		a.move();
	}
//	public static void displayName(Human a) { //다형성이 없으면 이렇게 다 만들어줘야됨 
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
		System.out.println("먹는다.");
	}
	
	public void move() {
		System.out.println("움직인다.");
	}	
}

class Human extends Animal{
	
	public Human(String name) {
		super(name);		
	}
	@Override //부모에있는 메소드를 '재정의' 안붙여도 관계는 없으나 안전함을 위해 :) 
	public void move() { //"위에서 한 걸 '재정의' 했다" 한다 (overide)
		//@ 어노테이션 Spring에서는 @으로 프로그램 함 ㅡ.,ㅡ,,
		System.out.println("걷는다.");
	}
	
	public void read() {
		System.out.println("책을 읽는다.");
	}
}

class Tiger extends Animal{
	public Tiger(String name) {
		super(name);
	}
	public void move() {
		System.out.println("네발로 뛰어다님");
	}
	public void hunting() {
		System.out.println("사냥함");
	}
}


class Eagle extends Animal{
	public Eagle(String name) {
		super(name);
	}
	public void move() {
		System.out.println("날아다님");
	}
	
}

public class test002 {

	public static void main(String[] args) {
		
		Animal a = new Animal("호랑이는");
		a.getName();
		a.move();
		a.eat();
//		a.read(); >> 부모에 없는 부분이라 안됌!
//		a.hunting();

		System.out.println("\n----------------\n");
		Human h = new Human("너는");
		h.getName();
		h.move();	//자식의
		h.eat();
		h.read();
//		h.hunting(); >> 안됌!

		
		System.out.println("\n----------------\n");
		/* 다형성 : 부모에 자식을 넣을 수 있다. */
		Animal a0 = new Animal("홍길동0");
		Animal a1 = new Human("홍길동1");
		Animal a2 = new Tiger("홍길동2");
		Animal a3 = new Eagle("홍길동3");
		
		a0.eat();
		a0.getName();
		a0.move();
//		a0.read(); >> 안됌
//		((Human)a0).read(); >> 안됌

		System.out.println("\n----------------\n");
		a1.eat();
		a1.getName();
		a1.move(); //Animal 클래스 이지만 Human에서 '재정의' 하였기에 '재정의'된 값이 출력된다.
//		a1.read();안됌 >> 재정의 되지 않으면 부모를 통해 출력할 수 없음
		((Human)a1).read(); // 이런식으로 형변환 하여 접근하면 출력 가능 
		
		
		System.out.println("\n----------------\n");
		a2.eat();
		a2.getName();
		a2.move();
		
		System.out.println("\n----------------\n");
		a3.eat();
		a3.getName();
		a3.move();
		
		
		/* overload 메소드 이름은 같지만 매개변수가 다른 메소드 
		 	override 상속을 통해서 재정의된 메소드 
		 	
		 	부모클래스에 자식클래스를 넣은 인스턴스 
		 	기본적으로 부모의 메소드나 필드에 접근하나,
		 	override된 메소드는 자식 메소드가 출력 된다. 
		 	
		 	자식에 있는 메소드는 실행불가 
		 	굳이 실행시키고 싶다면 형변환 후 접근하여 출력 
		 	
		 	Human Tiger Eagle 하나의 배열에 넣어서 처리하는 방법 
		 	다형성을 이용해 처리.  */
		
		System.out.println("\n----------------\n");
		Animal[] arr = new Animal[4];
		arr[0] = a0; arr[1] = a1; arr[2] = a2; arr[3] = a3;
		
		for(Animal ani: arr) {
			ani.move();
		}
		
		//동물을 매개변수로 받아 name 출력하는 함수 
		System.out.println("\n----------------\n");
		Animal.displayName(a0);
		Animal.displayName(a1);
		Animal.displayName(a2);
		Animal.displayName(a3);
	}

}
