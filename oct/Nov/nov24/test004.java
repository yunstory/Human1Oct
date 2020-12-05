package nov24;

import java.util.Scanner;
import java.util.regex.Pattern;

public class test004 {

	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민입력");
		String numnum = sc.nextLine();
		System.out.println("번호입력");
		String telnum = sc.nextLine();
		System.out.println("이메일입력");
		String emailnum = sc.nextLine();
       
        //유효성 검사
        boolean name_check = Pattern.matches("\\d{6}\\-[1-4]\\d{6}", numnum);
        boolean tel_check = Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", telnum);
        boolean email_check = Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?", emailnum);

        //출력
        System.out.println("주민 : " + numnum + " / " +name_check );
        System.out.println("전화번호 : " + telnum + " / " +tel_check );
        System.out.println("이메일 : " + emailnum +" / " + email_check);

	}

}
