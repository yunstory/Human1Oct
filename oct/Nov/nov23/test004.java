package nov23;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class test004 {

	public static void main(String[] args) {
		
		//현재시간 얻어오기 => 짜증나게 시간날짜분리해서씀LocalTime/LocalDate
		LocalDateTime time1 = LocalDateTime.now();
		//System.out.println(time1); //2020-11-23T13:57:38.539
		System.out.println(time1);
		
		//이쁘게출력하기 yyyy/MM/dd HH:mm:ss
		//DateTimeFormatter format = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String fString = time1.format(format); 
		
		System.out.println(fString); //2020:00:23 02:00:57 
		
		
		//문자열을 로컬타입으로 포맷하는방법 ? 위 포맷 형식에 맞게출력
		String tString = "2020/03/23 02:03:57"; 
		LocalDateTime time2 = LocalDateTime.parse(tString, format);
		System.out.println(time2);

		
		//2달더하기
		LocalDateTime time3 = time2.plusMonths(2);
		time3 = time2.minusSeconds(10);
		
		System.out.println(time2);
		System.out.println(time3);
		
		//시간차이 
		long diff = ChronoUnit.MILLIS.between(time1, time2);
		diff = ChronoUnit.SECONDS.between(time1,time2);
		System.out.println(diff);
		
		//누가 더 큰지 확인
		System.out.println(time2.isBefore(time3)); //time2가 더 큰시간
		System.out.println(time2.isAfter(time3));
		
		//날짜를 찍고 원하는 스타일에 맞게 찍고 date연산자에 넣어줌 
		
	}

}
