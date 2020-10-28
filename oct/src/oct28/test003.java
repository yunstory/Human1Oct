package oct28;

public class test003 {

	public static void main(String[] args) {
		
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println(">>");
		int i=Integer.parseInt(sc.nextLine());
		int a[]=new int[i];
		for(int j=0,k=1;j<i;j++,k++) {
		a[j]=k;
		if(k==3)
		k=0;
		}
		for(int j=0;j<i;j++) {
		System.out.println(a[j]);
		}
		
		

	}

}
