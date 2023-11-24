package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		// https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html

		LocalDate date_4 = LocalDate.parse("2022-07-20");
		LocalDateTime date_5 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant date_6 = Instant.parse("2022-07-20T01:30:26Z");

//		for (String string : ZoneId.getAvailableZoneIds()) {
//			System.out.println(string);
//		}

		LocalDate result_1 = LocalDate.ofInstant(date_6, ZoneId.systemDefault());
		LocalDate result_2 = LocalDate.ofInstant(date_6, ZoneId.of("Portugal"));

		LocalDateTime result_3 = LocalDateTime.ofInstant(date_6, ZoneId.systemDefault());
		LocalDateTime result_4 = LocalDateTime.ofInstant(date_6, ZoneId.of("Portugal"));

		System.out.println("\n----------Exibindo dados -----------");
		System.out.printf("result_1.........: %s%n", result_1);
		System.out.printf("result_2.........: %s%n", result_2);
		System.out.printf("result_3.........: %s%n", result_3);
		System.out.printf("result_4.........: %s%n", result_4);
	
		System.out.printf("date_4...........: %s%n", date_4);
		System.out.printf("date_4 dia.......: %s%n", date_4.getDayOfMonth());
		System.out.printf("date_4 mes.......: %s%n", date_4.getMonthValue());
		System.out.printf("date_4 ano.......: %s%n", date_4.getYear());
		
		System.out.printf("date_5...........: %s%n", date_5);
		System.out.printf("date_5 dia.......: %s%n", date_5.getDayOfMonth());
		System.out.printf("date_5 mes.......: %s%n", date_5.getMonthValue());
		System.out.printf("date_5 ano.......: %s%n", date_5.getYear());
		System.out.printf("date_5 hora......: %s%n", date_5.getHour());
		System.out.printf("date_5 minutos...: %s%n", date_5.getMinute());
		System.out.printf("date_5 segundos..: %s%n", date_5.getSecond());
	}

}
