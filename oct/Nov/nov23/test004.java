package nov23;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class test004 {

	public static void main(String[] args) {
		
		//����ð� ������ => ¥������ �ð���¥�и��ؼ���LocalTime/LocalDate
		LocalDateTime time1 = LocalDateTime.now();
		//System.out.println(time1); //2020-11-23T13:57:38.539
		System.out.println(time1);
		
		//�̻ڰ�����ϱ� yyyy/MM/dd HH:mm:ss
		//DateTimeFormatter format = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String fString = time1.format(format); 
		
		System.out.println(fString); //2020:00:23 02:00:57 
		
		
		//���ڿ��� ����Ÿ������ �����ϴ¹�� ? �� ���� ���Ŀ� �°����
		String tString = "2020/03/23 02:03:57"; 
		LocalDateTime time2 = LocalDateTime.parse(tString, format);
		System.out.println(time2);

		
		//2�޴��ϱ�
		LocalDateTime time3 = time2.plusMonths(2);
		time3 = time2.minusSeconds(10);
		
		System.out.println(time2);
		System.out.println(time3);
		
		//�ð����� 
		long diff = ChronoUnit.MILLIS.between(time1, time2);
		diff = ChronoUnit.SECONDS.between(time1,time2);
		System.out.println(diff);
		
		//���� �� ū�� Ȯ��
		System.out.println(time2.isBefore(time3)); //time2�� �� ū�ð�
		System.out.println(time2.isAfter(time3));
		
		//��¥�� ��� ���ϴ� ��Ÿ�Ͽ� �°� ��� date�����ڿ� �־��� 
		
	}

}
