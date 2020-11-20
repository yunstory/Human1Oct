package nov13;

public class mainWHI {

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
