package nov23;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test001 {

	public static void main(String[] args) {
		
		System.out.print("\n------------equals------------\n");
		//equals 
		String equals1 = "Hello"; 
		String equals3 = "Hi";
		String equals4 = "Hello";
		
		System.out.println(equals1.equals(equals3)); //false
		System.out.println(equals1.equals(equals4)); //true
		
		
		System.out.print("\n------------concat------------\n");
		//concat
		String concat1 = "Welcome";
		String concat2 = " to ";
		String concat3 = "Yunsworld";
		
		String concat4 = concat1.concat(concat2); //Welcome to
		System.out.println(concat4);
		System.out.println(concat4.concat(concat3));//Welcome to Yunsworld
		
		
		System.out.print("\n-----------charAt-------------\n");
		//charAt
		String charAt1 = "ABCDE";
		String charAt2 = "abcde";
		
		System.out.println(charAt1.charAt(3)); //D
		System.out.println(charAt2.charAt(4)); //e
		
		
		System.out.print("\n-----------length-------------\n");
		//length
		String length1 = "Welcome to yunsworld";
		String length2 = "My name is yuns. Nice to meet you";
		
		System.out.println(length1.length()); //20
		System.out.println(length2.length()); //33
		
		
		System.out.print("\n-----------indexOf------------\n");
		//indexOf 
		String IndexOf1 = "chocolate";
		String IndexOf2 = "JavaChipFrappuccino";
		
		System.out.println(IndexOf1.indexOf("c")); //0
		System.out.println(IndexOf2.indexOf("i")); //6
		System.out.println(IndexOf2.indexOf("m")); //-1
		
		
		System.out.print("\n----------lastIndexOf-----------\n");
		String lastIndexOf1 = "chocolate";
		String lastIndexOf2 = "JavaChipFrappuccino";
		
		System.out.println(lastIndexOf1.lastIndexOf("c")); //3
		System.out.println(lastIndexOf2.lastIndexOf("i")); //16
		System.out.println(lastIndexOf2.lastIndexOf("m")); //-1
		
		
		System.out.print("\n-----------substring------------\n");
		String substring1 = "While there's life, there's hope.";
		String substring2 = "He who would travel happily must travel light.";
		
		System.out.println(substring1.lastIndexOf("there")); //20
		System.out.println(substring1.substring(20)); //there's hope. 
		System.out.println(substring2.indexOf("happily")); //18
		System.out.println(substring2.substring(20, 27)); //get
		
		
//		System.out.print("\n-------------TEST-------------\n");
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("�ֹε�Ϲ�ȣ �Է� (������ - ����)");
//		String test = sc.nextLine();
//		
//		if(test.charAt(7) == '1' || test.charAt(7) == '3') {
//			System.out.println("���ھ���");
//		}else if(test.charAt(7) == '2' || test.charAt(7) == '4'){
//			System.out.println("���ھ���");
//		}else {
//			System.out.println("error");
//		}
		
		
		System.out.print("\n-------------split--------------\n");
		String split1 = "��, ��, ��, ��, ��, ��, ��, ��, ��, ��, ��, ��";
		String split2 = "��, ��, ��, ��, ��, ��, ��, ��, ��, ��";
		
		String[] arr1 = split1.split(",");
		String[] arr2 = split2.split(",");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		
		System.out.print("\n----------toLowerCase-----------\n");
		String lower1 = "Without friends no one would choose to live, though he had all other goods.";
		System.out.println(lower1.toLowerCase());
		
		System.out.print("\n----------toUpperCase-----------\n");
		String upper1 = "Laughter is the closest distance between two people.";
		System.out.println(upper1.toUpperCase());
		
		
		System.out.print("\n-------------trim---------------\n");
		String trim1 = "                              welcome                         ";
		System.out.println(trim1.trim());
		
		
		System.out.print("\n----------StringBuilder-----------\n");
		String text = "¯��&ö��, ����, ����-�ͱ�";
		
		String[] names = text.split("&|, |-");
		
		for(String name : names) {
			System.out.println(name);
		}
		
		
		System.out.print("\n---------StringBuilderTest---------\n");
		String yuns = new String("");
		System.out.println("yuns ���ڿ� �ּ� : " + System.identityHashCode(yuns));
		
		StringBuilder buffer1 = new StringBuilder();
		System.out.println("�ʱ� buffer �޸� �ּ� : " + System.identityHashCode(buffer1));
		
		StringBuilder buffer = new StringBuilder(yuns);
		System.out.println("���� �� buffer �޸� �ּ� : " + System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is NG!!");
		
		System.out.println("���� �� buffer �޸� �ּ� : " + System.identityHashCode(buffer));
		
		yuns = buffer.toString();
		System.out.println(yuns); 
		System.out.println("����� yuns ���ڿ� �ּ� : " + System.identityHashCode(yuns));
		
		
		System.out.print("\n------StringBuilderTestExample-------\n");
		StringBuilder sb = new StringBuilder(); //��ü ���� 
		
		sb.append("Java "); 
		sb.append("Program Study"); // append ���ڿ� ���� ���� 
		System.out.println(sb.toString());
		
		sb.insert(4, "script"); //���ϴ� ��ġ�� �� ����
		System.out.println(sb.toString());
		
		sb.setCharAt(4, 'S'); //���ϴ� ��ġ ���� ����
		System.out.println(sb.toString());
		
		sb.replace(11, 18, "Programming"); //�ܾ����
		System.out.println(sb.toString());
		
		sb.delete(4, 10);
		System.out.println(sb.toString()); //�ܾ����
		
		int length = sb.length(); // ���� �� ��� 
		System.out.println("�� ���� �� : " + length + "��");
		
		String result = sb.toString();
		System.out.println(result); // ���ۿ� �ִ� ���� stringŸ������ ����
		
		
		System.out.print("\n----------PatternExample----------\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("this\nis\ntest\n".replaceAll("(^.*$)", "A"));
		System.out.println("this\nis\ntest\n".replaceAll("(?s)(^.*$)", "B"));
		System.out.println("this\nis\ntest\n".replaceAll("(?m)(^.*$)", "C"));

		
		String regExp = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$"; // �̸��� ���Խ�
		Pattern p = Pattern.compile(regExp); // Pattern ��ü ����(���ڿ� ���Խ�)
		
		String test = ("abcd1234@naver.com"); // �׽�Ʈ�� �̸���
		Matcher m = p.matcher(test); // Matcher ��ü ����(���ڿ� �˻��� ���ڿ�)
		String test1 = ("we_w.e-f@naver.com"); // �׽�Ʈ�� �̸���
		Matcher m1 = p.matcher(test1); // Matcher ��ü ����(���ڿ� �˻��� ���ڿ�)
		

		
		
		if(m.find()) { // 
			System.out.println("�̸����� ������ �½��ϴ�." + test);
		}
		else {
			System.out.println("�̸����� ������ �ƴմϴ�."+ test);
		}

		if(m1.find()) { // 
			System.out.println("�̸����� ������ �½��ϴ�."+ test1);
		}
		else {
			System.out.println("�̸����� ������ �ƴմϴ�."+ test1);
		}
		
		
		System.out.println("�̸��� �Է� >>");
		String test3 = sc.nextLine(); // �׽�Ʈ�� �̸���
		Matcher m3 = p.matcher(test3); // Matcher ��ü ����(���ڿ� �˻��� ���ڿ�)
		
		if(m3.find()) { // 
			System.out.println("�̸����� ������ �½��ϴ�."+ test3);
		}
		else {
			System.out.println("�̸����� ������ �ƴմϴ�."+ test3);
		}

	}
}

