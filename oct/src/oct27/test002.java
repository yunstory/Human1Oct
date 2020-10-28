package oct27;

import java.util.Scanner;

public class test002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		
		for(int i=1; i<=100; i++) {
			if(i/10==3||i/10==6||i/10==9) {
				System.out.println("짝짝");
			}else if(i%10==3||i%10==6||i%10==9) {
				System.out.println("짝");
			}else {
			System.out.println(i);
			}
		}
		
		
		
		
		
//		int num = (int)(Math.random()*9+1);
//		int o = 0; 
//		int x = 0;
//		
//
//		while(true) {
//			System.out.print("숫자입력 : ");
//			int i = Integer.parseInt(sc.nextLine());
//			
//			if(i==num) {
//				o++;
//				System.out.println("정답입니다  \n");
//				break;
//			}else {
//				System.out.print("오답입니다 ::");
//				x++;
//				if(i>num) {
//					System.out.println("보다 작은 수를 입력해주세요\n");
//				}else {
//					System.out.println("보다 큰 수를 입력해주세요\n");
//				}
//			}
//		}
//		System.out.println("게임 총" + (o+x) + "회 번째에 맞춤");
		
		

		
	}

}
