package oct27;

public class Star01 {

	public static void main(String[] args) {
		
		
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------------1STAR");
		
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------------2STAR");

		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------3STAR");
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=i-1; j++) {
			System.out.print(" ");
			}
			for(int k=1; k<=9-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------4STAR");
		
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
			}else {
				for(int k=0; k<=9-i; k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("--------------------------5STAR");
		
		
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				for(int j=1; j<=5-i; j++) {
					System.out.print(" ");
				}
				for(int k=1; k<=i; k++) {
					System.out.print("*");
				}
			}else {
				for(int k=1; k<=i-5; k++) {
					System.out.print(" ");
				}
				for(int j=0; j<=9-i; j++) {
					System.out.print("*");
				}
				

			}
			System.out.println();
		}
		
		System.out.println("--------------------------6STAR");

		
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				for(int j=0; j<=5-i; j++) {
					System.out.print("*");
				}
			}else {
				for(int j=0; j<=i-5; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println("--------------------------7STAR");
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=5-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------8STAR");
	}
}
