package oct28;

import java.util.Arrays;
import java.util.Scanner; 


	
public class test003 {
		

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		int e[]= {1,2,3,4,5,6,7,8,9};
		System.out.print("�̵�����>> 1.����  2.������  ");
		int e1=sc.nextInt();
		System.out.print("�̵�ĭ��>> ");
		int e2=sc.nextInt();
		System.out.print("�� ������ ���� ����>> ");
		int e3=sc.nextInt();
		int[] ee=new int[e.length];
		if(e1==1) {
			for(int i=0;i<e.length;i++) {
				if(i<e.length-e2) {
					ee[i]=e[i+e2];
				}else {
					ee[i]=e3;
				}
			}
		}else {
			for(int i=0;i<e.length;i++) {
				if(i<e2) {
					ee[i]=e3;
				}else {
					ee[i]=e[i-e2];
				}
			}
		}
		System.out.println(Arrays.toString(ee));

	}

}
