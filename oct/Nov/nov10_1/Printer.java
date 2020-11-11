package nov10_1;

public class Printer {

	public static int numOfPapers = 0;
	
	public static void print(int amount) {
		
	}


	@Override
	public String toString() {
		return "Printer [numOfPapers=" + numOfPapers + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	public static int getNumOfPapers() {
		return numOfPapers;
	}


	public static void setNumOfPapers(int numOfPapers) {
		Printer.numOfPapers = numOfPapers;
	}

	
}
