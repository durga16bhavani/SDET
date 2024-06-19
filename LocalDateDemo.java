package javaprograms.DateandTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {

	public static void main(String[] args) {
		//current Date
		LocalDate currentDate=LocalDate.now();
		
		System.out.println("Todays date:"+currentDate);
		
		LocalDate parseDate=LocalDate.parse("2024-05-23");
		
		System.out.println(parseDate);
		
		LocalDate specificDate=LocalDate.of(2024,4, 21);
		System.out.println(specificDate);
		
		LocalDate nextMonth=specificDate.plusMonths(1);
		System.out.println(nextMonth);
		
		//specific time
		LocalTime specificTime=LocalTime.of(12,36, 0);
		System.out.println(specificTime);
		
		LocalTime time=LocalTime.of(14,30, 0);
		
		//adding hours
		LocalTime latertime=time.plusHours(2);
		System.out.println(latertime);
		
		LocalDateTime currentDateTime=LocalDateTime.now();
		System.out.println("Today's date:"+currentDateTime);
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss");
		String formattedDateTime=currentDateTime.format(formatter);
		
		System.out.println(formattedDateTime);

	}

}
