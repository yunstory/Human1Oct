package nov24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test002 {

	public static void main(String[] args) {
		
		
		String num =  "\\d{6}\\-[1-4]\\d{6}";
		Pattern np = Pattern.compile(num); 
		
		String test1 = ("000000-1111111"); 
		Matcher m1 = np.matcher(test1);
		
		if(m1.find()) { 
			System.out.println("주민 형식이 맞습니다. " + test1);
		}else {
			System.out.println("주민 형식이 아닙니다. "+ test1);
		}
		
		
		String phone = "^01(?:0|1|6-9])-(?:\\d{3}|\\d{4})-\\d{4}$";
		Pattern pp = Pattern.compile(phone); 
		
		String test2 = ("010-0123-4567"); 
		Matcher m2 = pp.matcher(test2);
		
		if(m2.find()) { 
			System.out.println("휴대전화 형식이 맞습니다. " + test2);
		}else {
			System.out.println("휴대전화 형식이 아닙니다. "+ test2);
		}
		
		
		String email = "^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$";
		Pattern ep = Pattern.compile(email); 
		
		String test3 = ("dfdsfs@naver.com"); 
		Matcher m3 = ep.matcher(test3);
		
		if(m3.find()) { 
			System.out.println("이메일 형식이 맞습니다. " + test3);
		}else {
			System.out.println("이메일 형식이 아닙니다. "+ test3);
		}
		
		
		
		
		
		
	}

}
