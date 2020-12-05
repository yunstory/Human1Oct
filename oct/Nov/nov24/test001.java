package nov24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


//�񱳰����ؾ��ؼ� comparable ���� //�����Ҷ� �� ���ľ��Ҳ��� ���ʿ� ��
class Rectangle implements Comparable<Rectangle>{ //compareTo�� ������ �ؾ� ��� ���� 
	public double width, height;
	
	//���� ũ���� ����
	public double area() {
		return width * height;
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	//��ü������ ���� 
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	@Override
	//equlas �������Ϸ��� �ʼ� 
	public int hashCode() {
		//hashŰ�� �̿��ؼ� �ε����� ����
		//�������� ���� ���� => �ؽ��ڵ尡 ����? => �ٸ����� ���� 
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
	//�Ѵ� ���ƾ� ������ü�� �� height üũ widthüũ 
	//üũ�Ѿְ� ���ϰ��� �ϴ� ��� height�� üũ�� height�� ������ �����ַ� ��
	//��ü��
	public boolean equals(Object obj) {
		if (this == obj) // ������ �ٸ��� �� ~ 
			return true;
		if (obj == null) 
			return false;
		if (getClass() != obj.getClass()) 
			return false;
		Rectangle other = (Rectangle) obj;
		//�� ��ü�� width height �� 
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		//���̰� ������ �� 
//		if(this.width * this.height == other.width * other.height) {
//			return true;
//		}else {
//			return false;
//		}
		return true;
	}

	
	
	
	
	//implements �ϰ� �߰��� �޼ҵ�

	@Override
	public int compareTo(Rectangle other) {
		// TODO Auto-generated method stub
		//�ڱ��ڽŰ� area �Ű����� �� 
		int returnValue = 0; //��ȯ ���� 
		if(this.area() == other.area()) {
			returnValue = 0;
		}else if(this.area() > other.area()){
			returnValue = -1;
		}else if(this.area() < other.area()){
			returnValue = 1;
		}
		//this�� other ���ؼ� this�� ũ�� 
		//-1 return => �������� ���� 
		//1 return => �������� ���� 
		// -1;��ȯ�ʿ� 0:���� 1:��ȯ���ʿ� 
		return returnValue;
	}

}

//�������� Ŭ����
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
		//�÷����� ����Ϸ��� equals�� hashCode�� ������ ����ߵ�
		//array�ڵ�� hachCode�ʿ� ���� �Ⱦ������� 
		
		//int String �츮�� ���� Ŭ������ �ƴ�. 
		
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
		//�ּҰ� �޶� �ٸ���ü ? new�� ���� ����� �ּҴ� ������ ��ü�� �ٸ�
		//equals�� ������� ������ ���࿩��. �ȱ׷� object�� ��ü?�� ���� ��
		arrList.remove(new Rectangle(12, 12)); //heshCode equals �ۼ� �����ָ� �� ����
		for(Rectangle r : arrList) {
			System.out.println(r);
		}
		
		System.out.println("\n               \n");
		
		//equals ������ �ϸ� hashCode��������
		Rectangle rect = new Rectangle(15, 15); //���� �ּҷ� �ְ� ����� �� = ������ü�ν�
		arrList.add(rect);
		arrList.remove(rect);
		for(Rectangle r : arrList) {
			System.out.println(r);
		}
		
		
		
		System.out.println("\n               \n");

		
		//��ü����
		//compareTo , compare  ������ ����� ���� ����
		//�� comparable  �������̽� �Ű����� 1�� �ڽ��ڽ� �Ű����� �� 
		//�� comparator �������̽�  �Ű����� 2�� �Ű����� 2�� ��
		Collections.sort(arrList);

		for(Rectangle r : arrList) {
			System.out.println(r);
		}
		
		//width �Ǵ� height�� ���� 
		//�͸�Ŭ���� 
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
		
		
		//Collections.sort(arrList,new RectangleWidthAsc()); // ������ �Ʒ��� 
		RectangleWidthAsc rAsc = new RectangleWidthAsc(); //��� �츮�� ���� ���
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
