package oct26;

import java.util.Scanner;

public class test002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		// 3 6 9 놀이 
		int count = 0;
		
		System.out.print("게임 수 입력 : ");
		int j = Integer.parseInt(sc.nextLine());
		
		
		for(int i=1; i<=j; i++) {
			if(i%10==3||i%10==6||i%10==9) {
				System.out.println("짝");
			}else if(i/10==3||i/10==6||i/10==9){
				System.out.print("짝짝\t");
			}else {
				System.out.print(i+"\t");
				count++;
			}
		}
		
		


//		for(int Lv=1; Lv<=4; Lv++) {
//			if(Lv==1) {
//				
//				System.out.println("현재 Lv" + Lv);
//				int x = (int)(Math.random()*9+1);
//				int y = (int)(Math.random()*9+1);
//				System.out.print(x + " + " + y + " = ");
//				int z = Integer.parseInt(sc.nextLine());
//				if( (x+y) == z) {
//					System.out.println("다음단계로\n");
//				}else {
//					System.out.println("오답 / 재도전 해주세요 ");
//					break;
//				}
//			}else if(Lv==2) {
//				System.out.println("현재 Lv" + Lv);
//				int x = (int)(Math.random()*9+1);
//				int y = (int)(Math.random()*9+1);
//				System.out.print(x + " - " + y +  " = ");
//				int z = Integer.parseInt(sc.nextLine());
//					if( (x-y) == z) {
//						System.out.println("다음단계로\n");
//					}else {
//						System.out.println("오답 / 재도전 해주세요 ");
//						break;
//					}
//			}else if(Lv==3) {
//				System.out.println("현재 Lv" + Lv);
//				int x = (int)(Math.random()*9+1);
//				int y = (int)(Math.random()*9+1);
//				System.out.print(x + " % " + y + " = ");
//				double z = Double.parseDouble(sc.nextLine());
//					if( (x/y) == z) {
//						System.out.println("다음단계로\n");
//					}else {
//						System.out.println("오답 / 재도전 해주세요 ");
//						break;
//					}
//			}else if(Lv==4) {
//				System.out.println("현재 Lv" + Lv);
//				int x = (int)(Math.random()*9+1);
//				int y = (int)(Math.random()*9+1);
//
//				System.out.print(x + " * " + y +" = ");
//				int z = Integer.parseInt(sc.nextLine());
//					if( (x*y) == z) 
//						System.out.println("승급하러가세요");
//			}
			
			
		End:
		for(int Lv=1; Lv<=4; Lv++) {
			if(Lv==1) {
				for(int i=1; i<=5; i++) {
					int x = (int)(Math.random()*9+1);
					int y = (int)(Math.random()*9+1);
					System.out.print(x + " + " + y + " = ");
					int z = Integer.parseInt(sc.nextLine());
					if( (x+y) == z) {
						System.out.println("정답 " + i + "/5");
							if(i==5) 
								System.out.println("다음단계로");
					}else {
						System.out.println("오답 / 재도전 해주세요 ");
						break End;
					}
				}
			}else if(Lv==2) {
				for(int i=1; i<=5; i++) {
					int x = (int)(Math.random()*9+1);
					int y = (int)(Math.random()*9+1);
					System.out.print(x + " - " + y + " = ");
					int z = Integer.parseInt(sc.nextLine());
					if( (x-y) == z) {
						System.out.println("정답 " + i + "/5");
							if(i==5) 
								System.out.println("다음단계로");
					}else {
						System.out.println("오답 / 재도전 해주세요 ");
						break End;
					}
				}
			}else if(Lv==3) {
				for(int i=1; i<=5; i++) {
					int x = (int)(Math.random()*9+1);
					int y = (int)(Math.random()*9+1);
					System.out.print(x + " x " + y + " = ");
					int z = Integer.parseInt(sc.nextLine());
					if( (x*y) == z) {
						System.out.println("정답 " + i + "/5");
							if(i==5) 
								System.out.println("다음단계로");
					}else {
						System.out.println("오답 / 재도전 해주세요 ");
						break End;
					}
				}
			}else if(Lv==4) {
				for(int i=1; i<=5; i++) {
					int x = (int)(Math.random()*9+1);
					int y = (int)(Math.random()*9+1);
					System.out.print(x + " / " + y + " = ");
					int z = Integer.parseInt(sc.nextLine());
					if( (x/y) == z) {
						System.out.println("정답 " + i + "/5");
							if(i==5) 
								System.out.println("다음단계로");
					}else {
						System.out.println("오답 / 재도전 해주세요 ");
						break End;
					}
				}
			}
		}
		
		
		
		System.out.println();
		
		
	}}

