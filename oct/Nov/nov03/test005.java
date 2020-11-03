package nov03;

class 사각형{
	
	public int 직사각형의넓이 (int height, int width) {
		return height * width;
	}
	
	public int 직사각형의둘레 (int height, int width) {
		return 2*height + 2*width;
	}

}

class 삼각형{
	
}

class 원형{
	
}

public class test005 {
	
	public static void main(String[] args) {


	//직사각형 넓이,둘레 
	
	사각형 사 = new 사각형();
	System.out.println("원의 둘레 : " + 사.직사각형의넓이(10,20));
	System.out.println("원의 둘레 : " + 사.직사각형의둘레(30,20));
	
	//삼각형 넓이,둘레 
	
	//원형 넓이,둘레 
	
}	
}
