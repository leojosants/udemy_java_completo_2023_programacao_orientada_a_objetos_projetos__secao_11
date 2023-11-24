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

		DateTimeFormatter formatter_1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter_2 = DateTimeFormatter.ofPattern("dd/MM/yyyy MM:mm");
		DateTimeFormatter formatter_3 = DateTimeFormatter.ofPattern("dd/MM/yyyy MM:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter formatter_4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter formatter_5 = DateTimeFormatter.ISO_INSTANT;


		System.out.println("\n---------- Exibindo dados ----------");
		System.out.printf("date_4: %s%n", date_4);
		System.out.printf("date_4: %s%n", date_4.format(formatter_1));
		System.out.printf("date_4: %s%n", formatter_1.format(date_4));
		System.out.printf("date_4: %s%n", date_4.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		System.out.printf("date_5: %s%n", date_5.format(formatter_1));
		System.out.printf("date_5: %s%n", date_5.format(formatter_2));
		System.out.printf("date_5: %s%n", date_5.format(formatter_4));
		
		System.out.printf("date_6: %s%n", formatter_3.format(date_6));
		System.out.printf("date_6: %s%n", formatter_5.format(date_6));
	}

}
