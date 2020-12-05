package nov24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


//비교가능해야해서 comparable 기준 //정렬할때 씀 정렬안할꺼면 쓸필요 ㄴ
class Rectangle implements Comparable<Rectangle>{ //compareTo를 재정의 해야 사용 가능 
	public double width, height;
	
	//넓이 크기대로 정렬
	public double area() {
		return width * height;
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	//객체찍을때 내용 
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	@Override
	//equlas 재정의하려면 필수 
	public int hashCode() {
		//hash키를 이용해서 인덱스를 얻어옴
		//이퀄스로 같게 구현 => 해쉬코드가 없다? => 다른데에 저장 
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	//둘다 같아야 같은객체로 봄 height 체크 width체크 
	//체크한애가 비교하고자 하는 대상 height만 체크시 height만 같으면 같은애로 봄
	//객체비교
	public boolean equals(Object obj) {
		if (this == obj) // 같은지 다른지 비교 ~ 
			return true;
		if (obj == null) 
			return false;
		if (getClass() != obj.getClass()) 
			return false;
		Rectangle other = (Rectangle) obj;
		//두 객체의 width height 비교 
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		//넓이가 같은지 비교 
//		if(this.width * this.height == other.width * other.height) {
//			return true;
//		}else {
//			return false;
//		}
		return true;
	}

	
	
	
	
	//implements 하고 추가된 메소드

	@Override
	public int compareTo(Rectangle other) {
		// TODO Auto-generated method stub
		//자기자신과 area 매개변수 비교 
		int returnValue = 0; //교환 없음 
		if(this.area() == other.area()) {
			returnValue = 0;
		}else if(this.area() > other.area()){
			returnValue = -1;
		}else if(this.area() < other.area()){
			returnValue = 1;
		}
		//this와 other 비교해서 this가 크면 
		//-1 return => 내림차순 정렬 
		//1 return => 오름차순 정렬 
		// -1;교환필요 0:같음 1:교환불필요 
		return returnValue;
	}

}

//오름차순 클래스
class RectangleWidthAsc implements  Comparator<Rectangle>{

	@Override
	public int compare(Rectangle arg0, Rectangle arg1) {
		int returnValue = 0;
		
		if(arg0.width > arg1.width) {
			returnValue = 1;
		}else if(arg0.width < arg1.width){
			returnValue = -1;
		}else {
			
		}
		return returnValue;
	}
	
}

public class test001 {


	public static void main(String[] args) {
		//컬렉션을 사용하려면 equals랑 hashCode를 재정의 해줘야됨
		//array코드는 hachCode필요 없음 안쓰고있음 
		
		//int String 우리가 만든 클래스가 아님. 
		
		System.out.println(new Rectangle(10, 10));
		
		ArrayList<Rectangle> arrList = new ArrayList<Rectangle>();
		
		arrList.add(new Rectangle(10, 10));
		arrList.add(new Rectangle(11, 11));
		arrList.add(new Rectangle(12, 12));
		arrList.add(new Rectangle(13, 13));
		arrList.add(new Rectangle(14, 14));
		arrList.add(new Rectangle(13, 20));
		
		for(int i=0; i<arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		System.out.println("\n               \n");
		
		arrList.remove(1);
		//주소가 달라서 다른객체 ? new로 새로 만들고 주소는 같지만 객체는 다름
		//equals를 지우려면 재정의 해줘여됨. 안그럼 object의 객체?를 쓰게 됨
		arrList.remove(new Rectangle(12, 12)); //heshCode equals 작성 안해주면 일 안함
		for(Rectangle r : arrList) {
			System.out.println(r);
		}
		
		System.out.println("\n               \n");
		
		//equals 재정의 하면 hashCode도재정의
		Rectangle rect = new Rectangle(15, 15); //같은 주소로 넣고 지우고 함 = 같은객체인식
		arrList.add(rect);
		arrList.remove(rect);
		for(Rectangle r : arrList) {
			System.out.println(r);
		}
		
		
		
		System.out.println("\n               \n");

		
		//객체정렬
		//compareTo , compare  재정의 해줘야 구현 가능
		//ㄴ comparable  인터페이스 매개변수 1개 자시자신 매개변수 비교 
		//ㄴ comparator 인터페이스  매개변수 2개 매개변수 2개 비교
		Collections.sort(arrList);

		for(Rectangle r : arrList) {
			System.out.println(r);
		}
		
		//width 또는 height로 정렬 
		//익명클래스 
		Collections.sort(arrList, new Comparator<Rectangle>() {

			@Override
			public int compare(Rectangle arg0, Rectangle arg1) {
				int returnValue = 0;
				
				if(arg0.width > arg1.width) {
					returnValue = -1;
				}else if(arg0.width < arg1.width){
					returnValue = 1;
				}else {
					
				}
				return returnValue;
			}
		});
		
		System.out.println("\n               \n");
		for(Rectangle r : arrList) {
			System.out.println(r);
		}
		
		
		//Collections.sort(arrList,new RectangleWidthAsc()); // 어려우면 아랫줄 
		RectangleWidthAsc rAsc = new RectangleWidthAsc(); //평소 우리가 쓰던 방식
		Collections.sort(arrList, rAsc);
		System.out.println("\n               \n");
		for(Rectangle r : arrList) {
			System.out.println(r);
		}
		
		Collections.sort(arrList,(a,b)->{
			int returnValue = 0; 
			if(((Rectangle)a).height<((Rectangle)b).height) {
				returnValue = 1;
			}else if(((Rectangle)a).height>((Rectangle)b).height)
				returnValue = -1;
			return returnValue;
		});
		System.out.println("\n               \n");
		for(Rectangle r : arrList) {
			System.out.println(r);
		}

		
		
		
		
		
//		Comparator<Rectangle> com = new Comparator<Rectangle>() {
//			@Override
//			public int compare(Rectangle o1, Rectangle o2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};	
//		Collections.sort(arrList, com);
		
	
		
	}
	
	
}
