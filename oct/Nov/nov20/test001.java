package nov20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class test001 {

	public static void main(String[] args) {
		
		//<integet > Integer Ŭ������ ���� �� ���� 
		//>> WrapperŬ���� 
		//boxing unboxing 
		
		//����
		ArrayList<Integer> arrList 
			=new ArrayList<Integer>();

		//�߰�
		arrList.add(60);
		arrList.add(50);
		arrList.add(40);
		arrList.add(30);
		arrList.add(20);
		arrList.add(10);
		arrList.add(0);
		
		//get���� Ȯ�� index�� ���� �ϳ��� ���� �о� �´� 
		for(int i=0; i<arrList.size();  i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println("\n ------------------------------ 1\n");
		
		//remove Int - index 
		arrList.remove(1); // arr[index] remove 
		
		//get���� Ȯ�� index�� ���� �ϳ��� ���� �о� �´� 
		for(int i : arrList) {
			System.out.println(i);
		}
		System.out.println("\n ------------------------------ 2\n");
		
		//remove Integer - arrName[index]
		arrList.remove((Integer)10); //arr[index] = value
		
		//get���� Ȯ�� index�� ���� �ϳ��� ���� �о� �´� 
		for(int i : arrList) {
			System.out.println(i);
		}
		System.out.println("\n ------------------------------ 3\n");
		
		

		Collections.sort(arrList); 
		
		Iterator<Integer> iter = arrList.iterator();
		//��hasNext ���� ��ġ���� ������ �����Ͱ� ������ true ������ false 
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("\n ------------------------------ 4\n");
		
		//ã�� �������� ��ġ ���� 
		int index = arrList.indexOf((Integer)10);
		System.out.println(index); //-1 ���� ���� ��� 
		index = arrList.indexOf(30);
		System.out.println(index); // 2��°��ġ
		System.out.println("\n ------------------------------ 5\n");
		//��������
		System.out.println(arrList.contains(60)); //true
		System.out.println(arrList.contains(14)); //false
		System.out.println("\n ------------------------------ 6\n");
		
		//���ϴ� ��ġ�� �� �߰� 
		arrList.add(3, 100);
		for(int i=0; i<arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println("\n ------------------------------ 6\n");
		

		
		//API�� ����
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
