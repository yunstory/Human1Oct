package oct28;

import java.util.Arrays;
import java.util.Scanner; 


	
public class test003 {
		


		  public static void main(String[] args) { 
		    Scanner scanner = new Scanner(System.in); 
		    System.out.println("���� �Է�"); 
		    int x = scanner.nextInt(); 

		    //	�迭 ���Ƚ�� �Է��߰�
		    System.out.println("�迭 ���Ƚ����?");
		    int cnt = scanner.nextInt();

		    //	�迭 ����� �κ�
		    int array_a [] = new int[x*cnt]; 
		    int k = 0;
		    for(int j = 0; j < cnt ; j++) 	//	�迭 ���Ƚ����ŭ �߰��ݺ�
		    for (int i = 1; i <= x; i++) // �� �ֱ� ���ϵ��� �ش� ��� �Ϻ� ����
		    { 
		      array_a [k++] = i;  // ���⵵ ���缭 ����
		   } 

		   //	����ϴ� �κ�
		   System.out.println(Arrays.toString(array_a)); 
		

	}

}
