package oct27;

import java.util.Scanner;

public class Star01 {

	public static void main(String[] args) {
		
		
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------------¡â1STAR");
		
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------------¡â2STAR");

		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------¡â3STAR");
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=i-1; j++) {
			System.out.print(" ");
			}
			for(int k=1; k<=9-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------¡â4STAR");
		
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
		
		System.out.println("--------------------------¡â5STAR");
		
		
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
		
		System.out.println("--------------------------¡â6STAR");

		
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

		System.out.println("--------------------------¡â7STAR");
		
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				for(int j=1; j<=i-1; j++) {
					System.out.print(" ");
				}
				for(int k=0; k<=5-i; k++) {
					System.out.print("*");
				}
			}else {
				for(int j=1; j<=9-i; j++) {
					System.out.print(" ");
				}
				for(int k=0; k<=i-5; k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("--------------------------¡â8STAR");
		
		
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				for(int j=0; j<=5-i; j++) {
					System.out.print("*");
				}
				for(int k=0; k<=i*2-2; k++) {
					System.out.print(" ");
				}
				for(int j=0; j<=5-i; j++) {
					System.out.print("*");
				}
			}else {
				for(int j=0; j<=i-5; j++) {
					System.out.print("*");
				}
				for(int k=0; k<=(9-i)*2; k++) {
					System.out.print(" ");
				}
				for(int j=0; j<=i-5; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
		System.out.println("--------------------------¡â9STAR");
		
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------------¡â10STAR");
		
		
		for(int i=1; i<=9; i++) {
			for(int k=1; k<=i-1; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<=(9-i)*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------¡â11STAR");
		
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				for(int k=1; k<=i-1; k++) {
					System.out.print(" ");
				}
				for(int j=0; j<=(5-i)*2; j++) {
					System.out.print("*");
				}
			}else {
				for(int k=1; k<=9-i; k++) {
					System.out.print(" ");
				}
				for(int j=0; j<=(i-5)*2; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("--------------------------¡â12STAR");
		

		for(int i=1; i<=9; i++) {
			if(i<=5) {
				for(int k=0; k<=5-i; k++) {
					System.out.print(" ");
				}
				for(int j=1; j<=4; j++) {
					System.out.print("*");
				}
			}else {
				for(int k=0; k<=i-5; k++) {
					System.out.print(" ");
				}
				for(int j=1; j<=4; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				for(int k=1; k<=i-1; k++) {
					System.out.print(" ");
				}
				for(int j=1; j<=4; j++) {
					System.out.print("*");
				}
			}else {
				for(int k=1; k<=9-i; k++) {
					System.out.print(" ");
				}
				for(int j=1; j<=4; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------------¡â13STAR");
		

		System.out.println("--------------------------¡â14STAR");
		
		
	}
}
