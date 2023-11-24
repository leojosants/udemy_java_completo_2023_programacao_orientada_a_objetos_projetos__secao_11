package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {

		// https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html

		LocalDate date_4 = LocalDate.parse("2022-07-20");
		LocalDateTime date_5 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant date_6 = Instant.parse("2022-07-20T01:30:26Z");

		LocalDate past_week_localDate = date_4.minusDays(7);
		LocalDate next_week_localDate = date_4.plusDays(7);
		LocalDate next_year_localDate = date_4.plusYears(1);

		LocalDateTime past_week_localDateTime = date_5.minusDays(7);
		LocalDateTime next_week_localDateTime = date_5.plusDays(7);
		LocalDateTime next_year_localDateTime = date_5.plusYears(1);
		LocalDateTime next_hours_localDateTime = date_5.plusHours(1);
		LocalDateTime next_minutes_localDateTime = date_5.plusMinutes(1);
		LocalDateTime next_seconds_localDateTime = date_5.plusSeconds(1);

		Instant past_week_instant = date_6.minus(7, ChronoUnit.DAYS);
		Instant next_week_instant = date_6.plus(7, ChronoUnit.DAYS);
//		Instant next_year_instant = date_6.plus(1, ChronoUnit.YEARS);
		Instant next_hours_instant = date_6.plus(1, ChronoUnit.HOURS);
		Instant next_minutes_instant = date_6.plus(1, ChronoUnit.MINUTES);
		Instant next_seconds_instant = date_6.plus(1, ChronoUnit.SECONDS);

		Duration duration_1 = Duration.between(past_week_localDate.atStartOfDay(), date_4.atStartOfDay());
		Duration duration_2 = Duration.between(past_week_localDateTime, date_5);
		Duration duration_3 = Duration.between(past_week_instant, date_6);
		Duration duration_4 = Duration.between(date_6, past_week_instant);

		System.out.println("\n----------Exibindo dados -----------");
		System.out.printf("Data..................: %s%n", date_4);
		System.out.printf("Subtraido  7 dias.....: %s%n", past_week_localDate);
		System.out.printf("Adicionado 7 dias.....: %s%n", next_week_localDate);
		System.out.printf("Adicionado 1 ano......: %s%n", next_year_localDate);

		System.out.println();

		System.out.printf("Data..................: %s%n", date_5);
		System.out.printf("Subtraido  7 dias.....: %s%n", past_week_localDateTime);
		System.out.printf("Adicionado 7 dias.....: %s%n", next_week_localDateTime);
		System.out.printf("Adicionado 1 ano......: %s%n", next_year_localDateTime);
		System.out.printf("Adicionado 1 hora.....: %s%n", next_hours_localDateTime);
		System.out.printf("Adicionado 1 minuto...: %s%n", next_minutes_localDateTime);
		System.out.printf("Adicionado 1 segundo..: %s%n", next_seconds_localDateTime);

		System.out.println();

		System.out.printf("Data..................: %s%n", date_5);
		System.out.printf("Subtraido  7 dias.....: %s%n", past_week_instant);
		System.out.printf("Adicionado 7 dias.....: %s%n", next_week_instant);
//		System.out.printf("Adicionado 1 ano......: %s%n", next_year_instant);
		System.out.printf("Adicionado 1 hora.....: %s%n", next_hours_instant);
		System.out.printf("Adicionado 1 minuto...: %s%n", next_minutes_instant);
		System.out.printf("Adicionado 1 segundo..: %s%n", next_seconds_instant);

		System.out.println();

		System.out.println("Duração entre datas");
		System.out.printf("Data..................: %s%n", past_week_localDate);
		System.out.printf("Data..................: %s%n", date_4);
		System.out.printf("Dias..................: %s%n", duration_1.toDays());

		System.out.println();

		System.out.println("Duração entre datas");
		System.out.printf("Data..................: %s%n", past_week_localDateTime);
		System.out.printf("Data..................: %s%n", date_5);
		System.out.printf("Dias..................: %s%n", duration_2.toDays());

		System.out.println();

		System.out.println("Duração entre datas");
		System.out.printf("Data..................: %s%n", past_week_instant);
		System.out.printf("Data..................: %s%n", date_6);
		System.out.printf("Dias..................: %s%n", duration_3.toDays());
		System.out.printf("Dias..................: %s%n", duration_4.toDays());
	}

}
