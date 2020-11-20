package nov13_1;
interface Sound {
	
	public void sound();
}

interface WHI {
	
	public void run();
	public void fly();
	public void talk();
	public void eye();
	public void leg();
}
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

class Snake implements WHI, Sound{

	public void sound() {
		System.out.println("½¬ÀÍ..?");
	}
	public void run() {
		System.out.println("cant run");
	}
	public void fly() {
		System.out.println("cant fly");
	}
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
class Cat implements WHI, Sound{

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
class Yuns implements WHI, Sound{

	public void sound() {
		System.out.println("¾È³çÇÏTh¤Ä¿ä¿ì");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("can run, LUV IT");
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("can not");
	}
	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("Im not good at Eng");
	}
	@Override
	public void eye() {
		// TODO Auto-generated method stub
		System.out.println("Little Big");
	}
	@Override
	public void leg() {
		// TODO Auto-generated method stub
		System.out.println("has 2 legs");
	}
}


public class allAddClass {

	public static void main(String[] args) {
	
		WHI snake = new Snake();
		WHI cat = new Cat();
		WHI bird = new Bird();
		WHI yuns = new Yuns();
		Sound soundS = new Snake();
		Sound soundC = new Cat();
		Sound soundB = new Bird();
		Sound soundY = new Yuns();
		
		WHI whos[] = {snake, cat, bird, yuns};
		Sound crying[] = {soundS, soundC,  soundB, soundY};
		
		for(int i=0; i<whos.length; i++) {
			whos[i].run();
			whos[i].fly();
			whos[i].talk();
			whos[i].eye();
			whos[i].leg();
		
			crying[i].sound();

			System.out.println("WHI\n");
		}
	}
}
