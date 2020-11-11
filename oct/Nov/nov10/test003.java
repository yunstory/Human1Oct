package nov10;

import nov10_1.Printer;

public class test003 {

	public static void main(String[] args) {
		
	Printer printer = new Printer();
	System.out.println(printer);
	
	printer.print(20); 
	printer.print(10);
	System.out.println(printer.getNumOfPapers());

	}

}
