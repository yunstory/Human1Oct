package nov24;

import java.util.Scanner;
import java.util.regex.Pattern;

public class test004 {

	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ֹ��Է�");
		String numnum = sc.nextLine();
		System.out.println("��ȣ�Է�");
		String telnum = sc.nextLine();
		System.out.println("�̸����Է�");
		String emailnum = sc.nextLine();
       
        //��ȿ�� �˻�
        boolean name_check = Pattern.matches("\\d{6}\\-[1-4]\\d{6}", numnum);
        boolean tel_check = Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", telnum);
        boolean email_check = Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?", emailnum);

        //���
        System.out.println("�ֹ� : " + numnum + " / " +name_check );
        System.out.println("��ȭ��ȣ : " + telnum + " / " +tel_check );
        System.out.println("�̸��� : " + emailnum +" / " + email_check);

	}

}
