package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		// https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html
		DateTimeFormatter formatter_1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter_2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDate date_1 = LocalDate.now();
		LocalDateTime date_2 = LocalDateTime.now();
		Instant date_3 = Instant.now();

		LocalDate date_4 = LocalDate.parse("2022-07-20");
		LocalDateTime date_5 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant date_6 = Instant.parse("2022-07-20T01:30:26Z");
		Instant date_7 = Instant.parse("2022-07-20T01:30:26-03:00");

		LocalDate date_8 = LocalDate.parse("20/07/2022", formatter_1);
		LocalDateTime date_9 = LocalDateTime.parse("20/07/2022 01:30", formatter_2);

		LocalDate date_10 = LocalDate.of(2022, 7, 20);
		LocalDateTime date_11 = LocalDateTime.of(2022, 7, 20, 2, 30);

		System.out.println("\n---------- Exibindo dados ----------");
		System.out.printf("date_1....: %s%n", date_1);
		System.out.printf("date_2....: %s%n", date_2);
		System.out.printf("date_3....: %s%n", date_3);
		System.out.printf("date_4....: %s%n", date_4);
		System.out.printf("date_5....: %s%n", date_5);
		System.out.printf("date_6....: %s%n", date_6);
		System.out.printf("date_7....: %s%n", date_7);
		System.out.printf("date_8....: %s%n", date_8);
		System.out.printf("date_9....: %s%n", date_9);
		System.out.printf("date_10...: %s%n", date_10);
		System.out.printf("date_11...: %s%n", date_11);

	}

}
