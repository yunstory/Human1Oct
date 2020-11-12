package nov11;

class Fruit{
	
	public String fruit;
	
	public Fruit(String fruit) {
		super();
		this.fruit = fruit;
	}
	

	public void getFruit() {
		System.out.println(fruit+" 는/은");
	}

	public void name() {
		System.out.println("원숭이엉덩이");
	}
	
	public void color() {
		System.out.println("빨게");
	}
	
	public void eat() {
		System.out.println("맛있음");
	}
	
	public static void displayFruit(Fruit x) {
		x.getFruit();
		x.color();
		x.eat();
	}
}

class Banana extends Fruit{
	
	public Banana(String fruit) {
		super(fruit);
	}
	
	@Override 
	public void color() {
		System.out.println("노래");
	}
	
	public void length() {
		System.out.println("길어");
	}
	

}

class Grape extends Fruit{
	
	public Grape(String fruit) {
		super(fruit);
	}
	
	public void color() {
		System.out.println("보래");
	}
}

class Pear extends Fruit{
	
	public Pear(String fruit) {
		super(fruit);
	}
	
	public void color() {
		System.out.println("황토인걸까");
	}
	
	@Override 
	public void eat() {
		System.out.println("맛없음");
	}
	
}

public class test004 {

	public static void main(String[] args) {
		
		Fruit f = new Fruit("사과");
		f.name();
		f.color();
		f.getFruit();
		f.eat();
		
		Banana b = new Banana("바나나");
		b.getFruit();
		b.color();
		b.length();
		b.eat();
		
		Grape g = new Grape("포도");
		g.getFruit();
		g.color();
		g.eat();
		
		Pear p = new Pear("배");
		p.getFruit();
		p.color();
		p.eat();
		
		System.out.println("\n----------------\n");
		
		Fruit f0 = new Fruit("과일0");
		Fruit f1 = new Banana("과일1");
		Fruit f2 = new Grape("과일2");
		Fruit f3 = new Pear("과일3");
		// 1번
//		x0.getFruit();
//		x0.color();
//		x0.eat();
//		
//		x1.getFruit();
//		x1.color();
//		x1.eat();
//		
//		x2.getFruit();
//		x2.color();
//		x2.eat();
//		
//		x3.getFruit();
//		x3.color();
//		x3.eat();
		
		System.out.println("\n----------------\n");
		//2번
//		Fruit[] arr = new Fruit[4];
//		arr[0] = x0; arr[1] = x1; arr[2] = x2; arr[3] = x3;
//
//		for(Fruit fru:arr) {
//			fru.getFruit();
//			fru.color();
//		}
		
		
		System.out.println("\n----------------\n");
		//3번
		Fruit.displayFruit(f0);
		Fruit.displayFruit(f1);
		Fruit.displayFruit(f2);
		Fruit.displayFruit(f3);
		
	}

}
