package nov10;

import nov10_1.Retangle;
import nov10_1.Singleton;

public class test001 {

	public static void main(String[] args) {
			
			//Singleton s = new Singleton(); 가져올 수 없음 
			Singleton s = Singleton.getInstance();
			s.count++;
			System.out.println(s.count);
			
			Singleton s2 = Singleton.getInstance();
			s2.count ++;
			System.out.println(s2.count);
		
			Retangle r = Retangle.getInstance();
			System.out.println("width : " + r.getWidth());
			System.out.println("height : " + r.getHeight());
			
			r.setHeight(123); r.setWidth(321);
			System.out.println("width : " + r.getWidth());
			System.out.println("height : " + r.getHeight());
			System.out.println("height*width = " + r.area());
	}

}
