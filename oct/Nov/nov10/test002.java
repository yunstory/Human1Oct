package nov10;

import nov10_1.Person;
import nov10_1.Shopping;

public class test002 {


	public static void main(String[] args) {
		

		Person man = Person.getInstance();
		System.out.println(man);

		
		System.out.println("\n--------------------\n"); 
		
		Shopping shop = Shopping.getInstance();
		System.out.println(shop);
		
		System.out.println("\n--------------------\n");
		
		shop.setName("È«±æ¶Ë");
		shop.setProduct("Floew-123");
		shop.setID("ddong");
		shop.setNum("1231231231");
		System.out.println(shop);
	}

}
