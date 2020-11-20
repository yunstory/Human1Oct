package nov13;

class Bird implements WHI, Sound{

	public void sound() {
		System.out.println("Â±Â±Â°¾×");
	}
	
	public void run() {
		System.out.println("cant run");
	}

	public void fly() {
		System.out.println("can fly");
		
	}

	public void talk() {
		System.out.println("cant talk");
	}
	
	public void eye() {
		System.out.println("has samll eyes");
	}
	
	public void leg() {
		System.out.println("has 2 legs");
	}
	
}