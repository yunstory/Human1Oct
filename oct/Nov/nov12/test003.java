package nov12;

interface Who{
	
	public void run();
	public void fly();
	public void talk();
	public void eye();
	public void leg();
	
}

class Snake implements Who{

	@Override
	public void run() {
		System.out.println("cant run");
		
	}

	@Override
	public void fly() {
		System.out.println("cant fly");
		
	}

	@Override
	public void talk() {
		System.out.println("cant talk");
		
	}
	
	public void eye() {
		System.out.println("has small eyes");
	}
	
	public void leg() {
		System.out.println("has no legs");
	}
}

class Cat implements Who{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("can run");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("cant fly");
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("cant talk");
	}
	
	public void eye() {
		System.out.println("has big eyes");
	}
	
	public void leg() {
		System.out.println("has 4 legs");
	}
}

class Bird implements Who{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("cant run");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("can fly");
		
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("cant talk");
	}
	
	public void eye() {
		System.out.println("has samll eyes");
	}
	
	public void leg() {
		System.out.println("has 2 legs");
	}
	
}


public class test003 {

	public static void main(String[] args) {
		
		Who snake = new Snake();
		Who cat = new Cat();
		Who bird = new Bird();
		
		Who whos[] = {snake, cat, bird};
		
		for(int i=0; i<whos.length; i++) {
			
			whos[i].run();
			whos[i].fly();
			whos[i].talk();
			whos[i].eye();
			whos[i].leg();
			
			System.out.println("WHI\n");
		}
		
		
	}
	
}
