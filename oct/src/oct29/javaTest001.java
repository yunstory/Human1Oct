package oct29;

import java.util.Arrays;

public class javaTest001 {

	public static void main(String[] args) {
		
		//Ω‹«Æ¿Ã
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		String direction = "";
		int moveCount = 0;
		int changeNum = 0;
		
		moveFunc(a, direction,moveCount,changeNum);
	
		System.out.println(Arrays.toString(a));
    }

	private static void moveFunc(int[] a, String direction, int moveCount, int changeNum) {
		 for(int j=0; j<moveCount;j++) {
		 int temp = a[a.length-1];
		 if(changeNum>=0) {
			 temp = changeNum;
		 }
		 for(int i=a.length-2; i>=0;i--) {
			 a[i+1]=a[i];
		 }
		 a[0]=temp;
	 }
		 
		//i=2 ~ 50Ω‹«Æ¿Ã
		
//		int arr[] = new int[100];
//		for(int k=0; k<100; k++) {
//			arr[k] = k;
//		}
//		
////		int i=3;
//		for(int i=2; i<50; i++) {
//			for(int j=i+i; j<=99; j += i) {
//				arr[j]=0;
//			}
//		}
//		for(int i:arr) {
//			if(i != 0) {
//				System.out.println(i);
//			}
//		}
//		//System.out.println(Arrays.toString(arr));
		
		//∫Ûµµºˆ
//		int arr[] = {0, 0, 0, 0, 0, 0};
//		
//		for(int i=0; i<2000; i++) {
//			int rNum = (int)(Math.random()*6);
//			arr[rNum]++;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		//æÀ∆ƒ∫™ ∫Ûµµºˆ 'a'-'a'==0 'b'-'a'=1
		
		

	}

}
