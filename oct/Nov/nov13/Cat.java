package nov13;


public class Cat implements WHI, Sound{

	public void sound() {
		System.out.println("³Ä¿Ë");
	}
	
	public void run() {
		System.out.println("can run");
	}

	public void fly() {
		System.out.println("cant fly");
	}

	public void talk() {
		System.out.println("cant talk");
	}
	
	public void eye() {
		System.out.println("has big eyes");
	}
	
	public void leg() {
		System.out.println("has 4 legs");
	}

}
