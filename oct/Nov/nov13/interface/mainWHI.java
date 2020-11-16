package nov13;

public class mainWHI {

	public static void main(String[] args) {
	
		
		WHI snake = new Snake();
		WHI cat = new Cat();
		WHI bird = new Bird();
		
		WHI whos[] = {snake, cat, bird};
		
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
