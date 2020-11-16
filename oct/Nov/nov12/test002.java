package nov12;

interface Toy{
	
	public void walk();
	public void run();
	public void alarm();
	public void light();
	
}

class ToyAirplane implements Toy{
	
	@Override
	public void walk() {
		System.out.println("The airplane can not walk");
	}

	@Override
	public void run() {
		System.out.println("The airplane can not run");
		
	}

	@Override
	public void alarm() {
		System.out.println("The airplane has alarm function");
	}

	@Override
	public void light() {
		System.out.println("The airplane has no light function");
	}
	
}

class ToyRobot implements Toy{

	@Override
	public void walk() {
		System.out.println("The robot can walk");
	}

	@Override
	public void run() {
		System.out.println("The robot can run");
		
	}

	@Override
	public void alarm() {
		System.out.println("The robot has no alarm function");
	}

	@Override
	public void light() {
		System.out.println("The robot has  light function");
	}
	
}



	
public class test002 {

	public static void main(String[] args) {
	
		Toy robot = new ToyRobot();
		Toy airplane = new ToyAirplane();
		
		Toy toys[] = {robot, airplane};
		
		for(int i=0; i<toys.length; i++) {
			toys[i].walk();
			toys[i].run();
			toys[i].alarm();
			toys[i].light();
			
			System.out.println();
		}
		
		
	}

}
