package nov23;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class test002 {

	public static void main(String[] args) {
		Date date = new Date(); //현재시간을 저장한 객체 생성
		System.out.println(date); 
		date.setYear(2000);
		System.out.println(date);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);

		LocalDateTime currentTime2 = LocalDateTime.now();
		System.out.println(currentTime2);
		LocalDateTime currentTime3 = currentTime2.plusDays(5);
		System.out.println(currentTime3);
		LocalDateTime currentTime4 = currentTime2.minusMonths(2);
		System.out.println(currentTime4);
		
		
		
		LocalDateTime time = LocalDateTime.of(2020, 5, 6, 0, 0); //싱글톤이라 생성자 없음
		System.out.println(time);
		
		
		Duration duration = Duration.between(currentTime4, time);
		duration.getSeconds();
	}

}
