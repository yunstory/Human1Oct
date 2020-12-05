package nov23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test003 {

	public static void main(String[] args) {
		
		Date date1 = new Date(); 
		//System.out.println(date1); //Mon Nov 23 12:08:36 KST 2020
		System.out.println(date1.getTime()); //1606100916909
		//1970.01.01T00:00:00를 기준으로 1초마다 1000씩 증가 시켰을 때의 현재 시간숫자.
		
		
		Date date2 = new Date(date1.getTime()-1*1000*60*60*24);
		System.out.println(date1);
		System.out.println(date2);
		
		long diff = date1.getTime() - date2.getTime();
		System.out.println(diff);
		
		Date date3 = new Date(1606101372831L);
		diff = date1.getTime() - date3.getTime();
		System.out.println(diff);
		
		
		SimpleDateFormat sf1 = new SimpleDateFormat("yyyy년:mm:dd hh:mm:ss");
		System.out.println(sf1.format(date1));
		System.out.println(sf1.format(date2));
		
	
		try {
			Date date4 = sf1.parse("2000년05:02 11:11:11");
			System.out.println(date4);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
 
	}
	
}
