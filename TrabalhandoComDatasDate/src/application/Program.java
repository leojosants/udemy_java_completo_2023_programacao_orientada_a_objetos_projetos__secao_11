package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {

		// https://docs.oracle.com/javase/10/docs/api/java/util/Date.html
		// https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html

		SimpleDateFormat simple_date_format_1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat simple_date_format_2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		SimpleDateFormat simple_date_format_3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		simple_date_format_3.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		Date y1 = simple_date_format_1.parse("25/06/2018");
		Date y2 = simple_date_format_2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println("\n---------- Exibindo dados ----------");
		System.out.printf("x1..: %s%n", x1);
		System.out.printf("x2..: %s%n", x2);
		System.out.printf("x3..: %s%n", x3);
		System.out.printf("x4..: %s%n", x4);
		System.out.printf("y1..: %s%n", y1);
		System.out.printf("y2..: %s%n", y2);
		System.out.printf("y3..: %s%n", y3);

		System.out.println();

		System.out.printf("x1..: %s%n", simple_date_format_2.format(x1));
		System.out.printf("x2..: %s%n", simple_date_format_2.format(x2));
		System.out.printf("x3..: %s%n", simple_date_format_2.format(x3));
		System.out.printf("x4..: %s%n", simple_date_format_2.format(x4));
		System.out.printf("y1..: %s%n", simple_date_format_2.format(y1));
		System.out.printf("y2..: %s%n", simple_date_format_2.format(y2));
		System.out.printf("y3..: %s%n", simple_date_format_2.format(y3));

		System.out.println();

		System.out.println("x1..: " + simple_date_format_3.format(x1));
		System.out.println("x2..: " + simple_date_format_3.format(x2));
		System.out.println("x3..: " + simple_date_format_3.format(x3));
		System.out.println("x4..: " + simple_date_format_3.format(x4));
		System.out.println("y1..: " + simple_date_format_3.format(y1));
		System.out.println("y2..: " + simple_date_format_3.format(y2));
		System.out.println("y3..: " + simple_date_format_3.format(y3));
	}
}
