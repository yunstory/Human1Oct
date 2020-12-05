package nov20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class test001 {

	public static void main(String[] args) {
		
		//<integet > Integer 클래스만 넣을 수 있음 
		//>> Wrapper클래스 
		//boxing unboxing 
		
		//선언
		ArrayList<Integer> arrList 
			=new ArrayList<Integer>();

		//추가
		arrList.add(60);
		arrList.add(50);
		arrList.add(40);
		arrList.add(30);
		arrList.add(20);
		arrList.add(10);
		arrList.add(0);
		
		//get으로 확인 index를 통해 하나씩 값을 읽어 온다 
		for(int i=0; i<arrList.size();  i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println("\n ------------------------------ 1\n");
		
		//remove Int - index 
		arrList.remove(1); // arr[index] remove 
		
		//get으로 확인 index를 통해 하나씩 값을 읽어 온다 
		for(int i : arrList) {
			System.out.println(i);
		}
		System.out.println("\n ------------------------------ 2\n");
		
		//remove Integer - arrName[index]
		arrList.remove((Integer)10); //arr[index] = value
		
		//get으로 확인 index를 통해 하나씩 값을 읽어 온다 
		for(int i : arrList) {
			System.out.println(i);
		}
		System.out.println("\n ------------------------------ 3\n");
		
		

		Collections.sort(arrList); 
		
		Iterator<Integer> iter = arrList.iterator();
		//ㅓhasNext 현재 위치에서 다음에 데이터가 있으면 true 없으면 false 
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("\n ------------------------------ 4\n");
		
		//찾는 데이터의 위치 리턴 
		int index = arrList.indexOf((Integer)10);
		System.out.println(index); //-1 값이 없는 경우 
		index = arrList.indexOf(30);
		System.out.println(index); // 2번째위치
		System.out.println("\n ------------------------------ 5\n");
		//존재유무
		System.out.println(arrList.contains(60)); //true
		System.out.println(arrList.contains(14)); //false
		System.out.println("\n ------------------------------ 6\n");
		
		//원하는 위치에 값 추가 
		arrList.add(3, 100);
		for(int i=0; i<arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println("\n ------------------------------ 6\n");
		

		
		//API로 공뷰
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
