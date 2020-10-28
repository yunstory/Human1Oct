package oct28;

import java.util.Arrays;
import java.util.Scanner; 


	
public class test003 {
		


		  public static void main(String[] args) { 
		    Scanner scanner = new Scanner(System.in); 
		    System.out.println("정수 입력"); 
		    int x = scanner.nextInt(); 

		    //	배열 출력횟수 입력추가
		    System.out.println("배열 출력횟수는?");
		    int cnt = scanner.nextInt();

		    //	배열 만드는 부분
		    int array_a [] = new int[x*cnt]; 
		    int k = 0;
		    for(int j = 0; j < cnt ; j++) 	//	배열 출력횟수만큼 추가반복
		    for (int i = 1; i <= x; i++) // 값 넣기 편하도록 해당 기능 일부 수정
		    { 
		      array_a [k++] = i;  // 여기도 맞춰서 수정
		   } 

		   //	출력하는 부분
		   System.out.println(Arrays.toString(array_a)); 
		

	}

}
