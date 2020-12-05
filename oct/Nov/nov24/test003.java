package nov24;

import java.util.Scanner;

public class test003 {

		    final private static String pattern1 = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,4}$";
		    final private static String pattern2 = "^(01\\\\d{1}|02|0505|0502|0506|0\\\\d{1,2})-?(\\\\d{3,4})-?(\\\\d{4})";
		    final private static String pattern3 = "\\\\d{6}\\\\-[1-4]\\\\d{6}";

			public static void main(String[] argrs) {
				Scanner scan=new Scanner(System.in);
				reInput(scan);
			}
			private static void reInput(Scanner scan){
				System.out.println("입력해주세요.");
				String parameter = scan.next();
				if(parameter.equals("exit")){
					System.out.println("종료합니다.");
					return;
				} else {
					for (int i = 0; i < 3; i++) {
						validPattern(parameter, i);	
					}
					System.out.println("------------------------------");
					reInput(scan);
				}
			}

		    //Pattern에 틀리면 True || 맞으면 False
		    private static boolean validPattern(String parameter, int patternNo) {
		        boolean validation = false;
		        switch (patternNo) {
		            case 0:
		                validation = parameter.matches(pattern1);
		                System.out.println("patternNo : "+patternNo+" : "+validation);
		                break;
		            case 1:
		                validation = parameter.matches(pattern2);
		                System.out.println("patternNo : "+patternNo+" : "+validation);
		                break;
		            case 2:
		                validation = parameter.matches(pattern3);
		                System.out.println("patternNo : "+patternNo+" : "+validation);
		                break;
		        }
		        return validation;
		    }
}